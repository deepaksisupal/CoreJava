package passByValueAndReferance;

public class ArrayManipulations {

	/**
	 * Java is always pass-by-value. 
	 * Everything in Java are passed-by value.. In case of Array(Which is
	 * nothing but an Object), array reference is passed by value.. (Just like
	 * an object reference is passed by value)..
	 * 
	 * When you pass an array to other method, actually the reference to that
	 * array is copied..
	 * 
	 * Any changes in the content of array through that reference will affect
	 * the original array.. But changing the reference to point to a new array
	 * will not change the existing reference in original method..
	 **/
	public void trigger() {
		System.out.println("Arrays modify by referance (array reference is passed by value):");
		String[] stringArray = { "ABC", "CDEF" };
		System.out.println("stringArray before Reference modification : " + java.util.Arrays.asList(stringArray));
		String[] stringArrayModified = modifyArrayByReference(stringArray);
		System.out.println("stringArray after Reference modification : " + java.util.Arrays.asList(stringArray));
		System.out.println();

		System.out.println("Arrays modify by Value (array reference is passed by value):");
		String[] stringArray2 = { "ABC", "CDEF" };
		System.out.println("stringArray before Value modification : " + java.util.Arrays.asList(stringArray2));
		String[] stringArrayModified2 = modifyArrayByValue(stringArray2);
		System.out.println("stringArray after Value modification : " + java.util.Arrays.asList(stringArray2));
		System.out.println();
	}

	private String[] modifyArrayByValue(String[] stringArray) {
		stringArray[0] = "XYZ";
		stringArray[1] = "MNOP";
		return stringArray;
	}

	private String[] modifyArrayByReference(String[] stringArray) {//stringArray is local here
		// stringArray = {"123","4567"};//Compile Error: Array constants can only
		// be used in initializers
		String[] s = { "123", "4567" };
		stringArray = s;//local reference (copy of parent) is replaced. So parent is intact
		System.out.println("stringArray in modifyArray : " + java.util.Arrays.asList(stringArray));
		return stringArray;
	}
}
