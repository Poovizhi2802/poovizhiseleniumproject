package org.test.registrationpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClassJava;

public class Registration extends BaseClassJava {
	public Registration() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement create;
	@FindBy(name="firstname")
	private WebElement user;
	@FindBy(name="lastname")
	private WebElement user1;
	@FindBy(name="reg_email__")
	private WebElement address;
	@FindBy(name="reg_passwd__")
	private WebElement Password;
	
	
	public WebElement getCreate() {
		return create;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getUser1() {
		return user1;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getPassword() {
		return Password;
	}
	

}
