package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilsLayer.UtilsClass;

public class RegisterPage extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(id="userName")
	private WebElement email;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ContactInformation1(String first, String last) {
		UtilsClass.enterData(fname, first);
		UtilsClass.enterData(lname, last);
	}
	public void ContactInformation2(String Mobile, String Email) {
		UtilsClass.enterData(phone, Mobile);
		UtilsClass.enterData(email, Email);
	}
	

}
