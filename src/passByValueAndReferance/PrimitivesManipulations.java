package passByValueAndReferance;

public class PrimitivesManipulations {

	public PrimitivesManipulations() {

	}

	public void trigger() {
		int a = 10;
		{
			a = 11;
			System.out.println("int a = " + a);

			int modifiedA = modifyinteger(a);//pass by value since its a primitive

			System.out.println("after modifyInterger() -> int a = " + a);
			System.out.println("after modifyInterger() -> int modifiedA = " + modifiedA);
		}
		System.out.println("after {} scope -> int a = " + a);
		// System.out.println("after modifyInterger() -> int modifiedA = " +
		// modifiedA); //modifiedA cannot be resolved to a variable
	}

	private int modifyinteger(int a) {
		System.out.println("Enter modifyInterger()");
		a = 0;
		System.out.println("modified int a = " + a);
		System.out.println("Exiting  modifyInterger()");
		return a;
	}
}
