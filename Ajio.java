package Week3.Homeassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(2000);
		String itemsCount = driver.findElement(By.xpath("//div[@class ='length']")).getText();
		System.out.println(itemsCount);
		// Get the list of brand of the products displayed in the page and print the list.
		System.out.println("The List of Brands are : ");
		List<WebElement> brandlist = driver.findElements(By.xpath("//div[@class ='brand']"));
		for (WebElement brand : brandlist) {
			System.out.println(brand.getText());

		}
		// Get the list of names of the bags and print it
		System.out.println("The List of Bags are : ");
		List<WebElement> baglist = driver.findElements(By.xpath("//div[@class ='nameCls']"));
		for (WebElement bag : baglist) {
			System.out.println(bag.getText());

		}
		Thread.sleep(1000);

		driver.quit();

	}

}
