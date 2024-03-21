package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
 
	private By inputEmail = By.xpath("//input[@name='emailOrPhone']");
	private By inputPassword = By.xpath("//input[@name='password']");
	private By loginBtn = By.xpath("//button[text()=' Sign in']");
	
	private String email = "namanthaiba@gmail.com";
	private String password = "Test@123";
	
		
	
	  public LoginPage(WebDriver driver) {
	  
	  this.driver=driver; }
	 

	public WebElement inputEmail() {
		
		return driver.findElement(inputEmail);
	}
	
	public WebElement inputPassword() {
		
		return driver.findElement(inputPassword);
	}
	
	public WebElement loginBtn() {
		
		return driver.findElement(loginBtn);
	}
	
	public String email() {
		
		return email;
	}
	
	public String password() {
		
		return password;
	}
	
	
	
	
}
