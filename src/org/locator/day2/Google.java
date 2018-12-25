package org.locator.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement txtSearch = driver.findElement(By.name("q"));
	txtSearch.sendKeys("GreensTechnology");
	
	
	
	
	}

}
