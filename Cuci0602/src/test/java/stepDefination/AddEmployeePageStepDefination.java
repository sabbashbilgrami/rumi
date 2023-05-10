package stepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;


import baseLayer.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.PIMAddPage;

public class AddEmployeePageStepDefination extends BaseClass {
	private PIMAddPage adder;

	@When("user click on Add button")
	public void user_click_on_add_button() {
		adder = new PIMAddPage();
		adder.clickAdd();
		
    }
	@Then("user is on Add Employee page")
	public void user_is_on_add_employee_page() {
	   assertEquals(true,adder.addUrl().contains("addEmployee"));
	}

	@Then("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
	    adder.addFirstAndLastName("Sadiq", "Jiwani");
	}

	@Then("user capture employee ID")
	public void user_capture_employee_id() {
		adder=new PIMAddPage();
		String d = adder.captureID();
	    System.out.println(d);
	}
	@Then("user click on save button")
	public void user_click_on_save_button() {
    adder.clickSave();
}

}
