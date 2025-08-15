package stepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjectModels.Login_page;
import PageObjectModels.Product_page;
import PageObjectModels.Shipping_and_confirm_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	Login_page login = new Login_page(driver);
	Product_page product = new Product_page(driver);
	Shipping_and_confirm_page shipping_confirm = new Shipping_and_confirm_page(driver);
	
	@Given("Launch the Chrome Browser")
	public void launch_the_chrome_browser() {
		driver = login.launch_chrome();
		login = new Login_page(driver);
		product = new Product_page(driver);
		shipping_confirm = new Shipping_and_confirm_page(driver);
	}

	@Given("Open the URL {string}")
	public void open_the_url(String string) throws InterruptedException {
		login.click_sign_in(string);
	}

	@When("Click Sign In")
	public void click_sign_in() {
		
	}

	@When("Select Username {string}")
	public void select_username(String string) throws InterruptedException {
//		signins.main(null);
		login.select_username(string);
	}

	@When("Select Password {string}")
	public void select_password(String string) {
	    login.select_password(string);
	}

	@When("Click LOG IN")
	public void click_log_in() {
	    login.click_login();
	}

	@When("Click Add to cart")
	public void click_add_to_cart() throws InterruptedException {
	    product.click_add_to_cart(2);
	}

	@When("Validate cart items")
	public void validate_cart_items() {

	}

	@When("Complete checkout")
	public void complete_checkout() {
	    product.click_checkout();
	}

	@Then("Validate Success text")
	public void validate_success_text() throws InterruptedException {
		shipping_confirm.shipping_address("Routh", "Kiran Babu", "Good address", "Odisha", "761200");
		shipping_confirm.confirm_message();
		driver.quit();
	}
}
