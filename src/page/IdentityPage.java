package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdentityPage {
	
	By passportNum = By.cssSelector(
			"body > table:nth-child(19) > tbody > tr:nth-child(2) > td:nth-child(3) > form:nth-child(7) > table:nth-child(10) > tbody > tr > td > table > tbody > tr:nth-child(2) > td:nth-child(3) > input[type='text']");
	By submitBtn = By.cssSelector(
			"body > table:nth-child(19) > tbody > tr:nth-child(2) > td:nth-child(3) > form:nth-child(7) > table:nth-child(13) > tbody > tr > td > input[type='button']:nth-child(2)");
	
	public void inputPassportNum(WebDriver d, String passport){
		d.findElement(passportNum).sendKeys(passport);
		d.findElement(submitBtn).click();
	}
}
