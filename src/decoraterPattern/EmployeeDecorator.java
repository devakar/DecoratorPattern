package decoraterPattern;

public abstract class EmployeeDecorator implements Employee {
	public Employee employee;
	
	public EmployeeDecorator(Employee e) {
		this.employee=e;
	}
	
	public void join() {
		employee.join();
	}
	
	public void terminate() {
		employee.terminate();
	}

}
