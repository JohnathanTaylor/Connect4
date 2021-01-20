package edu.citytech.games.c4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.citytech.games.c4.service.Connect4Service;

class TestColumn3 {
	@Test
	void test1() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 2);
		assertTrue(validPosition == 37, "validPosition: " + validPosition);

	}

	@Test
	void test2() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 2);
		assertTrue(validPosition == 30, "validPosition: " + validPosition);
	
	}

	@Test
	void test3() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 2);
		assertTrue(validPosition == 23, "validPosition: " + validPosition);
	
	}

	@Test
	void test4() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 2);
		assertTrue(validPosition == 16, "validPosition: " + validPosition);
	
	}

	@Test
	void test5() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 2);
		assertTrue(validPosition == 9, "validPosition: " + validPosition);
	
	}

	@Test
	void test6() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 2);
		assertTrue(validPosition == 2, "validPosition: " + validPosition);
	
	}

	@Test
	void test7() {
		String[] moves = {"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 2);
		assertTrue(validPosition == -1, "validPosition: " + validPosition);
	
	}
	
}
