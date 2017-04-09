package generics.wildcard.extend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Extends {

	public static void main(String[] args){
		
		List<Integer> ints = Arrays.asList(1,2,3);
		List<? extends Number> nums = ints;
		//nums.add(3);
		
		List<List> listOfMixedTypes = new ArrayList<>();

		ArrayList<String> listOfStrings = new ArrayList<String>();
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfStrings.add("Hello");
		listOfIntegers.add(100);
		listOfMixedTypes.add(listOfStrings);
		listOfMixedTypes.add(listOfIntegers);
		System.out.println(listOfMixedTypes);
	}
}
