package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchPage {

	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside step - Browser is opened.");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitya Krushna Sahoo\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("Opening google page.");
		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("user enters text in serach box")
	public void user_enters_text_in_serach_box() {
		System.out.println("Enter text to search");
		driver.findElement(By.name("q")).sendKeys("Lord Rama");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Click on enter in keyboard.");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Verify user in search page starts");
		if(driver.getPageSource().contains("Lord rama")){
			System.out.println("Search result page is successful");
		}else{
			System.out.println("Search result page is unsuccessful");
		}
		driver.quit();
	}
}
