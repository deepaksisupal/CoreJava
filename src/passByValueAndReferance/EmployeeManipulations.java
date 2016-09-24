package passByValueAndReferance;

public class EmployeeManipulations {

	/**
	 * Java is always pass-by-value. Unfortunately, they decided to call
	 * pointers references, thus confusing newbies. Because those references are
	 * passed by value.
	 * 
	 * http://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
	 **/
	public void trigger() {
		System.out.println("Harcore Object (Employee) modifications :");
		Employee emp = new Employee("FirstEmployee", 1);
		System.out.println(
				"Employee before modification by changing value insite the one and ony onject" + emp.toString());
		Employee modifiedEmployee = mofifyEmployeesValue(emp);
		System.out.println(
				"Employee after modification by changing value inside the one and ony onject" + emp.toString());

		Employee emp2 = new Employee("BadEmployee", 1);
		System.out.println(
				"Employee before modification by changing reference inside the initial object" + emp2.toString());
		Employee modifiedEmployee2 = mofifyEmployeesReferance(emp2);
		System.out.println(
				"Employee after modification by changing value insite the one and ony onject" + emp2.toString());
	}

	// This won't. It will change only the local employee
	private Employee mofifyEmployeesReferance(Employee emp2) {
		Employee emp = new Employee("GoodEmployee", 2);
		emp2 = emp;
		return emp2;
	}

	// This will change the original employee
	private Employee mofifyEmployeesValue(Employee emp) {
		emp.setEmployeeId(2);
		emp.setEmployeeNmae("SecondEmployee");
		return emp;
	}
}
