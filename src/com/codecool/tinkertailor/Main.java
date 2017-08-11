package com.codecool.tinkertailor;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

		TinkerTailor test1st = new TinkerTailor(10, 14);
		List result = test1st.Tinker1st();
		System.out.println("The result is: " + result + " via ArrayList");

		TinkerTailor test2nd = new TinkerTailor(10, 14);
		List finalResult = test2nd.Tinker2nd();
		System.out.println("The result is: " + finalResult + " via LinkedList");

		TinkerTailor test3rd = new TinkerTailor(10, 14);
		Set ultimateResult = test3rd.Tinker3rd();
		System.out.println("The result is: " + ultimateResult + " via LinkedHashSet");
	}
}
