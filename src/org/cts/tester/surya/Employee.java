package org.cts.tester.surya;

public class Employee {
	private void empId() {
	
System.out.println("Employee Id is 123");
	}
	private void empName() {
	
System.out.println("Emplyoee Name is surya");
	}
	private void empDob() {
	System.out.println("12.34.5678");

	}
	private void empPhone() {
	System.out.println("Employee phone number is 987654321");

	}
private void empEmail() {
System.out.println("Surya@gmail.com");

}
private void empAddress() {
System.out.println("Velachery");

}
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
		
	

	}

}
