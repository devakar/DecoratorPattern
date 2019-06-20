package decoraterPattern;

public class Manager extends EmployeeDecorator {
	public Manager(Employee e) {
		super(e);
	}
	
	public void manage() {
		System.out.println("managing");
	}
	
}
