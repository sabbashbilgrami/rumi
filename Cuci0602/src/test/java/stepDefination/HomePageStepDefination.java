package stepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import baseLayer.BaseClass;
import io.cucumber.java.en.Then;
import pageLayer.HomePage;

public class HomePageStepDefination extends BaseClass{

	private HomePage home;
	@Then("Verify Home Page title")
	public void verify_home_page_title() {
		
		home = new HomePage();
		assertEquals(true,home.homepageTitle().contains("HRM"));
	   
	}

	@Then("Verify Home Page Logo")
	public void verify_home_page_logo() {
		
		assertEquals(true,home.homepageLogo());
	    
	}

	@Then("Verify Home Page URL")
	public void verify_home_page_url() {
		
		assertEquals(true,home.homepageUrl().contains("hrm"));
	    
	}

}
