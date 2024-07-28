package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath="//*[@id ='Email']")
	WebElement email;
	
	@FindBy(xpath = "//*[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//*[@class='button-1 login-button']")
	WebElement Submitbutton;
	
	@FindBy(xpath= "//a[@class='ico-logout']")
    WebElement LogOutButton;
	
	public void enterEmail(String emailAdd)
	{
		email.sendKeys(emailAdd);
	}
	
	public void Password(String Pwd)
	{
		password.sendKeys(Pwd);
	}
	
	public void Submitbutton()
	{
		Submitbutton.click();;
	}
	
	public void clickOnlogoutbutton()
	{
		LogOutButton.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*[@id='Email']

}