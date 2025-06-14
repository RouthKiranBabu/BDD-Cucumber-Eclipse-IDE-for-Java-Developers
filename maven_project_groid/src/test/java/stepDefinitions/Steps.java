package stepDefinitions;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.formPage_setup;

public class Steps {
	WebDriver driver;
	formPage_setup form;
	
	@Given("Launch the Chrome Browser")
	public void launch_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	    driver = new ChromeDriver();
	    form = new formPage_setup(driver);
	}

	@Given("Opens URL {string}")
	public void opens_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.get(string);
	}

	@When("Check valid URL")
	public void check_valid_url() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String url = driver.getCurrentUrl();
		if (url.equals("https://v1.training-support.net/selenium/simple-form?")) {
			System.out.println("Yes Valid URL");
		}else { System.out.println("Not a Valid URL"); }
	}

	@When("Check valid Title")
	public void check_valid_title() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String title = driver.getTitle();
		if (title.equals("Simple Form")) { System.out.println("Yes Valid Title"); }
		else { System.out.println("Not a Valid Title"); }
	}

	@When("Enter First Name as {string}")
	public void enter_first_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.setFirstName(string);
	}

	@When("Enter Last Name as {string}")
	public void enter_last_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.setLastName(string);
	}

	@When("Enter	Email as {string}")
	public void enter_email_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.setEmail(string);
	}

	@When("Enter Contact Number as {string}")
	public void enter_contact_number_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.setContactNumber(string);
	}

	@When("Enter Message as {string}")
	public void enter_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.setMessage(string);
	}

	@When("Click button {string}")
	public void click_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.clickSubmit();
	}

	@Then("Alert Message Prints {string}")
	public void alert_message_prints(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.check_message(string);
	}

	@Then("Wait for {string} then Clicks OK")
	public void wait_for_then_clicks_ok(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.wait_ok(string);
	}

	@Then("Check First Name is Cleared")
	public void check_first_name_is_cleared() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.check_firstName_cleared();
	}

	@Then("Wait for {string} then Close the Chrome Browser")
	public void wait_for_then_close_the_chrome_browser(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		form.wait_close(string);
	}
}
