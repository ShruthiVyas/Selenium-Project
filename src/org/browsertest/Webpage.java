package org.browsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webpage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagarajan L\\eclipse-workspace\\Selenium\\lib\\Drivers\\chromedriver.exe" );
WebDriver as= new ChromeDriver();
as.get("http://www.greenstechnologys.com/");

String title=as.getTitle();
System.out.println(title);
String Url=as.getCurrentUrl();
System.out.println(Url);

}
}
