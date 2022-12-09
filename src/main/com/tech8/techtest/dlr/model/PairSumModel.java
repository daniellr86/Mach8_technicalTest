package com.tech8.techtest.dlr.model;

/**
 * This represents the number pair that sums the number target of the problem.
 * @author <a href=https://www.linkedin.com/in/daniellondonor86/>Daniel Londoño Ramírez</a>
 *
 */
public class PairSumModel {

	private int num1;
	private int num2;
	
	/**
	 * Create an instance from the class, with the pair of numbers sent.
	 * @param numberOne
	 * @param numberTwo
	 */
	public PairSumModel(Integer numberOne, int numberTwo) {
		num1 = numberOne;
		num2 = numberTwo;
	}

	@Override
	public String toString() {
		return "\n[" + num1 + ", " + num2 + "]";
	}
	
	@Override
	public boolean equals(Object pairSumObj) {
		if(pairSumObj.getClass() != PairSumModel.class) {
			return false;
		}
		PairSumModel pairSumInst = (PairSumModel) pairSumObj;
		boolean isEqual = (this.num1 == pairSumInst.num1 && this.num2 == pairSumInst.num2) || (this.num1 == pairSumInst.num2 && this.num2 == pairSumInst.num1);
		return isEqual;
	}
}
