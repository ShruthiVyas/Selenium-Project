package org.windowshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement btnPopup=driver.findElement(By.xpath("//button[text()='✕']"));
btnPopup.click();
	
	
	}
}