package org.xpath.day3;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Demonqa {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
				
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/registration/"); 
	WebElement txtLogin = driver.findElement(By.xpath("//input[@id='email']"));

	txtLogin.sendKeys("Hello");
}
	}




















