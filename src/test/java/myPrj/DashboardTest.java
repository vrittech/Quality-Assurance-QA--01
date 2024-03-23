package myPrj;

<<<<<<< HEAD
import org.testng.Reporter;
import org.testng.annotations.Test;
import pagerepo.DashboardPage;
import pagerepo.LoginPage;

public class DashboardTest extends BaseClass{
	
	
	@Test(priority=20)
	
	public void verifyLoginStatusText() {
		
		LoginPage login = new LoginPage(driver);
		login.callLogin();
		
		DashboardPage dashboardItem = new DashboardPage(driver);
		String loginStatusText =dashboardItem.loginInStatusText().getText();
		if(dashboardItem.loginInStatusText().isDisplayed()) {
			System.out.println("Login Status text is : "+loginStatusText);
			Reporter.log("==Login Status Text shown and is Verified!", true);
		}
	}

	
	@Test(priority=30)
	
	public void verifyGreetingText() {
		
		LoginPage login = new LoginPage(driver);
		login.callLogin();
		
		DashboardPage dashboardItem = new DashboardPage(driver);
		String greetingText = dashboardItem.greetingText().getText();
		if(dashboardItem.greetingText().isDisplayed()) {
			System.out.println("Greeting text is : "+ greetingText);
			Reporter.log("==Greeting Text is verified!", true);
		}
	}
=======
public class DashboardTest {
	
>>>>>>> origin/main
	

}
