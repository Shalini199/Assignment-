package Organization;

public class Labour extends Employee {
	int overtime = 2;
	@Override
	void salary() {
		sal=20000;
		int totalsal = sal + overtime*200;
		 System.out.println("The labour sal is salary + overtime :" +totalsal);
		 
		
		
		
	}
	

}
