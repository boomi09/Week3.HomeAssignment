package Week3.Homeassignment;
//Subclass of Abstract class MySqlConnection
public class JavaConnection extends MySqlConnection{
	
	@Override
	public void executeQuery() {
		
		System.out.println("Executing Query Inprogress");
	}


	public static void main(String[] args) {
		JavaConnection connection=new JavaConnection();
		
		connection.connect();
		connection.executeQuery();
		connection.executeUpdate();
		connection.disconnect();
	}

	
}
