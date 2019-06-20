package decoraterPattern;

public class TeamMember extends EmployeeDecorator {
	public TeamMember(Employee e) {
		super(e);
	}
	
	public void performTask() {
		System.out.println("performing task");
	}
	
	public void coordinate() {
		System.out.println("coordinating");
	}
	
}
