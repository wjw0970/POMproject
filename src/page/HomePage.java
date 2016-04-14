package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	By enquiry = By.cssSelector("#folder2 > table > tbody > tr:nth-child(2) > td:nth-child(3) > a");
	By appStatus = By.cssSelector("#itemTextLink3");
	
	public void openEP_Online_PEPOLENQM007_Requesters_Particulars(WebDriver d){
		d.findElement(enquiry).click();
		d.findElement(appStatus).click();;
	} 

}
