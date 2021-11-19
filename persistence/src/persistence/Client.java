package persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persistence F = new FilePersistance();
F.persist();
Persistence D = new DatabasePersistence();
D.persist();

	}

}
