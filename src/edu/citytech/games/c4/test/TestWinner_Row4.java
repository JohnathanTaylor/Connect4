package edu.citytech.games.c4.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import edu.citytech.games.c4.service.Connect4Service;

public class TestWinner_Row4 {

	@Test
	@DisplayName("Winning Combo is 21,22,23,24 ")
	public void test13() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==21 && validPosition[1]==22
				&& validPosition[2]==23 && validPosition[3]==24;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 21,22,23,24 ")
	public void test13B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==21 && validPosition[1]==22
				&& validPosition[2]==23 && validPosition[3]==24;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 22,23,24,25 ")
	public void test14() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==22 && validPosition[1]==23
				&& validPosition[2]==24 && validPosition[3]==25;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 22,23,24,25 ")
	public void test14B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==22 && validPosition[1]==23
				&& validPosition[2]==24 && validPosition[3]==25;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 23,24,25,26 ")
	public void test15() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==23 && validPosition[1]==24
				&& validPosition[2]==25 && validPosition[3]==26;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 23,24,25,26 ")
	public void test15B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==23 && validPosition[1]==24
				&& validPosition[2]==25 && validPosition[3]==26;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 24,25,26,27 ")
	public void test16() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==24 && validPosition[1]==25
				&& validPosition[2]==26 && validPosition[3]==27;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 24,25,26,27 ")
	public void test16B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==24 && validPosition[1]==25
				&& validPosition[2]==26 && validPosition[3]==27;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

}
