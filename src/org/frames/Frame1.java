package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.sprint.com/");
	WebElement btnClick=driver.findElement(By.xpath("//a[text()='Sign In']"));
	btnClick.click();
	WebElement btnClick1=driver.findElement(By.xpath("//button[@id='loginHeaderButton']"));
	btnClick1.click();
	
	
	}

}
