package com.codecafe.algorithms.sorting;

import com.codecafe.algorithms.utils.GeneralUtils;

public class InsertionSort {

	public static void main(String[] args) {

		SortingData sortingData = GeneralUtils.prepareSortingData();

		if(!sortingData.isTestMode()) {
			System.out.println("\n---------------\nRandom Numbers\n---------------");
			if(GeneralUtils.numOfElements <= 500) {
				System.out.println("Unsorted elements : ");
				for(int i=0; i<GeneralUtils.numOfElements; i++) {
					System.out.print(sortingData.getRandomNumbers()[i]+" ");
				}
			}
			insertionSort(sortingData.getRandomNumbers());

			if(sortingData.getBestCaseData() != null && sortingData.getBestCaseData().length > 0) {
				System.out.println("\n---------------\nBest Case\n---------------");
				if(GeneralUtils.numOfElements <= 500) {
					System.out.println("Unsorted elements : ");
					for(int i=0; i<GeneralUtils.numOfElements; i++) {
						System.out.print(sortingData.getBestCaseData()[i]+" ");
					}
				}
				insertionSort(sortingData.getBestCaseData());
			}

			if(sortingData.getWorstCaseData() != null && sortingData.getWorstCaseData().length > 0) {
				System.out.println("\n---------------\nWorst Case\n---------------");
				if(GeneralUtils.numOfElements <= 500) {
					System.out.println("Unsorted elements : ");
					for(int i=0; i<GeneralUtils.numOfElements; i++) {
						System.out.print(sortingData.getWorstCaseData()[i]+" ");
					}
				}
				insertionSort(sortingData.getWorstCaseData());
			}
		} else {
			if(sortingData.getTestDataMap() != null) {
				int c = 0;
				for(Integer key : sortingData.getTestDataMap().keySet()) {
					c++;
					System.out.printf("\nTest #%d with %d elements", c, sortingData.getTestDataMap().get(key).size());
					insertionSort(sortingData.getTestDataMap().get(key).stream().mapToInt(i -> i).toArray());
				}
			}
		}

	}


	private static void insertionSort(int[] elements) {

		int n = elements.length;

		long startTime = System.nanoTime();
		// start
		for (int i=1; i<n; i++) { 
	        int key = elements[i]; 
	        int j = i-1;
	        while (j >= 0 && elements[j] > key) {
	            elements[j+1] = elements[j];
	            j = j-1;
	        }
	        elements[j+1] = key; 
	    }
		// end
		long executionTime = System.nanoTime() - startTime;

		if(elements.length <= 500) {
			System.out.println("\n\nSorted elements : ");
			for(int i=0; i<n; i++) {
				System.out.print(elements[i]+" ");
			}
		}

		System.out.printf("\n\nExcecution Time : %s nanoseconds", executionTime);
		System.out.printf("\nExcecution Time : %s milliseconds\n", (float)executionTime/1000000);
	}

}