package org.locator.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Twitter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
		WebElement txtUsername= driver.findElement(By.className("js-username-field"));
		txtUsername.sendKeys("asdf");
		WebElement txtPassword =driver.findElement(By.className("js-password-field"));
		txtPassword.sendKeys("1234");
}
}