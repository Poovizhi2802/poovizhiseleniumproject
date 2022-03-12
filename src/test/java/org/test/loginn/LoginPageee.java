package org.test.loginn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClassJava;

public class LoginPageee extends BaseClassJava {
	public void loginpage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement user;
	@FindBy (id="pass")
	private WebElement password;
	@FindBy (name="login")
	private WebElement login;
	
	
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
 
		

	}


