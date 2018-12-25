package org.xpath.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/"); 
	WebElement txtLogin = driver.findElement(By.xpath("//input[@id='email']"));
	txtLogin.sendKeys("Hello");
	
	WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
	txtPassword.sendKeys("qwerr1234");
	
	WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
	btnLogin.sendKeys("qwerr1234");
	btnLogin.click();
	
	}

}