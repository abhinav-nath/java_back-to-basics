package com.codecafe.algorithms.searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		

	}

	public static boolean binarySearch(int arr[], int numberToFind) {  

		int first = 0;
		int last = arr.length-1;

		int mid = (first + last)/2;  
		while(first <= last) {
			if (arr[mid] < numberToFind) {  
				first = mid + 1;     
			} else if (arr[mid] == numberToFind) {
				System.out.println(numberToFind+" is found at index : " + mid);
				return true;  
			} else{
				last = mid - 1;  
			}
			mid = (first + last)/2;  
		}
		
		System.out.println("Element is not found!");
		return false;  
	}  
}
