package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTestProject {

	WebDriver driver;
	WebElement ele;
	@Given("test project browser is open")
	public void test_project_browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@When("user landed to the login page")
	public void user_landed_to_the_login_page() {
		driver.get("https://example.testproject.io/web/");
	}

	@When("ˆuser enters (.*) and(.*)$")
	public void user_enters_valid_username_and_password(String username,String password) {
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	}
	
@And("user enter click")
	public void user_enter_click() {
	System.out.println("Click login button");
	driver.findElement(By.id("login")).click();
	
}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.findElement(By.id("logout")).isDisplayed();
		driver.quit();
	}
}
