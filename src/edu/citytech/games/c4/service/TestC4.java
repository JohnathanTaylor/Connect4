package edu.citytech.games.c4.service;

import com.jbbwebsolutions.connect4.Connect4GradeCalculator;

public class TestC4 {

	public static void main(String[] args) {
		Object o = Connect4GradeCalculator.check(Connect4Service::getWinner, "/school/Taylor.Johnathan");
		
		System.out.println(o);
	}

}
