package com.WebApp.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	
	

	private static  WebDriver driver;
	 
	public static WebDriver getDriver() {
        return driver;
       
	}
	 private static final String APP_URL = "https://demo.nopcommerce.com/";
	 
	 
	@BeforeSuite(groups={"Driverlaunch"}) //(alwaysRun = true)
	public void startNG() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\GEO\\Selenium Sample\\WebAppGroup\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		
		System.out.println("Starting Chrome");
	}

	@BeforeTest(groups={"Weblaunch"})   // It will call only 1 time despite of many test cases

	public void initailizeDriver() throws InterruptedException{

		

		driver.manage().window().maximize();
		//		 String url = "https://opensource-demo.orangehrmlive.com/";
		//			driver.get(url);
		//String url = "https://demo.nopcommerce.com/";
		driver.get(APP_URL);
		Thread.sleep(3000);
		System.out.println("Website is open");
		System.out.println("Driver Initialized");
		
	}
	
	
	 /*@BeforeClass
	public void launchWeb(){
		
		
		
	}   */
	
	
@BeforeMethod
	
	public void myURL(){
		System.out.println("enter login");
}
	
	
	
	
	
	//@test
	
	@AfterTest(groups={"exit"})
	
	public void logout(){
		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("logout");
	}
	
/*	@AfterTest
	
	public void deleteCookies(){
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}   */
}
