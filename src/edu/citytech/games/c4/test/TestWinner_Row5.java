package edu.citytech.games.c4.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import edu.citytech.games.c4.service.Connect4Service;

public class TestWinner_Row5 {

	@Test
	@DisplayName("Winning Combo is 28,29,30,31 ")
	public void test17() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==28 && validPosition[1]==29
				&& validPosition[2]==30 && validPosition[3]==31;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 28,29,30,31 ")
	public void test17B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==28 && validPosition[1]==29
				&& validPosition[2]==30 && validPosition[3]==31;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 29,30,31,32 ")
	public void test18() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==29 && validPosition[1]==30
				&& validPosition[2]==31 && validPosition[3]==32;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 29,30,31,32 ")
	public void test18B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==29 && validPosition[1]==30
				&& validPosition[2]==31 && validPosition[3]==32;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 30,31,32,33 ")
	public void test19() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==30 && validPosition[1]==31
				&& validPosition[2]==32 && validPosition[3]==33;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 30,31,32,33 ")
	public void test19B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==30 && validPosition[1]==31
				&& validPosition[2]==32 && validPosition[3]==33;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 31,32,33,34 ")
	public void test20() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==31 && validPosition[1]==32
				&& validPosition[2]==33 && validPosition[3]==34;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

	@Test
	@DisplayName("Winning Combo is 31,32,33,34 ")
	public void test20B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length==4;
		boolean cond2= validPosition[0]==31 && validPosition[1]==32
				&& validPosition[2]==33 && validPosition[3]==34;
		
		assertTrue(cond1 && cond2, "validPosition: " + validPosition);
		
	}

}
