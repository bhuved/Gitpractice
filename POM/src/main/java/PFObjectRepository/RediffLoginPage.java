package PFObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By signinbtn=By.xpath("//input[@class='signinbtn']");
*/
	@FindBy(xpath="//input[@id='login1']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//input[@class='signinbtn']")WebElement signinbtn;

	public WebElement uname()
	{
		return username;
	}

	public WebElement pwd()
	{
		return password;
	}

	public WebElement signbtn()
	{
		return signinbtn;
	}
}
