package org.demo.testing;

import org.openqa.selenium.support.PageFactory;

public class WebTable extends Base {
	public WebTable() {
		PageFactory.initElements(driver, this);
		
	}

}
