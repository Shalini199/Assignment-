package Bank;
import java.io.*;
import java.util.*;

public class Accounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Accounts s = new Saving();
          Accounts c = new Current();
          int S = ((Saving) s).cash();
         int C = ((Current) c).cash();
          int totalbalance = S + C;
	System.out.println(totalbalance);
	

	}
}
class Saving extends Accounts
{
	int cash() {
	int fixedDeposits = 10000;
	return fixedDeposits;
	}
	
}
class Current extends Accounts{
	int cash() {
	int cashcredit = 50000;
	return cashcredit;
	}
}