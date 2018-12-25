package org.demo.testing;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends Base {
	public Register(){
		PageFactory.initElements(driver, this);
	
	}
@FindBy(xpath="//input[@type='text'][1]") 
private WebElement txtFirstName;

@FindBy(xpath="//input[@placeholder='Last Name']")
private WebElement txtLastName;

@FindBy (xpath="//textarea[@rows='3']")
private WebElement addressBox;

@FindBy (xpath="//input[@type='email']")
private WebElement txtEmail;

@FindBy (xpath="//input[@type='tel']")
private WebElement txtPhone;

@FindBy (xpath="//input[@value='FeMale']")
private WebElement btnRadio1;

@FindBy (xpath="//input[@value='Movies']")
private WebElement btnRadio2;



public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getAddressBox() {
	return addressBox;
}

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPhone() {
	return txtPhone;
}

public WebElement getBtnRadio1() {
	return btnRadio1;
}

public WebElement getBtnRadio2() {
	return btnRadio2;
}
@FindBy (xpath="//div[@id='msdd']")
private WebElement lang;

public WebElement getLang() {
	return lang;
}
@FindBy (xpath="//a[text()='English']")
private WebElement English;


public WebElement getEnglish() {
	return English;
	
}

@FindBy (xpath="//label[text()='Skills']")
private WebElement skill;



public WebElement getSkill() {
	return skill;
}
@FindBy (xpath="//select[@id='Skills']")
private WebElement skil;



public WebElement getSkil() {
	return skil;
}
@FindBy (xpath="//option[@value='Android']")
private WebElement value;



public WebElement getValue() {
	return value;
}
@FindBy(xpath="//label[text()='Country*']")
private WebElement country;

public WebElement getCountry() {
	return country;
}
@FindBy(xpath="//select[@id='countries']")
private WebElement Count;



public WebElement getCount() {
	return Count;
}

@FindBy (xpath="//option[@value='India']")
private WebElement Ind;



public WebElement getInd() {
	return Ind;
}


}



