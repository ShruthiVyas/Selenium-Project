package org.locator.day2;


	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public  class Icici{
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement txtLogin= driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtLogin.sendKeys("shruthi");
		WebElement txtPassword=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtPassword.sendKeys("1234567");
		}
}
