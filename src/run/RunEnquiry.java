package run;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import page.ApplicationPage;
import page.HomePage;
import page.IdentityPage;
import page.StatusPage;

public class RunEnquiry {
	
	WebDriver d;
	
	HomePage homepage;
	ApplicationPage appPage;
	IdentityPage idPage;
	StatusPage statPage;
	
	@BeforeTest
	public void setup(){
		d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://eponline.mom.gov.sg/epol/PEPOLENQM007DisplayAction.do");
	}

	@Test
	public void test() {
		homepage.openEP_Online_PEPOLENQM007_Requesters_Particulars(d);
		appPage.inputICAndName(d, "", "");
		idPage.inputPassportNum(d, "");
		statPage.checkStatus(d);
		Assert.assertTrue(d.getTitle().contains("Prompt to close window"));
	}
	
//	@AfterTest
//	public void teardown(){
//		d.quit();
//	}

}
