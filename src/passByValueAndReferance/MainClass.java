package passByValueAndReferance;

public class MainClass {

	public MainClass() {
	}

	public static void main(String[] args) {
		new PrimitivesManipulations().trigger();
		System.out.println("-------------Primitives Ends--------------");
		System.out.println("-------------Referance Starts--------------");
		new ArrayManipulations().trigger();
		new EmployeeManipulations().trigger();
	}

}
