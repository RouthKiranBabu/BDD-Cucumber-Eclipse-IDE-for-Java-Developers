package PageObjectModels;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {
	public WebDriver driver;
	WebDriverWait wait;
	
	public Login_page(WebDriver rdriver) {
		driver = rdriver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//div[text() = 'Select Password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(id = "login-btn")
	@CacheLookup
	WebElement login_btn;
	
	public WebDriver launch_chrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return driver;
	}
	
	public void click_sign_in(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		WebElement sign_in = driver.findElement(By.id("signin"));
		sign_in.click();
	}
	
	public void select_username(String user) {
		WebElement usernameDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#username div")));
        usernameDropdown.click(); // open dropdown
        
        WebElement usernameOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='username']//div[@class='css-1uccc91-singleValue' or text()='demouser'] | //div[text()='demouser']")));
        usernameOption.click();
	}
	
	public void select_password(String _password) {
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(password));
		dropdown.click();
        
        WebElement passwordoption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[text()='" + _password + "']")));
        passwordoption.click();
	}
	
	public void click_login() {
		login_btn.click();
	}
}
