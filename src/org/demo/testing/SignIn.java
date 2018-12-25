package org.demo.testing;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends Base{
	public SignIn () {
	PageFactory.initElements(driver,this);
	
	}
 @FindBy(xpath="//input[@id='email']")
private WebElement txtUserName;
public WebElement getTxtUserName() {
	return txtUserName;
}
public void setTxtUserName(WebElement txtUserName) {
	this.txtUserName = txtUserName;
}

@FindBy(xpath="//img[@src='enter.png']")
private List<WebElement>btnLogin;
public List<WebElement> getBtnLogin() {
	return btnLogin;
}
public void setBtnLogin(List<WebElement> btnLogin) {
	this.btnLogin = btnLogin;
}
	
}

