package OPENEMR.Clinical.PAGES;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Messages{

	private Actions actions;
	
	@FindBy(xpath="//*[@id='mainMenu']//div[13]/div/div") private WebElement messages;
	@FindBy(xpath="//*[@id='MessageList']/table/thead/tr/th") private List<WebElement> head;
	@FindBy(xpath="//*[@id='row1']/td") private List<WebElement> data;
	@FindBy(id="form_note_type") private WebElement formNoteType;
	
	public Messages(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.actions = new Actions(driver);
	}
	
	public void messages() {
		actions.moveToElement(messages).click().perform();
	}
	
	public void dataFetch(WebDriver driver) {
		int row = head.size();
		int col = data.size();
		for(int r=0;r<row;r++) {
			for (int c=0;c<col;c++) {
			String rowHeader = driver.findElement(By.xpath("//*[@id='MessageList']/table/thead/tr["+r+"]/th["+c+"]")).getText();
			System.out.print("==>"+ rowHeader);
			
		}
			System.out.println();
		}
		//int col = data.size();
	}
}
