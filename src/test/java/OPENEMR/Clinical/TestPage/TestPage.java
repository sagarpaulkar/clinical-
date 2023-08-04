package OPENEMR.Clinical.TestPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import OPENEMR.Clinical.BASE.Base;
import OPENEMR.Clinical.PAGES.Contact;
import OPENEMR.Clinical.PAGES.Headers;
import OPENEMR.Clinical.PAGES.LoginPage;
import OPENEMR.Clinical.PAGES.Messages;
import OPENEMR.Clinical.PAGES.Modules;
import OPENEMR.Clinical.PAGES.NewPatient;

public class TestPage extends Base{
	
	@BeforeTest	 
	public void setup() throws Exception  {
		
		Base.initializeBrowser();
	}
	@Test(priority=0)
	public void loginPageTest() {
		LoginPage lp=new LoginPage (driver);
		lp.language();
		lp.enterUsername();
		lp.enterPassword();		
		lp.clickLogin();
	}
	
	@Test(enabled= false)
	
	public void modules() {
		Modules m= new Modules(driver);
		m.modules(driver);
	}
	
	@Test(enabled=false)
	
	public void messages() {
		Messages m=new Messages(driver);
		m.messages();
	
	
		//m.dataFetch(driver);
	}
	
	@Test(enabled=false)	
	public void headerList() {
		Headers h=new Headers(driver);
		h.headerList();
	}
	
	@Test(priority=1)
	
	public void newPatient() {
		
		NewPatient np=new NewPatient(driver);
		np.hoverPatient(driver);
		np.newPatientSelection();
		np.selectTitle(driver);
		np.firstName();
		np.middleName();
		np.lastName();
		np.suffix();
		np.externalID();
		np.dob();
		np.selectSex();
		np.socialSecurity();
		np.enterLicense();
		np.maritalStatusSelection();
		np.enteruserDefined1();
		np.enteruserDefined2();
		np.enteruserDefined3();
		np.enteruserDefined4();
		np.enterbillingNote();
		np.enterGenderIdentity();
		np.entersexualorientation();
		np.enterBirthFirstName();
		np.enterBirthMiddleName();
		np.enterBirthLastName();
//		np.enterNameHistory();
//		np.clickAdd(driver);
//		np.iframe1(driver);		
//		np.closeiframe();
//		np.namePrefix();
//		np.previousFirstName();
//		np.previousMiddleName();
//		np.previousLastName();
//		np.previousNameSuffix();
//		np.previousNameEnddate();
//		np.formSave();
		
		
	}
	
	@Test(enabled=false)
	
	public void contact()
	{
		
		Contact con= new Contact(driver);
		con.clickcontact();
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
	    js.executeScript("scrollBy(0,150)");
		con.address1();
		con.address2();
		con.formcity();
		con.formState();
		con.formPostalCode();
		con.formCountryCode();
		con.formMothersName();
		con.formContactRelationship();
		con.formPhoneContact();
		con.formPhoneHome();
		con.formPhoneBiz();
		con.formPhoneCell();
		con.formEmail();
		con.formEmailDirect();
		con.formCounty();
	}
	
	
	
//	@AfterTest
//	public void teardown() {
//		driver.close();
//	}
	
}
