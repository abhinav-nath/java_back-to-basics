package com.codecafe.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

// Duplicates are not allowed
// Uses Tree for storage
// Objects are stored in sorted, ascending order
// Access and Retrieval times are quite fast
// TreeSet is an excellent choice  when storing large amounts of sorted information that must be found quickly !
// Order of elements is guaranteed (in the order of insertion)
// null is allowed
public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> words = new TreeSet<>();

		words.add("Hollywood");
		words.add("Apple");
		words.add("Elephant");
		words.add("Book");
		words.add("Dragon");
		words.add("India");
		words.add("Cat");
		words.add("Apple");
		words.add("Joker");
		words.add("Cat");
		words.add("Goat");
		words.add("Fish");

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
		
		// need to do TreeSet<String> words = new TreeSet<>(); instead of
		// Set<String> words = new TreeSet<>();
		// in order to use the subSet() method of TreeSet
		System.out.println("\nElements between Book (inclusive) and Joker (exclusive) : "+words.subSet("Book", "Joker"));

		long count = words.stream()
				.filter(word -> word.startsWith("A"))
				.count();

		System.out.println("\nCount of words starting with A : "+count);

	}

}