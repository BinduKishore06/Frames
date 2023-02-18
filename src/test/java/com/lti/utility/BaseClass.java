package com.lti.utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","./myDrivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		return driver;
	}
	
	
	public void navigateToApplication(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
}


		