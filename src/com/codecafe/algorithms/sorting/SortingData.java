package com.codecafe.algorithms.sorting;

import java.util.List;
import java.util.Map;

public class SortingData {

	private int[] randomNumbers;
	private int[] bestCaseData;
	private int[] worstCaseData;
	private boolean isTestMode;
	private Map<Integer, List<Integer>> testDataMap;
	
	public int[] getRandomNumbers() {
		return randomNumbers;
	}
	
	public void setRandomNumbers(int[] randomNumbers) {
		this.randomNumbers = randomNumbers;
	}
	
	public int[] getBestCaseData() {
		return bestCaseData;
	}
	
	public void setBestCaseData(int[] bestCaseData) {
		this.bestCaseData = bestCaseData;
	}
	
	public int[] getWorstCaseData() {
		return worstCaseData;
	}
	
	public void setWorstCaseData(int[] worstCaseData) {
		this.worstCaseData = worstCaseData;
	}
	
	public boolean isTestMode() {
		return isTestMode;
	}
	
	public void setTestMode(boolean isTestMode) {
		this.isTestMode = isTestMode;
	}
	
	public Map<Integer, List<Integer>> getTestDataMap() {
		return testDataMap;
	}
	
	public void setTestDataMap(Map<Integer, List<Integer>> testDataMap) {
		this.testDataMap = testDataMap;
	}
	
}