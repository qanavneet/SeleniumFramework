package understandingselenium;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Testing {
	
			public static void main(String[] args) {
			WebDriver driver;
			driver = new FirefoxDriver();
			String baseURL = "http://www.google.com";
			driver.manage().window().maximize();
			driver.get(baseURL);
			
			WebElement  Navneet = driver.findElement(By.className("gLFyf"));
			Navneet.sendKeys("letskodeit" + Keys.ENTER);
			driver.close();
			System.out.print("Pass ");
		}



}
