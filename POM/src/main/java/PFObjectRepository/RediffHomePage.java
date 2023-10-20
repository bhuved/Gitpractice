package PFObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
	WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
 //By signin=By.xpath("//a[@class='signin']");
	@FindBy(xpath="//a[@class='signin']")
	WebElement signin;
	
 public WebElement signin()
 {
	  return signin;
 }
}
