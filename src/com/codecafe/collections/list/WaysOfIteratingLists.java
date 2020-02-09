package com.codecafe.collections.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WaysOfIteratingLists {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Apple", "Bat", "Cat", "Dragon", "Area51");

		System.out.println("Iterating using normal for loop : ");
		for(int i=0; i<words.size(); i++) {
			System.out.println(words.get(i));
		}

		System.out.println("\nIterating using enhanced for loop : ");
		for(String word : words) {
			System.out.println(word);
		}

		Iterator<String> iterator = words.iterator();
		System.out.println("\nIterating using Iterator : ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nIterating using Lambda expression : ");
		words.forEach(word -> System.out.println(word));

		long count = words.stream()
				          .filter(word -> word.startsWith("A"))
				          .count();
		
		System.out.println("\nCount of words starting with A : "+count);
	}

}