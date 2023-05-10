package stepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import baseLayer.BaseClass;
import io.cucumber.java.en.Then;
import pageLayer.PIMSearchPage;

public class SearchEmployeePageStepDefination extends BaseClass {
	private PIMSearchPage search;
	
	@Then("user enter Employee name")
	public void user_enter_employee_name() {
		search = new PIMSearchPage();
		search.reachSearch();
		search.enterEmpName("Sadiq Jiwani");
	   
	}



	@Then("user click on search")
	public void user_click_on_search() {
	   search.clickSearch();
	}
	@Then("user verify record found using Employee name")
	public void user_verify_record_found_using_employee_name() {
	   assertEquals(true,search.captureName().contains("Sadiq"));
	}

}
