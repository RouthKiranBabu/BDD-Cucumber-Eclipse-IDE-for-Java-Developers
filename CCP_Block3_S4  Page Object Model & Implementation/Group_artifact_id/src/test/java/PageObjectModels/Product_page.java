package PageObjectModels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_page {
	public WebDriver driver;
	WebDriverWait wait;
	
	public Product_page(WebDriver rdriver) {
		driver = rdriver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//div[text()='Add to cart']")
	@CacheLookup
	List<WebElement> add_to_carts;
	
	public void click_add_to_cart(int number){
		List<WebElement> carts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Add to cart']")));
		System.out.println(carts.size());
		if (number < carts.size()) {
			for (int i = 0; i < number; i++) {System.out.println(i);
//				WebElement cart = carts.get(i + 1);
				WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(carts.get(i + 1)));
				cart.click(); cart.click();
			}
		}
		
	}
	
	public void click_checkout() {
		WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Checkout']")));
		checkout.click();
	}
}
