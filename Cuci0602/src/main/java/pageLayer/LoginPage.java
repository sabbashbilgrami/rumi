package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilsLayer.UtilsClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="username")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsernameandPassword(String name, String password) {
		UtilsClass.enterData(uname, name);
		UtilsClass.enterData(pass, password);
	}
	
	public void clickOnLogin() {
		UtilsClass.clickButton(login);
	}
	
	

}
