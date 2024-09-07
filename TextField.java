package Week3.Homeassignment;

import org.w3c.dom.Text;

//It's subclass of base class WebElement
public class TextField extends WebElement{
	 
	public String getText(String text) {
		System.out.println("The Text is:"+text);
		return text;
	}
	

	public static void main(String[] args) {
		TextField gettext=new TextField();
		gettext.getText("text is Panasonic");
		

	}

}
