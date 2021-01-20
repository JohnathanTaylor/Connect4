package edu.citytech.games.c4.test.winner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.games.c4.service.Connect4Service;

class TestWinner_Row4 {

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
	@DisplayName("Winning Position is 21, 22, 23, 24")
	void test13() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 21  && validPosition[1] == 22
				           && validPosition[2] == 23  && validPosition[3] == 24;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	

	@Test
	@DisplayName("Winning Position is 21, 22, 23, 24")
	void test13B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 21  && validPosition[1] == 22
				           && validPosition[2] == 23  && validPosition[3] == 24;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 22, 23, 24, 25")
	void test14() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 22  && validPosition[1] == 23
				           && validPosition[2] == 24  && validPosition[3] == 25;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 22, 23, 24, 25")
	void test14B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 22  && validPosition[1] == 23
				           && validPosition[2] == 24  && validPosition[3] == 25;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 23, 24, 25, 26")
	void test15() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 23  && validPosition[1] == 24
				           && validPosition[2] == 25  && validPosition[3] == 26;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 23, 24, 25, 26")
	void test15B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 23  && validPosition[1] == 24
				           && validPosition[2] == 25  && validPosition[3] == 26;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 24, 25, 26, 27")
	void test16() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 24  && validPosition[1] == 25
				           && validPosition[2] == 26  && validPosition[3] == 27;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 24, 25, 26, 27")
	void test16B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 24  && validPosition[1] == 25
				           && validPosition[2] == 26  && validPosition[3] == 27;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}

}
