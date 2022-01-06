package com.hcl.concepts;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaPractice {

	public static void lambda(ArrayList<Integer> numbers) {
		Consumer<Integer> method = (n) -> {
			System.out.println(n * 3);
		};
		numbers.forEach(method);
	}
}
