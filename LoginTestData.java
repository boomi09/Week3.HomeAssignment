package Week3.Homeassignment;
//Sub class inherits from super class TestData

public class LoginTestData extends TestData {
	
	
	public String enterUsername(String userName) {
		System.out.println("Please Enter the User Name:" + userName);
		return userName;
		
	}
	public String enterPassword(String password) {
		System.out.println("Please Enter the Password:" + password);
		return password;
		
	}

	public static void main(String[] args) {
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.enterUsername("LoginTest");
		login.enterPassword("Abc@12345");
		login.navigateToHomePage();
		

	}

}
