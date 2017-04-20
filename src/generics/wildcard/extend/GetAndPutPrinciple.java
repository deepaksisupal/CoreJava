package generics.wildcard.extend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GetAndPutPrinciple {

	/**
	 * It may be a good practice to use wild cards wherever possible;
	 * But how do you decide which wild card to use? i.e, where to use extends and where to use super?
	 * 
	 * get and put principle comes to your rescue!
	 * 
	 * <em>The Get And Put Principle </em>
	 * T
	 * Use extends when you only want to get values out of a structure;
	 * Use super when you only want to put values into a structure;
	 * 
	 * Don't use any wild card when you want to do both!
	 * 
	 * e.g. : public static <T> void copy(List<? super T> dest, List<? extends T> src) 
	          (in java.util.Collections) 
	 * **/
	public static void main(String[] args) {
		// about extends
		List<Integer> ints = Arrays.asList(1,2,3);
		System.out.println(sum(ints));
		assert sum(ints) == 6.0;
		
		List<Double> doubles = Arrays.asList(1D,2.75,3.25);
		System.out.println(sum(doubles));
		assert sum(doubles) == 7.0;
		
		List<Number> nums = Arrays.asList(1D,2L,3.9);
		System.out.println(sum(nums));
		assert sum(nums) == 6.0;

	}
	
	//extends
	public static double sum(Collection<? extends Number> nums){
		double s = 0.0;
		for (Number num : nums){
			s += num.doubleValue();
		}
		return s;
	}
	
	//super
	

}
