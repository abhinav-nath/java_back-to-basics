package com.codecafe.algorithms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.codecafe.algorithms.sorting.SortingData;

public class GeneralUtils {

	public static int numOfElements = 0;

	public static SortingData prepareSortingData() {

		SortingData sortingData = new SortingData();

		Scanner sc = new Scanner(System.in);

		int randomNumbers[], bestCaseData[], worstCaseData[];

		System.out.println("1. Manual mode\n2. Auto mode\n3. Run on Preset Test Data");
		int mode = sc.nextInt();

		switch(mode) {
		case 1:
			System.out.println("Enter number of elements to sort : ");
			numOfElements = sc.nextInt();

			randomNumbers = new int[numOfElements];

			for(int i=0; i<numOfElements; i++) {
				System.out.println("Enter a number : ");
				randomNumbers[i] = sc.nextInt();
			}
			sortingData.setRandomNumbers(randomNumbers);
			sc.close();
			break;

		case 2:
			System.out.println("Working in auto mode");

			System.out.println("Enter number of elements to sort : ");
			numOfElements = sc.nextInt();

			Random random = new Random();
			List<Integer> distinctNumberList = new ArrayList<>();
			while(distinctNumberList.size() < numOfElements) {
				int rand = random.nextInt(numOfElements+1);

				if(distinctNumberList.contains(rand)) {
					//System.out.println("skip "+rand);
				} else {
					distinctNumberList.add(rand);
				}
			}

			randomNumbers = distinctNumberList.stream().mapToInt(i -> i).toArray();
			sortingData.setRandomNumbers(randomNumbers);

			int j = numOfElements;
			worstCaseData = new int[numOfElements];
			for(int i=0; i<numOfElements; i++) {
				worstCaseData[i] = j;
				j--;
			}
			sortingData.setWorstCaseData(worstCaseData);

			bestCaseData = new int[numOfElements];
			for(int i=0; i<numOfElements; i++) {
				bestCaseData[i] = i;
			}
			sortingData.setBestCaseData(bestCaseData);
			break;

		default:
			sortingData.setTestMode(true);

			List<String> testFiles = null;
			try (Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\Abhinav\\git\\java-programs\\src\\com\\codecafe\\algorithms\\sorting"))) {

				testFiles = walk.map(x -> x.toString())
						.filter(f -> f.contains("testdata_"))
						.collect(Collectors.toList());

				testFiles.forEach(System.out::println);

			} catch (IOException e) {
				e.printStackTrace();
			}

			FileInputStream inputStream = null;
			Scanner scanner = null;
			int counter = 0;
			for(String testFile : testFiles) {
				List<Integer> dataList = new ArrayList<>();
				try {
					inputStream = new FileInputStream(testFile);
					scanner = new Scanner(inputStream);
					while (scanner.hasNextLine()) {
						dataList.add(Integer.parseInt(scanner.nextLine()));
					}
					// note that Scanner suppresses exceptions
					if (scanner.ioException() != null) {
						throw scanner.ioException();
					}

					if(sortingData.getTestDataMap() == null)
						sortingData.setTestDataMap(new HashMap<Integer, List<Integer>>());

					counter++;
					sortingData.getTestDataMap().put(counter, dataList);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (inputStream != null) {
						try {
							inputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (scanner != null) {
						scanner.close();
					}
				}
			}	
		}

		return sortingData;
	}
}