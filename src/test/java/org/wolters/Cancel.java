package org.wolters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cancel extends LibGlobal {
	
	public Cancel() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="my_itinerary")
	private WebElement itinerary;
	
	@FindBy(name="check_all")
	private WebElement check;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancel;

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
}
