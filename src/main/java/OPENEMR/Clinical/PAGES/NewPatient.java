package OPENEMR.Clinical.PAGES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class NewPatient {

	@FindBy(xpath="//div[text()='Patient']") private WebElement patient;
	//WebElement patient=driver.findElement(By.xpath("//div[text()='Patient']"));
	@FindBy(xpath="//div[text()='New/Search']") private WebElement newPatient;	
	@FindBy(id="form_title") private WebElement title;
	@FindBy(id="form_fname") private WebElement fname;
	@FindBy(id="form_mname") private WebElement mname;
	@FindBy(id="form_lname") private WebElement lname;
	@FindBy(id="form_suffix") private WebElement formSuffix;
	@FindBy(id="form_pubpid") private WebElement extID;
	@FindBy(id="form_DOB") private WebElement formDOB;
	@FindBy(id="form_sex") private WebElement sex;
	@FindBy(id="form_ss") private WebElement ss;
	@FindBy(id="form_drivers_license") private WebElement license;
	@FindBy(id="form_status") private WebElement maritalStatus;
	@FindBy(id="form_genericname1") private WebElement userDefined1;
	@FindBy(id="form_genericval1") private WebElement userDefined2;
	@FindBy(id="form_genericname2") private WebElement userDefined3;
	@FindBy(id="form_genericval2") private WebElement userDefined4;
	@FindBy(id="form_billing_note") private WebElement billingNote;
	@FindBy(id="form_gender_identity") private WebElement genderIdentity;
	@FindBy(id="form_sexual_orientation") private WebElement sexualOrientation;
	@FindBy(id="form_birth_fname") private WebElement bfName;
	@FindBy(id="form_birth_mname") private WebElement bmName;
	@FindBy(id="form_birth_lname") private WebElement blName;
	@FindBy(id="form_name_history") private WebElement nameHistory;
	@FindBy(id="type_52_add") private WebElement add;
	@FindBy(name="pat") private WebElement iframe1;
	@FindBy(className="closeDlgIframe") private WebElement close;
	@FindBy(id="previous_name_prefix") private WebElement prefix;
	@FindBy(id="previous_name_first") private WebElement previousFirstName;
	@FindBy(id="previous_name_middle") private WebElement previousMiddleName;
	@FindBy(id="previous_name_last") private WebElement previousLastName;
	@FindBy(id="previous_name_suffix") private WebElement previousNameSuffix;
	@FindBy(id="previous_name_enddate") private WebElement previousNameEnddate;
	@FindBy(id="form_save") private WebElement formSave;
	@FindBy(id="modalframe") private WebElement iframe;
		
	public NewPatient( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void hoverPatient(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(patient).build().perform();
	}	
	
	public void newPatientSelection() {
		newPatient.click();
	}	
	
	public void selectTitle(WebDriver driver) {
		
		driver.switchTo().frame("pat");
		Select s= new Select(title);
		s.selectByValue("Mr.");
	}
	
	public void firstName() {
			fname.sendKeys("Dharmesh");
	}
	public void middleName() {
		   mname.sendKeys("K");
	}
	public void lastName() {
		   lname.sendKeys("Yadav");
	}
	public void suffix() {
		   formSuffix.sendKeys("SKP");
	}
	public void externalID() {
		   extID.sendKeys("SKP01");
	}
	public void dob() {
		   formDOB.sendKeys("1982-12-31");
	}
	
	public void selectSex() {
		Select s= new Select(sex);
		s.selectByValue("Male");
	}
	
	public void socialSecurity() {
		   ss.sendKeys("SKP4520");
	}
	
	public void enterLicense() {
		   license.sendKeys("SKP4520");
	}
	
	public void maritalStatusSelection() {
		Select s= new Select(maritalStatus);
		s.selectByVisibleText("Single");
	}
	
	public void enteruserDefined1() {
		userDefined1.sendKeys("S");
	}
	public void enteruserDefined2() {
		userDefined2.sendKeys("K");
	}
	public void enteruserDefined3() {
		userDefined3.sendKeys("P");
	}
	public void enteruserDefined4() {
		userDefined4.sendKeys("S");
	}
	
	public void enterbillingNote() {
		billingNote.sendKeys("special permission");
	}
	
	public void enterGenderIdentity() {
	
		Select s= new Select(genderIdentity);
		//s.selectByVisibleText("Identifies as Male");
		Map<String,String> hm= new HashMap<>();
		List<WebElement> eGI = s.getOptions();
		for(WebElement eG:eGI) {
			String elementText=eG.getText();
			String elementHref=eG.getAttribute("href");
			hm.put(elementText, elementHref);		
		}
		for(Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println("Text:-"+ entry.getKey());
			System.out.println("Href:-"+ entry.getValue());
			System.out.println("______________________________________");
		}
	}
	public void entersexualorientation() {
		Select s= new Select(sexualOrientation);
		s.selectByVisibleText("Straight or heterosexual");
		
		LinkedHashSet<String>s2= new LinkedHashSet<String>();
		s2.add("Unassigned");
		s2.add("Straight or heterosexual");
		s2.add("Lesbian, gay or homosexual");
		s2.add("Bisexual");
		s2.add("Something else, please describe");
		s2.add("Don't know");
		s2.add("Choose not to disclose");
		
		Iterator<WebElement> entSex = s.getOptions().iterator();
		while(entSex.hasNext()) {
				WebElement s3= entSex.next();
			String options=s3.getText();
			
			List<WebElement> ls = s.getOptions();

			}
		
		
	}
	
	public void enterBirthFirstName() {
		bfName.sendKeys("S");
	}
	
	public void enterBirthMiddleName() {
		bmName.sendKeys("K");
	}
	
	public void enterBirthLastName() {
		blName.sendKeys("P");
	}
	
	public void enterNameHistory() {
		nameHistory.sendKeys("SKP");
	}
	public void clickAdd(WebDriver driver) {
		add.click();		
	}
	public void iframe1(WebDriver driver) {
		driver.switchTo().alert();	
		driver.switchTo().frame(iframe1);
	}
	
	public void closeiframe() {
		close.click();
	}
	public void namePrefix() {
		prefix.sendKeys("S");		
	}
	public void previousFirstName() {
		previousFirstName.sendKeys("S");		
	}
	public void previousMiddleName() {
		previousMiddleName.sendKeys("K");		
	}
	public void previousLastName() {
		previousMiddleName.sendKeys("P");		
	}
	public void previousNameSuffix() {
		previousNameSuffix.sendKeys("SKP");		
	}
	public void previousNameEnddate() {
		previousMiddleName.sendKeys("1982-12-31");		
	}
	public void formSave() {
		formSave.click();		
	}
	
	
	
}
