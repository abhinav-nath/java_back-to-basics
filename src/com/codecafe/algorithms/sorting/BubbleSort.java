package com.codecafe.algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements to sort : ");
		int numOfElements = sc.nextInt();

		int elements[] = new int[numOfElements];

		for(int i=0; i<numOfElements; i++) {
			System.out.println("Enter a number : ");
			elements[i] = sc.nextInt();
		}

		System.out.println("Unsorted elements : ");
		for(int i=0; i<numOfElements; i++) {
			System.out.print(elements[i]+" ");
		}

		bubbleSort(elements);
	}

	private static void bubbleSort(int[] elements) {

		int n = elements.length;
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				if(elements[j-1] > elements[j]) {
					int temp = elements[j-1];
					elements[j-1] = elements[j];
					elements[j] = temp;
				}
			}
		}

		System.out.println("\nSorted elements : ");
		for(int i=0; i<n; i++) {
			System.out.print(elements[i]+" ");
		}
	}

}
