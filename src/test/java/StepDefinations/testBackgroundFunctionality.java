package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testBackgroundFunctionality {
	
	WebDriver driver=null;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browser opened ");
		driver.get("https://learn-automation.usefedora.com/");
		System.out.println("USer navigated to learn automation site");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
	    driver.findElement(By.id("user_email")).sendKeys("nit.krish4444@gmail.com");
	    driver.findElement(By.id("user_password")).sendKeys("#Nitkrish4");
	    driver.findElement(By.xpath("//*[@value='Log In']")).click();
	}
	
	@Then("login successful")
	public void login_successful() {
	    boolean res=driver.findElement(By.className("gravatar")).isDisplayed();
	    if(res==true) {
	    	System.out.println("Login successfull");
	    }else {
	    	System.out.println("Login unsuccessful");
	    }
	}

	@Given("User id displayed with profile icon")
	public void user_id_displayed_with_profile_icon() {
		driver.findElement(By.className("gravatar")).isDisplayed();
	}

	@When("user clicks on profile icon")
	public void user_clicks_on_profile_icon() {
		driver.findElement(By.className("gravatar")).click();
	}

	@When("user clicks on edit profile link")
	public void user_clicks_on_edit_profile_link() {
	    driver.findElement(By.className("user-profile")).click();
	}

	@Then("edit profile page is displayed")
	public void edit_profile_page_is_displayed() {
	    String actStr =driver.findElement(By.className("section-title")).getText().trim();
	    Assert.assertEquals(actStr, "Edit Profile", "Edit profile page displayed");
	    driver.quit();
	    
	}

	@When("user clicks on logout link")
	public void user_clicks_on_logout_link() {
	    driver.findElement(By.className("user-signout")).click();
	}

	@Then("logout successful")
	public void logout_successful() {
	    
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/sign_in']")).isDisplayed(), "Logout successful");
	}




	
}
