package com.codecool.tinkertailor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

/*	    TinkerTailor tinkerTailor = new TinkerTailor(5, 3);
	    List outcome = tinkerTailor.execute();
	    System.out.println("The outcome of the game is: " + outcome);*/

		TinkerTest testyke = new TinkerTest(5, 8);
		List result = testyke.Tinker2nd();
		System.out.println("The final result is: " + result + " Winner: " + result.get(result.size() - 1));
	}
}
