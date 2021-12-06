package org.wolters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends LibGlobal {
	
	public  Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="login")
	private WebElement login;
	
	
	

}
