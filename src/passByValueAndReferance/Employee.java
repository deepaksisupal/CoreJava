package passByValueAndReferance;

public class Employee {
	
	Employee(String name, int id){
		this.employeeId = id;
		this.employeeNmae = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeNmae + ", employeeId=" + employeeId + "]";
	}

	private String employeeNmae;
	private int employeeId;

	public String getEmployeeNmae() {
		return employeeNmae;
	}

	public void setEmployeeNmae(String employeeNmae) {
		this.employeeNmae = employeeNmae;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
