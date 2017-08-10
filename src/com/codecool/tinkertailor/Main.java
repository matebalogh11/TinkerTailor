package com.codecool.tinkertailor;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	    TinkerTailor tinkerTailor = new TinkerTailor(5, 3);
	    List outcome = tinkerTailor.execute();
	    System.out.println("The outcome of the game is: " + outcome);

		TinkerTest test1st = new TinkerTest(5, 3);
		List result = test1st.Tinker2nd();
		System.out.println("The result is: " + result + " Winner: " + result.get(result.size() - 1));

		TinkerTest2nd test2nd = new TinkerTest2nd(5, 3);
		List finalResult = test2nd.Tinker3rd();
		System.out.println("The result is: " + finalResult);
	}
}
