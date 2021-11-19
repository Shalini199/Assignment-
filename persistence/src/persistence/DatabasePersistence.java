package persistence;

public class DatabasePersistence extends Persistence {
	@Override
	 public void persist() {
		System.out.println("Data is being saved in database");
	}

}
