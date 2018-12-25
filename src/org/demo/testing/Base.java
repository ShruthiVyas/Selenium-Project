package org.demo.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static WebDriver getDriver() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
return driver=new ChromeDriver();
	}
	public static void loadUrl(String url) {
	driver.get(url);
	}
	public static void type(WebElement element, String Name) {
		element.sendKeys(Name);
	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	
	
	}