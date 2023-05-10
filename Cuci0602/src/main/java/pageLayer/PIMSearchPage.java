package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilsLayer.UtilsClass;

public class PIMSearchPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	private WebElement emp;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement search;
	
	@FindBy(xpath="//div[text()='Anwar ']")
	private WebElement capture;
	
	public PIMSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void reachSearch() {
		UtilsClass.clickButton(pim);
	}
	
	public void enterEmpName(String name) {
		UtilsClass.enterData(emp, name);
	}
	
	public void clickSearch() {
		UtilsClass.clickButton(search);
	}
	
	public String captureName() {
		return capture.getAttribute("value");
	}

}
