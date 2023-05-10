package stepDefination;

import baseLayer.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.RegisterPage;

public class RegisterPageDemo99 extends BaseClass {
	
	private RegisterPage register;


@When("user is on Demo99 register page")
public void user_is_on_demo99_register_page() {
	BaseClass.initialization();
   
}
@Then("firstName and lastName")
public void first_name_and_last_name() {
	register = new RegisterPage();
	register.ContactInformation1("Sadiq", "Jiwani");

}

@Then("mobile number and email address")
public void mobile_number_and_email_address() {
	register = new RegisterPage();
	register.ContactInformation2("1124354324", "sadiq@jiwani.com");
}

@Then("user enter Address and City")
public void user_enter_address_and_city() {
   
}

@Then("user enter State and Postal code")
public void user_enter_state_and_postal_code() {
   
}

@Then("user selects the City")
public void user_selects_the_city() {
   
}

@Then("user enter Username")
public void user_enter_username() {

}

@Then("user enter password and confirm password")
public void user_enter_password_and_confirm_password() {
   
}

@Then("user click on submit")
public void user_click_on_submit() {
  
}

}
