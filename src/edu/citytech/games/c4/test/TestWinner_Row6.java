package edu.citytech.games.c4.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import edu.citytech.games.c4.service.Connect4Service;

public class TestWinner_Row6 {

	@Test
	@DisplayName("Winning Combo is 35,36,37,38 ")
	public void test21() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==35 && validPosition[1]==36
				&& validPosition[2]==37 && validPosition[3]==38;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 35,36,37,38 ")
	public void test21B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==35 && validPosition[1]==36
				&& validPosition[2]==37 && validPosition[3]==38;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 36,37,38,39 ")
	public void test22() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==36 && validPosition[1]==37
				&& validPosition[2]==38 && validPosition[3]==39;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 36,37,38,39 ")
	public void test22B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==36 && validPosition[1]==37
				&& validPosition[2]==38 && validPosition[3]==39;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 37,38,39,40 ")
	public void test23() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==37 && validPosition[1]==38
				&& validPosition[2]==39 && validPosition[3]==40;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 37,38,39,40 ")
	public void test23B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==37 && validPosition[1]==38
				&& validPosition[2]==39 && validPosition[3]==40;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 38,39,40,41 ")
	public void test24() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==38 && validPosition[1]==39
				&& validPosition[2]==40 && validPosition[3]==41;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 38,39,40,41 ")
	public void test24B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==38 && validPosition[1]==39
				&& validPosition[2]==40 && validPosition[3]==41;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

}
