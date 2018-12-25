package org.xpath.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Toolsqa {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
			
WebDriver driver=new ChromeDriver();
driver.get("http://toolsqa.com/automation-practice-form/"); 
WebElement txtName = driver.findElement(By.name("firstname"));
txtName.sendKeys("Shruthi");
WebElement txtLName = driver.findElement(By.name("lastname"));
 txtLName.sendKeys("Vyas");
 WebElement btnRadio = driver.findElement(By.id("sex-1"));
 btnRadio.sendKeys("Female");
 btnRadio.click();
 WebElement btnRadio1 = driver.findElement(By.id("exp-2"));
 btnRadio1.sendKeys("3");
 btnRadio1.click();
 
 WebElement txtDate = driver.findElement(By.id("datepicker"));
 txtDate.sendKeys("3/12/2018");
 Thread.sleep(2000);
 WebElement btnRadio3=driver.findElement(By.xpath("//input[@id='profession-1']"));
 btnRadio3.sendKeys("Automation Tester");
 btnRadio3.click();
}
}