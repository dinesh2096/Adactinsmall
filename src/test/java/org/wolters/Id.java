package org.wolters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Id extends LibGlobal {
	
	public Id()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}
}
