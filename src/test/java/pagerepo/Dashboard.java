package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {

	WebDriver driver;
	
	private By dahboardText = By.xpath("//span[text()=' Dashboard']");
	
	public Dashboard(WebDriver driver){
		
		this.driver= driver;
		}
	
	public WebElement dashboadText() {
		
		return driver.findElement(dahboardText);
	}
}
