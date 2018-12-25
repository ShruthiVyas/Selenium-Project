package org.locator.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://netbanking.hdfcbank.com/");

	WebElement txtId = driver.findElement(By.className("input_password"));
	txtId.sendKeys("1234");
	
	
	
	
	
	}

}
