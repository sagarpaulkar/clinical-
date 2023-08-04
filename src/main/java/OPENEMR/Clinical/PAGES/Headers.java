package OPENEMR.Clinical.PAGES;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headers {
	@FindBy(xpath = "//div[@class='appMenu navbar-nav mr-auto']") private List<WebElement> headers;

	public Headers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void headerList() {
		Map<String, String> m= new HashMap<String,String>();
		List<WebElement> head = headers;
        for (WebElement header : head) {
           String h1=header.getText();
           String h2=header.getAttribute("class");
           m.put(h1, h2);
        }
        
        for (Map.Entry<String, String> list : m.entrySet()) {
        	System.out.println("Text:-"+list.getKey());
        	System.out.println("Text:-"+list.getValue());
        	System.out.println("-------------------------------------");
        	
        }
        
    }
	
	
}
