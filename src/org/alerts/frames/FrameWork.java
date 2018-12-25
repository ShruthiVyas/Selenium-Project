package org.alerts.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.switchTo().frame("69c78f2f5442780ef1135443ebfdba9a");
		Thread.sleep(2000);
		WebElement Login=driver.findElement(By.xpath("//input[@value='SIGN IN']"));
		Login.click();
		
	}

}
