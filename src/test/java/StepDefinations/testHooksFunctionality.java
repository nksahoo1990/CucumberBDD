package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testHooksFunctionality {

	WebDriver driver=null;
	//Before annotation added as hook. Before all scenario openBrowser() method will be executed.
	//@Before("@smoke")  -- This is conditional hooks with tags.  @smoke tag is tagged in feature file as well.
	@Before(order=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browser opened ");
	}
	
	@Before(order=0)
	public void testStetement() {
		
		System.out.println("This is a test statement");
	}
	
	// BerforeStep and AfterStep annotated methods are used before each step present in scenario.
	
	/*
	 * @BeforeStep public void AAA() {
	 * 
	 * System.out.println("This is before step statement"); }
	 */
	
	@After(order=0)
	public void closeBrowser(){
		driver.quit();
		System.out.println("Browser closed");
	}
	
	@After(order=1)
	public void teardown() {
		System.out.println("Browser is closed after quit method");
	}
	
	/*
	 * @AfterStep public void BBB() {
	 * 
	 * System.out.println("This is after step statement"); }
	 */
	
	@Given("navigate to google page")
	public void navigate_to_google_page() {
		driver.get("https://www.google.co.in/");
	}

	@When("search for pen")
	public void search_for_pen() {
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Pen");
	}

	@When("click on enetr button")
	public void click_on_enetr_button() {
		driver.findElement(By.name("btnK")).click();
	}

	@Then("pen page should display")
	public void pen_page_should_display() {
		String actualString=driver.getTitle();
		Assert.assertEquals(actualString, "Pen - Google Search","Title verification is successful");
	}
	
	@Then("Image page should display")
	public void Image_page_should_display() {
		String actualString=driver.getTitle();
		Assert.assertEquals(actualString, "Google Images","Title verification is successful");
	}

	@When("click on image link")
	public void click_on_image_link() {
	    driver.findElement(By.linkText("Images")).click();
	}

}
