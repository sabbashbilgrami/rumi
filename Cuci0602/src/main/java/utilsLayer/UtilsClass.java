package utilsLayer;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;

public class UtilsClass extends BaseClass {
	
	public static void enterData(WebElement wb, String value) {
		if((wb.isDisplayed())&&(wb.isEnabled())) {
			wb.sendKeys(value);
		}
	}
	
	public static void clickButton(WebElement wb) {
		if((wb.isDisplayed())&&(wb.isEnabled())) {
			wb.click();
		}
	}
	

	}

