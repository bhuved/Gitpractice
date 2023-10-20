package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
 By signin=By.xpath("//a[@class='signin']");
 public WebElement signin()
 {
	  return driver.findElement(signin);
 }
 
}
