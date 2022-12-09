package com.tech8.techtest.dlr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tech8.techtest.dlr.model.PairSumModel;

/**
 * Main class to executing the project from the jar file exported.
 * @author <a href=https://www.linkedin.com/in/daniellondonor86/>Daniel Londoño Ramírez</a>
 *
 */
public class PairSumsApp {

	public static void main(String[] args) {
		try{
			if(args.length == 0) {
				throw new Exception("Void arguments. \nPlease write any quantity of numbers comma separated, then a space followed by the target number.");
			}
			PairSums pairSums = new PairSums();
			String[] integersIn = args[0].split(",");
			Integer target = Integer.parseInt(args[1]);
			List<Integer> integerList = new ArrayList<>();
			Arrays.asList(integersIn).forEach(s -> integerList.add(Integer.parseInt(s)));
			List<PairSumModel> tuplesSumTarget = pairSums.pairSums(integerList, target);
			System.out.println(tuplesSumTarget);
		} catch (Exception ex) {
			System.err.print(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
