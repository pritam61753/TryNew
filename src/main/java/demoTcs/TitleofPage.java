package demoTcs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleofPage {
	
	WebDriver driver;
	
	@BeforeMethod	
	public void setUp() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\win8\\Downloads\\chromedriver_win32 (1).chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
	}
	
	@Test	
	public void googleTitleTest() {
		
		String title = driver.getTitle();
		System.out.println(title);	
		}
	
	@Test
	public void googleLogoTest1() {
		boolean b = driver.findElement(By.className("K1zIA rS4se")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
