package org.xpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTech {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement txtName=driver.findElement(By.xpath("//input[@id='InputName']"));
	txtName.sendKeys("Shruthi");
	WebElement txtEmail=driver.findElement(By.xpath("//input[name='email']"));
	txtEmail.sendKeys("shruthi@gmail.com");
	WebElement phoneNo=driver.findElement(By.xpath("//input[@name='phone']"));
	
	phoneNo.sendKeys("9538662977");
	
	}

}
