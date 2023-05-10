package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilsLayer.UtilsClass;

public class PIMPage extends BaseClass{
	
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickPIM() {
		UtilsClass.clickButton(pim);
	}
	
	public String pimUrl() {
		return driver.getCurrentUrl();
	}
	

	
	

}
