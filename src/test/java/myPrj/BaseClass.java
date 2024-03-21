package myPrj;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	WebDriver driver;
	String baseUrl = "https://cloud-frontend-topaz.vercel.app";
	Scanner sc;
	
	@BeforeMethod
	public void setUp() {
		
		Reporter.log("====BROWSER SESSION STARTED====", true);
		sc = new Scanner(System.in);
		System.out.println("Please select the Browser number of your choice\n");
		System.out.println("Select browsers from below:\n"+
							"1. Google Chrome \n"+
							"2. Mozilla Firefox \n"+
							"3. Microsoft Edge");
		int browserChoice = sc.nextInt();
		
		//System.out.println("you have selected "+ browserChoice + "of your choice!");
		
	switch(browserChoice) {
	
	case 1: 
			Reporter.log("===STARTING WITH CHROME BROWSER===", true);
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);
			break;
			
	case 2: 
			Reporter.log("===STARTING WITH FIREFOX BROWSER===", true);
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);
			break;
	
	
	case 3: 
			Reporter.log("===STARTING WITH EDGE BROWSER===", true);
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);
			break;
			
	default: 
		
			System.out.println("Your Browser choice has invalid selection!");		
		}
	
	}
	
	@AfterMethod
	public void tearDown() {
		
		Reporter.log("==BROWSER SESSION END==", true);
		driver.close();
		
	}

}
