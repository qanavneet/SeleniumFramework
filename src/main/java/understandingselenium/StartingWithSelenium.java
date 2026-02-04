package understandingselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartingWithSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Maxminize the chrome window 
		driver.manage().window().maximize();
		
		System.out.println("Action Perform Chrome Open");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		System.out.println("Username and passwaord enter are successfully");
		
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("item_4_title_link")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("back-to-products")).click();
		
		// Find out all the anchore tag
		
	WebElement elementlist	= driver.findElement(By.tagName("a"));
	System.out.print(elementlist.getSize());
	
		
	}
	


}
