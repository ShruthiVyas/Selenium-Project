package org.browsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://gmail.com/");
	String title=driver.getTitle();
	System.out.println(title);
	String Url =driver.getCurrentUrl();
	System.out.println(Url);
	
	}
		
	}


