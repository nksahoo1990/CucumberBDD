package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginPageFacebook {

	WebDriver driver=null;
	
	@Given("Open the browser")
	public void open_the_browser() {
		System.out.println("Opening the browser");
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumFramework\\com.testselenium.framework\\driver\\chromedriver.exe");
		// Initialize browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("navigate to facebook paage.")
	public void navigate_to_facebook_paage() {
		System.out.println("User navigates to FB page");
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}

	@And("clicks on login")
	public void clicks_on_login() {
		System.out.println("Click on login button");
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Close the browser");
		driver.quit();
	}
}
