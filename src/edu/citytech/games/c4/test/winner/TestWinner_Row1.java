package edu.citytech.games.c4.test.winner;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.games.c4.service.Connect4Service;

class TestWinner_Row1 {
	
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
		@DisplayName("Winning Position is 0, 1, 2, 3")
		void test01() {
			String[] moves = {"X","X","X","X","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int[] validPosition = Connect4Service.getWinner(moves);
			
			boolean condition1 =  validPosition.length == 4;
			boolean condition2 =  validPosition[0] == 0  && validPosition[1] == 1
					           && validPosition[2] == 2  && validPosition[3] == 3;
			
			boolean status = condition1 && condition2;
			
			assertTrue(status, "validPosition: " + validPosition);
			
		}
		
		@Test
		@DisplayName("Winning Position is 0, 1, 2, 3")
		void test01B() {
			String[] moves = {"O","O","O","O","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int[] validPosition = Connect4Service.getWinner(moves);
			
			boolean condition1 =  validPosition.length == 4;
			boolean condition2 =  validPosition[0] == 0  && validPosition[1] == 1
					           && validPosition[2] == 2  && validPosition[3] == 3;
			
			boolean status = condition1 && condition2;
			
			assertTrue(status, "validPosition: " + validPosition);
			
		}
		
		
		@Test
		@DisplayName("Winning Position is 1, 2, 3, 4 ")
		void test02() {
			String[] moves = {"?","X","X","X","X","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int[] validPosition = Connect4Service.getWinner(moves);
			
			boolean condition1 =  validPosition.length == 4;
			boolean condition2 =  validPosition[0] == 1  && validPosition[1] == 2
					           && validPosition[2] == 3  && validPosition[3] == 4;
			
			boolean status = condition1 && condition2;
			
			assertTrue(status, "validPosition: " + validPosition);
			
		}
		
		@Test
		@DisplayName("Winning Position is 1, 2, 3, 4 ")
		void test02B() {
			String[] moves = {"?","O","O","O","O","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int[] validPosition = Connect4Service.getWinner(moves);
			
			boolean condition1 =  validPosition.length == 4;
			boolean condition2 =  validPosition[0] == 1  && validPosition[1] == 2
					           && validPosition[2] == 3  && validPosition[3] == 4;
			
			boolean status = condition1 && condition2;
			
			assertTrue(status, "validPosition: " + validPosition);
			
		}

		@Test
		@DisplayName("Winning Position is 2, 3, 4, 5 ")
		void test03() {
			String[] moves = {"?","?","X","X","X","X","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int[] validPosition = Connect4Service.getWinner(moves);
			
			boolean condition1 =  validPosition.length == 4;
			boolean condition2 =  validPosition[0] == 2  && validPosition[1] == 3
					           && validPosition[2] == 4  && validPosition[3] == 5;
			
			boolean status = condition1 && condition2;
			
			assertTrue(status, "validPosition: " + validPosition);
			
		}

		@Test
		@DisplayName("Winning Position is 2, 3, 4, 5 ")
		void test03B() {
			String[] moves = {"?","?","O","O","O","O","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int[] validPosition = Connect4Service.getWinner(moves);
			
			boolean condition1 =  validPosition.length == 4;
			boolean condition2 =  validPosition[0] == 2  && validPosition[1] == 3
					           && validPosition[2] == 4  && validPosition[3] == 5;
			
			boolean status = condition1 && condition2;
			
			assertTrue(status, "validPosition: " + validPosition);
			
		}
		
		@Test
		@DisplayName("Winning Position is 3, 4, 5, 6")
		void test04() {
			String[] moves = {"?","?","X","X","X","X","X"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int[] validPosition = Connect4Service.getWinner(moves);
			
			boolean condition1 =  validPosition.length == 4;
			boolean condition2 =  validPosition[0] == 3  && validPosition[1] == 4
					           && validPosition[2] == 5  && validPosition[3] == 6;
			
			boolean status = condition1 && condition2;
			
			assertTrue(status, "validPosition: " + validPosition);
			
		}


		@Test
		@DisplayName("Winning Position O is 3, 4, 5, 6")
		void test04B() {
			String[] moves = {"?","?","?","O","O","O","O"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int[] validPosition = Connect4Service.getWinner(moves);
			
			boolean condition1 =  validPosition.length == 4;
			boolean condition2 =  validPosition[0] == 3  && validPosition[1] == 4
					           && validPosition[2] == 5  && validPosition[3] == 6;
			
			boolean status = condition1 && condition2;
			
			assertTrue(status, "validPosition: " + validPosition);
			
		}

	
	

	

	}
