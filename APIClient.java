package Week3.Homeassignment;
//PolyMorphism-Method Overloading
public class APIClient {
	
	public void sendRequest(String endpoint) {
		 System.out.println("Sending Request:"+endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus ) {
		 System.out.println("Sending Request To:"+endpoint);
		 System.out.println("Request Body Is:"+requestBody);
		 System.out.println("Request Status Is:"+requestStatus);
	}
  
	public static void main(String[] args) {
		APIClient api=new APIClient();
		api.sendRequest("https://www.google.com");
		api.sendRequest("https://www.google.com", "<body>Testing</boday>", true);
		

	}

}
