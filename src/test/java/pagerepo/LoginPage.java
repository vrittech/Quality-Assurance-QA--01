package pagerepo;

<<<<<<< HEAD
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

=======
>>>>>>> origin/main
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
<<<<<<< HEAD
	Properties prop;
=======
>>>>>>> origin/main
	
 
	private By inputEmail = By.xpath("//input[@name='emailOrPhone']");
	private By inputPassword = By.xpath("//input[@name='password']");
	private By loginBtn = By.xpath("//button[text()=' Sign in']");
<<<<<<< HEAD
=======
	
	private String email = "namanthaiba@gmail.com";
	private String password = "Test@123";
	
>>>>>>> origin/main
		
	
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
		
<<<<<<< HEAD
		
		prop = new Properties();
	    InputStream inputStream = getClass().getClassLoader().getResourceAsStream("secrets.properties");

	    try {
	    	if (inputStream != null) {
	            prop.load(inputStream);
	        } else {
	            System.out.println("secrets.properties file not found!");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }


	    String email = prop.getProperty("email");
	    return email;
=======
		return email;
>>>>>>> origin/main
	}
	
	public String password() {
		
<<<<<<< HEAD
		
		prop = new Properties();
	    InputStream inputStream = getClass().getClassLoader().getResourceAsStream("secrets.properties");

	    try {
	    	if (inputStream != null) {
	            prop.load(inputStream);
	        } else {
	            System.out.println("secrets.properties file not found!");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }


	    String password = prop.getProperty("password");
	    return password;
	}
	
	
	public void callLogin() {
		
		inputEmail().sendKeys(email());
		inputPassword().sendKeys(password());
		loginBtn().click();
	}
=======
		return password;
	}
	
	
	
>>>>>>> origin/main
	
}
