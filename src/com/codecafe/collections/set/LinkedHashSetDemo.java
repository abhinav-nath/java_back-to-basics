package com.codecafe.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Duplicates are not allowed
// Maintains a LinkedList of the entries in the set, in the order they were inserted
// Does not sort the elements in any way
// Order of elements is guaranteed (in the order of insertion)
// null is allowed
public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> words = new LinkedHashSet<>();

		words.add("Apple");
		words.add("Book");
		words.add("Cat");
		words.add("Apple");
		words.add("Cat");
		words.add("Dragon");
		words.add("Elephant");
		words.add("Fish");
		words.add("Goat");
		words.add("Hollywood");
		words.add("India");
		words.add("Joker");
		

		System.out.println("Iterating using enhanced for loop : ");
		for(String word : words) {
			System.out.println(word);
		}

		Iterator<String> iterator = words.iterator();
		System.out.println("\nIterating using Iterator : ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nIterating using lambda expression : ");
		words.forEach(word -> System.out.println(word));

		long count = words.stream()
				.filter(word -> word.startsWith("A"))
				.count();

		System.out.println("\nCount of words starting with A : "+count);

	}

}