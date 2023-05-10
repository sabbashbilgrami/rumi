package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilsLayer.UtilsClass;

public class PIMAddPage extends BaseClass {

	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement add;
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement eid;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement save;
	
	public PIMAddPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdd() {
		UtilsClass.clickButton(add);
	}
	
	public String addUrl() {
		return driver.getCurrentUrl();
	}
	
	public void addFirstAndLastName(String firstName, String lastName) {
		UtilsClass.enterData(fname, firstName);
		UtilsClass.enterData(lname, lastName);
	}
	
	public String captureID() {
		return eid.getAttribute("value");
	}
	
	public void clickSave() {
		UtilsClass.clickButton(save);
	}
	
	
	
	
	
	
}
