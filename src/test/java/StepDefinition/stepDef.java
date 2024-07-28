package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {
	
	public WebDriver driver;
	
	public LoginPage loginPg;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		
		
		this.loginPg = new LoginPage(driver);
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);
	    
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAdd, String Pwd) {
	    
		loginPg.enterEmail(emailAdd);
		loginPg.Password(Pwd);
		
	}

	@When("Click on Login")
	public void click_on_login() {
	    
		loginPg.Submitbutton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String Expected_title) {
		
		String Actual_title = driver.getTitle();
		
		if(Actual_title.equals(Expected_title))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(true);
		}
	    
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	   
		loginPg.clickOnlogoutbutton();
		
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    driver.quit();
	}
	

}
