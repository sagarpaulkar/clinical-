package OPENEMR.Clinical.PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	@FindBy(id="authUser") private WebElement username; 
	@FindBy(id="clearPass") private WebElement password;
	@FindBy(xpath="//select[@class='form-control']") private WebElement language;
	@FindBy(id="login-button") private WebElement login;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername() {
		username.sendKeys("admin");
	}
	
	public void enterPassword() {
		password.sendKeys("pass");
	}
	
	public void language() {
		Select s= new Select(language);
		s.selectByVisibleText("English (Indian)");
	}
	
	public void clickLogin() {
		login.click();
	}
	
}
