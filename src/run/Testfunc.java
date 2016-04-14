package run;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.ApplicationPage;
import page.HomePage;
import page.IdentityPage;
import page.StatusPage;

public class Testfunc {
	public static void main(String args[]) {
		WebDriver d;
		
		HomePage homepage = new HomePage();
		ApplicationPage appPage = new ApplicationPage();
		IdentityPage idPage = new IdentityPage();
		StatusPage statPage= new StatusPage();
		
		d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://eponline.mom.gov.sg/epol/PEPOLENQM007DisplayAction.do");
		
		homepage.openEP_Online_PEPOLENQM007_Requesters_Particulars(d);
		appPage.inputICAndName(d, "", "");
		idPage.inputPassportNum(d, "");
		statPage.checkStatus(d);
		
		d.quit();
	}
}
