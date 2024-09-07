package Week3.Homeassignment;
//Abstract class
public abstract class MySqlConnection implements DatabseConnection {

	public void connect() {
		System.out.println("Database connected");
		
	}

	public void disconnect() {
		System.out.println("Database disconnected");
		
	}

	public void executeUpdate() {
		System.out.println("Execution Completed");
		
	}
	
	public abstract void executeQuery();

}
