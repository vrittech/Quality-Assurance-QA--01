package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
	WebDriver driver;
	
	private By dashboardLinkText = By.xpath("//span[text()=' Dashboard']");
	private By loginInStatusText = By.xpath("//div[@class='container px-4 mt-12 mx-auto ']/descendant::div[1]");
	private By greetingText = By.xpath("//div[@class='container px-4 mt-12 mx-auto ']/descendant::div[2]");
	
	public DashboardPage(WebDriver driver){
		
		this.driver = driver;		
		
	}
	
	public WebElement dashboardLinkText() {
		
		return driver.findElement(dashboardLinkText);
		
	}
	
	public WebElement loginInStatusText() {
		
		return driver.findElement(loginInStatusText);
	}
	
	public WebElement greetingText() {
		
		return driver.findElement(greetingText);
	}

}
