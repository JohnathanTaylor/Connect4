package edu.citytech.games.c4.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import edu.citytech.games.c4.service.Connect4Service;

public class TestWinner_Row2 {

	@Test
	@DisplayName("Winning Combo is 7,8,9,10 ")
	public void test05() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==7 && validPosition[1]==8
				&& validPosition[2]==9 && validPosition[3]==10;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 7,8,9,10 ")
	public void test05B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==7 && validPosition[1]==8
				&& validPosition[2]==9 && validPosition[3]==10;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 8,9,10,11 ")
	public void test06() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==8 && validPosition[1]==9
				&& validPosition[2]==10 && validPosition[3]==11;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 8,9,10,11 ")
	public void test06B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==8 && validPosition[1]==9
				&& validPosition[2]==10 && validPosition[3]==11;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 9,10,11,12 ")
	public void test07() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==9 && validPosition[1]==10
				&& validPosition[2]==11 && validPosition[3]==12;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 9,10,11,12 ")
	public void test07B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==9 && validPosition[1]==10
				&& validPosition[2]==11 && validPosition[3]==12;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 10,11,12,13 ")
	public void test08() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==10 && validPosition[1]==11
				&& validPosition[2]==12 && validPosition[3]==13;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 10,11,12,13 ")
	public void test08B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==10 && validPosition[1]==11
				&& validPosition[2]==12 && validPosition[3]==13;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

}
