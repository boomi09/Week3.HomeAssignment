package Week3.Homeassignment;
 //Inherit the parent(BasePage) class and override one method from parent
public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		 System.out.println("Overriding the method in the BasePage class");
	 }

	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.findElement();
		login.clickElement();
		login.enterText();
		login.performCommonTasks();

	}

}
