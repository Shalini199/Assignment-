package Organization;

public class Manager extends Employee {
	int incentive = 500;
			
	
	
@Override
  void salary() {
	   sal = 25000;
	  int totalsal = sal + incentive;
	  System.out.println("The manager sal is salary + incentive :"+totalsal);
  }

	

}
