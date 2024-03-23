package myPrj;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

<<<<<<< HEAD
import pagerepo.DashboardPage;
=======
import pagerepo.Dashboard;
>>>>>>> origin/main
import pagerepo.LoginPage;

public class LoginTest extends BaseClass{
		
	
	
<<<<<<< HEAD
	@Test(priority=1, description="This testcase verifies successful Login")
=======
	@Test(description="This testcase verifies successful Login")
>>>>>>> origin/main
	public void loginValid() {
		
		LoginPage login = new LoginPage(driver);
		login.inputEmail().sendKeys(login.email());
		login.inputPassword().sendKeys(login.password());
		login.loginBtn().click();
		System.out.println("Logged in successfully\n"+
							"Now verifying Login by validating Dashboard text..");
		
<<<<<<< HEAD
		DashboardPage dashboardText = new DashboardPage(driver);
		String actualDashboardText = dashboardText.dashboardLinkText().getText().trim();
=======
		Dashboard dashboardText = new Dashboard(driver);
		String actualDashboardText = dashboardText.dashboadText().getText().trim();
>>>>>>> origin/main
		//System.out.println(actualDashboardText);
		String expectedDashboardText = "Dashboard";
		assertEquals(actualDashboardText, expectedDashboardText);
		Reporter.log("==Login Test case Verified==", true);
		
	}
<<<<<<< HEAD
	
			
=======
		
>>>>>>> origin/main

}
