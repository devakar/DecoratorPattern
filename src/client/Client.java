package client;

import decoraterPattern.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new EmployeeClass("Ram", 30);
		e1.join();
		
		e1=new TeamLead(e1);
		((TeamLead) e1).lead();
		
		Employee e2 = new Manager(new EmployeeClass("Sita", 24));
		e2.join();
		((Manager)e2).manage();
	}

}
