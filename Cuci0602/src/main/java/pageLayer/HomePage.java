package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//img[@alt='client brand banner']")
	private WebElement logo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean homepageLogo() {
		return logo.isDisplayed();
	}
	
	public String homepageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String homepageTitle() {
		return driver.getTitle();
	}

}
