package decoraterPattern;

public class TeamLead extends EmployeeDecorator {
	public TeamLead(Employee e) {
		super(e);
	}

	public void lead() {
		System.out.println("leading");
	}
}
