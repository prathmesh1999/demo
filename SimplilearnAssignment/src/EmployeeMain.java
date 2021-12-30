class Employees{
	private int id;
	private String name;
	private double salary;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
public class EmployeeMain {
	public static void main(String[] args) {
		Employees emp1=new Employees();
		Employees emp2=new Employees();
		Employees emp3=new Employees();
		Employees emp4=new Employees();

		emp1.setId(101);
		emp1.setName("Shishir");
		emp1.setSalary(18000);
		emp1.setAddress("Dhule");

		emp2.setId(102);
		emp2.setName("Nilesh");
		emp2.setSalary(20000);
		emp2.setAddress("Dhule");

		emp3.setId(103);
		emp3.setName("Pritesh");
		emp3.setSalary(21000);
		emp3.setAddress("Dhule");

		emp4.setId(104);
		emp4.setName("Pratik");
		emp4.setSalary(20000);
		emp4.setAddress("Pune");
		
		System.out.println("ID: "+emp1.getId()+" Name: "+ emp1.getName()+" Salary: "+emp1.getSalary()+" Address: "+ emp1.getAddress());
		System.out.println("ID: "+emp2.getId()+" Name: "+ emp2.getName()+" Salary: "+emp2.getSalary()+" Address: "+ emp2.getAddress());
		System.out.println("ID: "+emp3.getId()+" Name: "+ emp3.getName()+" Salary: "+emp3.getSalary()+" Address: "+ emp3.getAddress());
		System.out.println("ID: "+emp4.getId()+" Name: "+ emp4.getName()+" Salary: "+emp4.getSalary()+" Address: "+ emp4.getAddress());

	}
}
