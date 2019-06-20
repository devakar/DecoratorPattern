package decoraterPattern;

public class EmployeeClass implements Employee {
	String name;
	int age;
	
	public EmployeeClass(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void join() {
		System.out.println(name + " has joined");
	}
	
	public void terminate() {
		System.out.println(name+ " has terminated");
	}
}
