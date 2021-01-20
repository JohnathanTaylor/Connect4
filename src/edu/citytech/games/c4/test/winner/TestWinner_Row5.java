package edu.citytech.games.c4.test.winner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.games.c4.service.Connect4Service;

class TestWinner_Row5 {

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
	@DisplayName("Winning Position is 28, 29, 30, 31")
	void test17() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 28  && validPosition[1] == 29
				           && validPosition[2] == 30  && validPosition[3] == 31;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 28, 29, 30, 31")
	void test17B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 28  && validPosition[1] == 29
				           && validPosition[2] == 30  && validPosition[3] == 31;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 29, 30, 31, 32")
	void test18() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 29  && validPosition[1] == 30
				           && validPosition[2] == 31  && validPosition[3] == 32;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 29, 30, 31, 32")
	void test18B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 29  && validPosition[1] == 30
				           && validPosition[2] == 31  && validPosition[3] == 32;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 30, 31, 32, 33")
	void test19() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 30  && validPosition[1] == 31
				           && validPosition[2] == 32  && validPosition[3] == 33;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 30, 31, 32, 33")
	void test19B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 30  && validPosition[1] == 31
				           && validPosition[2] == 32  && validPosition[3] == 33;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 31, 32, 33, 34")
	void test20() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 31  && validPosition[1] == 32
				           && validPosition[2] == 33  && validPosition[3] == 34;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 31, 32, 33, 34")
	void test20B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 31  && validPosition[1] == 32
				           && validPosition[2] == 33  && validPosition[3] == 34;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}

}
