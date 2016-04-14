package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationPage {
	
	By IC = By.cssSelector(
			"body > table:nth-child(19) > tbody > tr:nth-child(2) > td:nth-child(3) > form > table:nth-child(4) > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(3) > input[type='text']");
	By Name = By.cssSelector(
			"body > table:nth-child(19) > tbody > tr:nth-child(2) > td:nth-child(3) > form > table:nth-child(4) > tbody > tr > td > table > tbody > tr:nth-child(2) > td:nth-child(3) > input[type='text']");
	By nextBtn = By.cssSelector(
			"body > table:nth-child(19) > tbody > tr:nth-child(2) > td:nth-child(3) > form > table:nth-child(4) > tbody > tr > td > table > tbody > tr:nth-child(3) > td:nth-child(3) > input[type='button']");
	
	public void inputICAndName(WebDriver d, String ic, String name){
		d.findElement(IC).sendKeys(ic);
		d.findElement(Name).sendKeys(name);
		d.findElement(nextBtn).click();
	}
	
}
