package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {
	WebDriver driver;
	WebElement searchBar;
	@SuppressWarnings("deprecation")

	@Given("browser is open")
	public void browser_is_open() {
		//System.getProperty("user.dir", null);
		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@Given("user is on amazon search page")
	public void user_is_on_amazon_search_page() {

		driver.get("https://www.amazon.com/");
		searchBar=driver.findElement(By.id("twotabsearchtextbox"));

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {

		searchBar.sendKeys("Women Watch");
		Thread.sleep(2000);


	}

	@When("hits enter")
	public void hits_enter() {
		searchBar.sendKeys(Keys.ENTER);

	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Step- user in navigated to the home page");
		driver.getPageSource().contains("Samsung Galaxy Watch 4 40mm Smartwatch with ECG Monitor Tracker for Health Fitness Running Sleep Cycles GPS Fall Detection Bluetooth US Version, Pink Gold");
		driver.close();
	}
}
