package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusPage {

	By currentStatus = By.cssSelector(
			"body > table:nth-child(19) > tbody > tr:nth-child(2) > td:nth-child(3) > form > table:nth-child(10) > tbody > tr > td > table > tbody > tr:nth-child(6) > td:nth-child(3)");
	By exitBtn = By.cssSelector("#itemTextLink1");

	public void checkStatus(WebDriver d) {
		String result = d.findElement(currentStatus).getText();
		System.out.println("EP status is: " + result);
	}
	
	public void exitPage(WebDriver d){
		d.findElement(exitBtn).click();
	}

}
