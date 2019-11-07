package org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,3,5,7);

	System.out.println(list.stream()
			.filter(x -> x%2 == 0)
			.map(x -> x*2)
			.findFirst()
			.orElse(0));
}
	
	
}

