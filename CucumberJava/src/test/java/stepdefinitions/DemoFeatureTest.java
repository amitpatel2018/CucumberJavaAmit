package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoFeatureTest {
	@Given("user navigates to website")
	public void user_navigates_to_website() {
		System.out.println("User navigated to website successfully");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User entered username and password successfully");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("User clicked on login button successfully");
	}

	@Then("user successfully logged into website")
	public void user_successfully_logged_into_website() {
		System.out.println("User logged into website successfully");
	}
}
