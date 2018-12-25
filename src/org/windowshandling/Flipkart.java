package org.windowshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
	WebElement btnNew=driver.findElement(By.xpath("//a[text()='New User Activation']"));
	btnNew.click();
	String pWid=driver.getWindowHandle();
	System.out.println(pWid);
	
	}

}
