class Employee {

	protected int id;
	protected String firstName;
	protected String lastName;
	protected String address;
	
	public Employee(){}
	
	public Employee(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFullName(){
		return firstName+" "+lastName;
	}
	
	public void sendMessage(){
		System.out.println("Salary added successfully...");
	}	
}


class FullTimeEmployee extends Employee{
	
	private double basic;
	private double bonus;

	public FullTimeEmployee(){
  }

	public FullTimeEmployee(int id, String firstName, String lastName, double basic, double bonus, String address) {
		super(id,firstName, lastName,address);
		this.basic = basic;
		this.bonus = bonus;
	}
	
	public double computeSal(){
		return basic + bonus;
	}
	
	public void showDetails(){
		System.out.println("Id : " + id);
		System.out.println("Name : " + getFullName());
		System.out.println("Grand Total : " + computeSal());
		System.out.println("Address : " + address);
	}	
	
}



class PartTimeEmployee extends Employee{

	private double amountPerHour;
	private int hoursWorked;
	
	public PartTimeEmployee(){}
	
	public PartTimeEmployee(int id, String firstName, String lastName, double amountPerHour, int hoursWorked,
			String address) {
		super(id,firstName, lastName,address);
		this.amountPerHour = amountPerHour;
		this.hoursWorked = hoursWorked;
	}
	
	public double computeSal(){
		return amountPerHour * hoursWorked;
	}
	
	public void showDetails(){
		System.out.println("Id : " + id);
		System.out.println("Name : " + getFullName());
		System.out.println("Grand Total : " + computeSal());
		System.out.println("Address : " + address);
	}	
}



public class Employee{

	public static void main(String[] args) {
FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101,"CHARAN","BAISANI",80000,12000,"68-26, EAST, AP");
		fullTimeEmployee.showDetails();
		fullTimeEmployee.sendMessage();
	
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102,"PAVAN","Kalyan",150,80,"20-20,WEST, AP");
		partTimeEmployee.showDetails();
		partTimeEmployee.sendMessage();
	}
}







