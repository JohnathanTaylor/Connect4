package edu.citytech.games.c4.test.winner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.games.c4.service.Connect4Service;

class TestWinner_Row3 {


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
	@DisplayName("Winning Position is 14, 15, 16, 17")
	void test09() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 14  && validPosition[1] == 15
				           && validPosition[2] == 16  && validPosition[3] == 17;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 14, 15, 16, 17")
	void test09B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 14  && validPosition[1] == 15
				           && validPosition[2] == 16  && validPosition[3] == 17;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 15, 16, 17, 18")
	void test10() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 15  && validPosition[1] == 16
				           && validPosition[2] == 17  && validPosition[3] == 18;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 15, 16, 17, 18")
	void test10B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 15  && validPosition[1] == 16
				           && validPosition[2] == 17  && validPosition[3] == 18;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 16, 17, 18, 19")
	void test11() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 16  && validPosition[1] == 17
				           && validPosition[2] == 18  && validPosition[3] == 19;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 16, 17, 18, 19")
	void test11B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 16  && validPosition[1] == 17
				           && validPosition[2] == 18  && validPosition[3] == 19;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	
	@Test
	@DisplayName("Winning Position is 17, 18, 19, 20")
	void test12() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 17  && validPosition[1] == 18
				           && validPosition[2] == 19  && validPosition[3] == 20;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}
	
	@Test
	@DisplayName("Winning Position is 17, 18, 19, 20")
	void test12B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		
		boolean condition1 =  validPosition.length == 4;
		boolean condition2 =  validPosition[0] == 17  && validPosition[1] == 18
				           && validPosition[2] == 19  && validPosition[3] == 20;
		
		boolean status = condition1 && condition2;
		
		assertTrue(status, "validPosition: " + validPosition);
		
	}

}
