package org.wolters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal {
	
	public SelectHotel()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	}

	@FindBy(id="continue")
	private WebElement cont;
}
