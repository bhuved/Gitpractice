package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;

public class POMtest {
	WebDriver driver;
	
	@BeforeTest()
	public void launchbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vedaa\\OneDrive\\7th Grade Subjects\\drivers\\geckodriver.exe");

		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test(priority=1)
	public void launchURL()
	{
		driver.get("https://www.rediff.com/");
		RediffHomePage rh= new RediffHomePage(driver);
		rh.signin().click();
		
		}
	
	@Test(priority=2)
	public void Login()
	{
	RediffLoginPage  rl=new RediffLoginPage(driver);
	rl.uname().sendKeys("priya");
	rl.pwd().sendKeys("abc123");
	rl.signbtn().click();
	}
	
	

}
