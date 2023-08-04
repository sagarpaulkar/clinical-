package OPENEMR.Clinical.PAGES;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modules {

	private WebDriver driver;
  	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(xpath="//*[@id='mainMenu']/div/div[8]/div") private WebElement modules;
	@FindBy(xpath="//*[@id='mainMenu']/div/div[8]/div/ul/li[1]/div") private WebElement manageModules;
	@FindBy(xpath="//*[@id='table-6']/thead/tr[3]") private List<WebElement> rows;
	@FindBy(xpath="//*[@id='table-6']/thead/tr[3]/th") private List<WebElement> cols;
	@FindBy(xpath="//*[@id='framesDisplay']/div[2]/iframe") private WebElement frame;
	
	public Modules(WebDriver driver) {
        this.driver = driver;
        this.actions=new Actions(driver);
        PageFactory.initElements(driver, this);
    }
	
	public void modules(WebDriver driver) {
		actions.moveToElement(modules).perform();
		manageModules.click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent()); 
		System.out.println("Alert Text: " + alert.getText());
        alert.accept();
		
		int row = rows.size();
		int col = cols.size();
		
		for(int r=0;r<=row;r++) {
			for(int c=0;c<=col;c++) {
				String data = driver.findElement(By.xpath("//*[@id='table-6']/thead/tr["+r+"]/th["+c+"]")).getText();
			}
		}
		
		
	}
	
	
}
