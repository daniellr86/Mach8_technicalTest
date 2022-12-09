package com.tech8.techtest.dlr;

import java.util.ArrayList;
import java.util.List;

import com.tech8.techtest.dlr.model.PairSumModel;

/**
 * This contains the algorithms needed to the execution of the application.
 * @author <a href=https://www.linkedin.com/in/daniellondonor86/>Daniel Londoño Ramírez</a>
 *
 */
public class PairSums {
	
	/**
	 * 
	 * @param values is a list with all the numbers between it going to search the pairs that added result in target value. 
	 * @param target the value that is going looking for the result of sums pairs.
	 * @return a list of <code>{@link PairSumModel}</code> with all the pairs of numbers which sum result in <code>target</code> 
	 */
	public List<PairSumModel> pairSums(List<Integer> values, Integer target) {
		int difference = 0;																//1
		int searchStartIndex = 1;														//1
		List<PairSumModel> pairSums = new ArrayList<>();								//1
		for(int i = 0; i<values.size()-1; i++) {										//n-1
			Integer item = values.get(i);												//n-1
			difference = target - item;													//n-1
			if(values.subList(searchStartIndex, values.size()).contains(difference)) { 	//(n-1)+(n-1) --> the contains method of List class has a complexity time execution of O(n) 
				pairSums.add(new PairSumModel(item, difference));						//n-1
			}
			searchStartIndex++;															//n-1
		}
		return pairSums;																//1
	}																					// total: 3+5(n+1)+(n2-2n+1) = n^2+3n+9 => O(n^2)
}
