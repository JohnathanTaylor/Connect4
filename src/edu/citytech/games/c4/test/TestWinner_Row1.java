package edu.citytech.games.c4.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import edu.citytech.games.c4.service.Connect4Service;

public class TestWinner_Row1 {
	@Test
	@DisplayName("No Winners")
	public void test00() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		assertTrue(validPosition.length == 0, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 2,3,4,5 ")
	public void test03B() {
		String[] moves = {"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==2 && validPosition[1]==3
				&& validPosition[2]==4 && validPosition[3]==5;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 1,2,3,4 ")
	public void test02B() {
		String[] moves = {"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==1 && validPosition[1]==2
				&& validPosition[2]==3 && validPosition[3]==4;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 0,1,2,3 ")
	public void test01() {
		String[] moves = {"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==0 && validPosition[1]==1 
				&& validPosition[2]==2 && validPosition[3]==3;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Combo is 0,1,2,3 ")
	public void test01B() {
		String[] moves = {"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==0 && validPosition[1]==1 
				&& validPosition[2]==2 && validPosition[3]==3;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 1,2,3,4 ")
	public void test02() {
		String[] moves = {"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==1 && validPosition[1]==2
				&& validPosition[2]==3 && validPosition[3]==4;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 2,3,4,5 ")
	public void test03() {
		String[] moves = {"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==2 && validPosition[1]==3
				&& validPosition[2]==4 && validPosition[3]==5;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 3,4,5,6 ")
	public void test04() {
		String[] moves = {"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==3 && validPosition[1]==4
				&& validPosition[2]==5 && validPosition[3]==6;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 3,4,5,6 ")
	public void test04B() {
		String[] moves = {"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==3 && validPosition[1]==4
				&& validPosition[2]==5 && validPosition[3]==6;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}
}
