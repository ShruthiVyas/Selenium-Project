package org.locator.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Instagram {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	WebElement txtUsername = driver.findElement(By.id("f2dc553a9c2a534"));
	txtUsername.sendKeys("Shruthi");
	WebElement txtPassword=driver.findElement(By.id("f348f4f04b20f7"));
	txtPassword.sendKeys("123qwe");
}
}
