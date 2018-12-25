package org.webtable.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-table/");
	List<WebElement>tRows=driver.findElements(By.tagName("tr"));
		for(int i=0;i<tRows.size()-4;i++)	{
	WebElement w = tRows.get(i);
	List<WebElement>tData=w.findElements(By.tagName("td"));
	for(int j=0;j<tData.size();j++) {
		WebElement s =tData.get(j);
		System.out.println(s.getText());
	}
	}

}
}