package Organization;

public class Employee {
	int sal;
 
	void salary() {
		
		System.out.println("the employee salary is :"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		emp.salary();
			Manager man = new Manager();
			man.salary();
			Labour lab = new Labour();
			lab.salary();
		}
	

}
