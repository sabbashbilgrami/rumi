package stepDefination;

import baseLayer.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.PIMPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PIMPageStepDefination extends BaseClass {


	private PIMPage page;
	@When("user is on PIM page")
	public void user_is_on_pim_page() {
		
		page = new PIMPage();
		page.clickPIM();
	    
	}

	@Then("validate user is on PIM using URL")
	public void validate_user_is_on_pim_using_url() {
	  assertEquals(true,page.pimUrl().contains("pim"));
	}

	

}
