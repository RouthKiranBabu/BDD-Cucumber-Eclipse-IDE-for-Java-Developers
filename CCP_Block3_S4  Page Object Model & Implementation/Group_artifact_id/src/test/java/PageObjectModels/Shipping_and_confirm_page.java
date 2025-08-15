package PageObjectModels;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Shipping_and_confirm_page {
	public WebDriver driver;
	WebDriverWait wait;
	
	public Shipping_and_confirm_page(WebDriver rdriver) {
		driver = rdriver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "firstNameInput")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(id = "lastNameInput")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(id = "addressLine1Input")
	@CacheLookup
	WebElement address;
	
	@FindBy(id = "provinceInput")
	@CacheLookup
	WebElement state;
	
	@FindBy(id = "postCodeInput")
	@CacheLookup
	WebElement postal_code;
	
	@FindBy(id = "checkout-shipping-continue")
	@CacheLookup
	WebElement submit_button;
	
	@FindBy(id = "confirmation-message")
	@CacheLookup
	WebElement confirm_message;
	
	public void shipping_address(String _firstname, String _lastname, String _address, String _state, String _postal_code) throws InterruptedException {
		Thread.sleep(1000);
		firstname.sendKeys(_firstname); Thread.sleep(500);
		lastname.sendKeys(_lastname); Thread.sleep(500);
		address.sendKeys(_address); Thread.sleep(500);
		state.sendKeys(_state); Thread.sleep(500);
		postal_code.sendKeys(_postal_code); Thread.sleep(500);
		submit_button.click();
	}
	
	public void confirm_message() throws InterruptedException {
		Thread.sleep(5000);
		String text = confirm_message.getText();
		if (text.equals("Your Order has been successfully placed.")) {
			Assert.assertTrue(true);
			System.out.println("<<<<<<<<<<   Successfully placed.   >>>>>>>>>>");
		}else {
			Assert.assertTrue(false);
			System.out.println(">>>>>>>>>>   Failed to place.   <<<<<<<<<<");
		}
		
	}
}
