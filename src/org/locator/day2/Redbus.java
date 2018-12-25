package org.locator.day2;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.redbus.in/");
     WebElement txtFrom =  driver.findElement (By.id("src"));
     txtFrom.sendKeys("Bangalore");
	WebElement txtTo = driver.findElement(By.id("dest"));
	txtTo.sendKeys("Chennai");
	
	
	
	
	
	
	
	}

}
