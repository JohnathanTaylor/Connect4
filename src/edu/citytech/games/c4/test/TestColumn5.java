package edu.citytech.games.c4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.citytech.games.c4.service.Connect4Service;

class TestColumn5 {

	@Test
	void test1() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 4);
		assertTrue(validPosition == 39, "validPosition: " + validPosition);

	}
	
	@Test
	void test2() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","O","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 4);
		assertTrue(validPosition == 32, "validPosition: " + validPosition);

	}

	@Test
	void test3() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 4);
		assertTrue(validPosition == 25, "validPosition: " + validPosition);
	
	}

	@Test
	void test4() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 4);
		assertTrue(validPosition == 18, "validPosition: " + validPosition);
	
	}

	@Test
	void test5() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 4);
		assertTrue(validPosition == 11, "validPosition: " + validPosition);
	
	}

	@Test
	void test6() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 4);
		assertTrue(validPosition == 4, "validPosition: " + validPosition);
	
	}

	@Test
	void test7() {
		String[] moves = {"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","O","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 4);
		assertTrue(validPosition == -1, "validPosition: " + validPosition);
	
	}
}
