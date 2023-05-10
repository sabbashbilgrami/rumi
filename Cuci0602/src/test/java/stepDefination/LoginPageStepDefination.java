package stepDefination;

import baseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.LoginPage;

public class LoginPageStepDefination extends BaseClass {
private LoginPage login;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		login = new LoginPage();
		login.enterUsernameandPassword(prop.getProperty("username"), prop.getProperty("password"));
	  	}

	@Then("user click on Login button")
	public void user_click_on_login_button() {
	   login.clickOnLogin();
	}

	
}
