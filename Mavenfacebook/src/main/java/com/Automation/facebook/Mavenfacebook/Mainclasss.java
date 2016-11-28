package com.Automation.facebook.Mavenfacebook;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Mainclasss 
{
	private static WebDriver driver=null;
	private static final String URL="https://www.facebook.com/";
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Mainclasss.driver = driver;
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C://Selenium//geckodriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get(URL);
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.manage().deleteAllCookies();
		driver.close();
	}
	

}
