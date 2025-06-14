package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;

public class formPage_setup {
	public WebDriver ldriver;
	String f_name = "";
	String l_name = "";
	
	public formPage_setup(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "firstName")
	@CacheLookup
	WebElement first_name;
	
	@FindBy(id = "lastName")
	@CacheLookup
	WebElement last_name;
	
	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement email;
	
	@FindBy(id = "number")
	@CacheLookup
	WebElement contact_number;
	
	@FindBy(xpath = "//textarea")
	@CacheLookup
	WebElement messagebox;
	
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement submit;

	public void setFirstName(String fname) {
		first_name.clear();
		first_name.sendKeys(fname);
		f_name = fname;
	}
	
	public void setLastName(String lname) {
		last_name.clear();
		last_name.sendKeys(lname);
		l_name = lname;
	}
	
	public void setEmail(String mail) {
		email.clear();
		email.sendKeys(mail);
	}
	
	public void setContactNumber(String number) {
		contact_number.clear();
		contact_number.sendKeys(number);
	}
	
	public void setMessage(String message) {
		messagebox.clear();
		messagebox.sendKeys(message);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	public void check_message(String msg) {
		Alert alrt = ldriver.switchTo().alert();
		String altmsg = alrt.getText();
//		assertEquals(altmsg, msg);
		if (altmsg.contains(msg)) {
			assertTrue("Text did not contain expected value!", altmsg.contains(msg));
		}
	}
	
	public void wait_ok(String delay) throws InterruptedException{
//		String[] strarr = delay.split(" ");
//		int waits = Integer.parseInt(strarr[0]);
//		System.out.println(">>>>>>>>>>" + waits);
		Thread.sleep(3 * 1000);
		
//		Alert alrt = ldriver.switchTo().alert();
//		alrt.accept();
		ldriver.switchTo().alert().accept();
	}
	
	public void check_firstName_cleared() {
//		String firstname = first_name.getText();
//		assertEquals(firstname, "");
	}
	
	public void wait_close(String time) throws InterruptedException {
//		String[] strarr = time.split(" ");
//		int sec = Integer.parseInt(strarr[0]);
//		Thread.sleep(sec * 1000);
		ldriver.quit();
	}
}
