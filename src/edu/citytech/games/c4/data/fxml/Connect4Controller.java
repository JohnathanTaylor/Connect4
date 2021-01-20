package edu.citytech.games.c4.data.fxml;

import java.net.URL;

import java.util.Date;
import java.util.ResourceBundle;

import edu.citytech.games.c4.service.Connect4Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class Connect4Controller implements Initializable {

//    @FXML
//    private FlowPane fpLayout;

	@FXML
	private Label lblTitle;

	@FXML
	private GridPane gpLayout;

	@FXML
	private Button btnReset;

	@FXML
	private AnchorPane apLayout;

	@FXML
	private Label lblMessage;

	@Override
	public void initialize(URL url, ResourceBundle resource) {
		int i = 0;
		for (int row = 0; row <= 5; row++)
			for (int column = 0; column <= 6; column++) {
				Label l = new Label("?");
				labels[i] = l;
				l.getStyleClass().add("custom-label");
				l.setUserData(i);
				l.setOnMouseClicked((MouseEvent e) -> this.clickedEvent(e));
				gpLayout.add(l, column, row);
				i++;

			}
	}

	private boolean isX = true;

	private void clickedEvent(MouseEvent e) {
		Label l = (Label) e.getSource();
		if (!l.getText().equals("?")) {
			lblMessage.setText("Invalid move as of " + new Date());
			return;

		}

		String xOrO = "";
		if (isX) {
			xOrO = "X";
		} else {
			xOrO = "O";
		}
		isX = !isX;
		l.setText(xOrO);

		String[] moves = new String[42];

		for (int i = 0; i < labels.length; i++) {
			moves[i] = labels[i].getText();
		}

		int cellNumber = (int) l.getUserData();
		String newMove = l.getText();
		l.setText("?");

		moves[cellNumber] = "?";

		int nextMove = Connect4Service.getValidCellMoves(moves, cellNumber);

		if (nextMove == -1) {
			return;
		}

		labels[nextMove].setText(newMove);

		labels[nextMove].getStyleClass().add(xOrO);

		int[] winningCombo = Connect4Service.getWinner(moves);

		if (winningCombo.length == 4) {
			lblMessage.setText("We have a winner!");
			labels[winningCombo[0]].getStyleClass().add("winner");
			labels[winningCombo[1]].getStyleClass().add("winner");
			labels[winningCombo[2]].getStyleClass().add("winner");
			labels[winningCombo[3]].getStyleClass().add("winner");

		} else {
			lblMessage.setText(
					"current index is " + cellNumber + "next valid move is " + nextMove + "clicked on " + new Date());
		}
	}

	private Label[] labels = new Label[42];

	@FXML
	void gameReset(ActionEvent event) {
		for (Label label : labels) {
			label.setText("?");
			label.getStyleClass().removeIf(e -> e.equals("X") || e.equals("O"));
		}
		isX = true;
		lblMessage.setText("");
	}

}
