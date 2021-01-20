package edu.citytech.games.c4.test.winner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.games.c4.service.Connect4Service;

class TestWinner_Row2 {

	@Test
	@DisplayName("No Winners")
	void test00() {
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
	@DisplayName("Winning Position is 7, 8, 9, 10")
	void test05() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 7  && validPosition[1] == 8
				           && validPosition[2] == 9  && validPosition[3] == 10;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position O is 7, 8, 9, 10")
	void test05B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 7  && validPosition[1] == 8
				           && validPosition[2] == 9  && validPosition[3] == 10;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 8, 9, 10, 11")
	void test06() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 8  && validPosition[1] == 9
				           && validPosition[2] == 10  && validPosition[3] == 11;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 8, 9, 10, 11")
	void test06B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 8  && validPosition[1] == 9
				           && validPosition[2] == 10  && validPosition[3] == 11;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 9, 10, 11, 12")
	void test07() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 9  && validPosition[1] == 10
				           && validPosition[2] == 11  && validPosition[3] == 12;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 9, 10, 11, 12")
	void test07B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 9  && validPosition[1] == 10
				           && validPosition[2] == 11  && validPosition[3] == 12;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 10, 11, 12, 13")
	void test08() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 10  && validPosition[1] == 11
				           && validPosition[2] == 12  && validPosition[3] == 13;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	
	@Test
	@DisplayName("Winning Position is 10, 11, 12, 13")
	void test08B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 10  && validPosition[1] == 11
				           && validPosition[2] == 12  && validPosition[3] == 13;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}


}
