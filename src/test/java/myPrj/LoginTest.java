package myPrj;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pagerepo.Dashboard;
import pagerepo.LoginPage;

public class LoginTest extends BaseClass{
		
	
	
	@Test(description="This testcase verifies successful Login")
	public void loginValid() {
		
		LoginPage login = new LoginPage(driver);
		login.inputEmail().sendKeys(login.email());
		login.inputPassword().sendKeys(login.password());
		login.loginBtn().click();
		System.out.println("Logged in successfully\n"+
							"Now verifying Login by validating Dashboard text..");
		
		Dashboard dashboardText = new Dashboard(driver);
		String actualDashboardText = dashboardText.dashboadText().getText().trim();
		//System.out.println(actualDashboardText);
		String expectedDashboardText = "Dashboard";
		assertEquals(actualDashboardText, expectedDashboardText);
		Reporter.log("==Login Test case Verified==", true);
		
	}
		

}
