package OPENEMR.Clinical.PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Contact {
	
	@FindBy(xpath="//button[text()='Contact']") private WebElement title;
	@FindBy(id="form_street") private WebElement address;
	@FindBy(id="form_street_line_2") private WebElement address2;
	@FindBy(name="form_city") private WebElement formCity;
	@FindBy(name="form_state") private WebElement formState;
	@FindBy(id="form_postal_code") private WebElement formPostalCode;
	@FindBy(id="form_country_code") private WebElement formCountryCode;
	@FindBy(id="form_mothersname") private WebElement formMothersName;
	@FindBy(id="form_contact_relationship") private WebElement formContactRelationship;
	@FindBy(id="form_phone_contact") private WebElement formPhoneContact;
	@FindBy(id="form_phone_home") private WebElement formPhoneHome;
	@FindBy(id="form_phone_biz") private WebElement formPhoneBiz;
	@FindBy(id="form_phone_cell") private WebElement formPhoneCell;
	@FindBy(id="form_email") private WebElement formEmail;
	@FindBy(id="form_email_direct") private WebElement formEmailDirect;
	@FindBy(id="form_county") private WebElement formCounty;
	
	public Contact ( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickcontact() {
		title.click();
	}
	public void address1() {
		address.sendKeys("s1");
	}
	public void address2() {
		address2.sendKeys("s2");
	}
	public void formcity() {
		formCity.sendKeys("A");
	}
	public void formState() {
		Select fs=new Select(formState);
		fs.selectByVisibleText("Alabama");
	}
	public void formPostalCode() {
		formPostalCode.sendKeys("444001");
	}
	public void formCountryCode() {
		Select fc=new Select(formCountryCode);
		fc.selectByVisibleText("USA");
	}
	public void formMothersName() {
		formMothersName.sendKeys("SKP");
	}
	public void formContactRelationship() {
		formContactRelationship.sendKeys("Mother");
	}
	
	public void formPhoneContact() {
		formPhoneContact.sendKeys("9922");
	}
	public void formPhoneHome() {
		formPhoneHome.sendKeys("4123");
	}
	public void formPhoneBiz() {
		formPhoneBiz.sendKeys("77");
	}
	public void formPhoneCell() {
		formPhoneCell.sendKeys("412");
	}
	public void formEmail() {
		formEmail.sendKeys("skp@gmail.com");
	}
	public void formEmailDirect() {
		formEmailDirect.sendKeys("pkp@gmail.com");
	}
	
	public void formCounty() {
		Select fc2=new Select(formCounty);
		fc2.selectByVisibleText("BARRY");
	}
}
