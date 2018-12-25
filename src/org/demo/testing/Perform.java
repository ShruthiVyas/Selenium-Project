package org.demo.testing;

import org.openqa.selenium.WebDriver;

public class Perform extends Base{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=getDriver();
	loadUrl("http://demo.automationtesting.in/");
	SignIn page =new SignIn();
	type(page.getTxtUserName(),"shruthi.p.vyas@gmailcom");
	btnClick(page.getBtnLogin().get(0));
	Register pg=new Register();
	type(pg.getTxtFirstName(),"Shruthi");
	type(pg.getTxtLastName(),"Vyas");
	type(pg.getAddressBox(),"Chennai");
	type(pg. getTxtEmail(),"shruthi.p.vyas@gmail.com");
	type(pg.getTxtPhone(),"9538662977");
	btnClick(pg.getBtnRadio1());
	btnClick(pg.getBtnRadio2());
	btnClick(pg.getLang());
	btnClick(pg.getEnglish());
	btnClick(pg.getSkill());
	btnClick(pg.getSkil());
	btnClick(pg.getValue());
	btnClick(pg.getCountry());
	btnClick(pg.getCount());
	btnClick(pg.getInd());
	
}
	
	
	
}
