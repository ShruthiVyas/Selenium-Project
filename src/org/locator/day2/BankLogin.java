package org.locator.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
	
	WebElement txtLogin= driver.findElement(By.id("fldLoginUserId"));
	txtLogin.sendKeys("Shruthi");
	WebElement txtPassword= driver.findElement(By.id("fldPassword"));
	txtLogin.sendKeys("Shruthi");
	
	}

}
