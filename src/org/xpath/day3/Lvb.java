package org.xpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lvb {
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
			
			WebElement txtLogin= driver.findElement(By.xpath("//input[@tabindex='1']"));
			txtLogin.sendKeys("shruthi");
			WebElement txtPassword=driver.findElement(By.xpath("//input[@tabindex='2']"));
			txtPassword.sendKeys("1234567");
}
}