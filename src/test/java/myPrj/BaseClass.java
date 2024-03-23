package myPrj;

<<<<<<< HEAD
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
=======
import java.util.Scanner;
>>>>>>> origin/main
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
	
<<<<<<< HEAD
	static WebDriver driver;
	Properties prop;
=======
	WebDriver driver;
	String baseUrl = "https://cloud-frontend-topaz.vercel.app";
	Scanner sc;
>>>>>>> origin/main
	
	@BeforeMethod
	public void setUp() {
		
		Reporter.log("====BROWSER SESSION STARTED====", true);
<<<<<<< HEAD
		
		prop = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");

        try {
        	if (inputStream != null) {
                prop.load(inputStream);
            } else {
                System.out.println("config.properties file not found!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String browserChoice = prop.getProperty("browser");
        String baseUrl = prop.getProperty("baseUrl");
		
				
	switch(browserChoice) {
	
	case "chrome": 
=======
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
>>>>>>> origin/main
			Reporter.log("===STARTING WITH CHROME BROWSER===", true);
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);
			break;
			
<<<<<<< HEAD
	case "firefox": 
=======
	case 2: 
>>>>>>> origin/main
			Reporter.log("===STARTING WITH FIREFOX BROWSER===", true);
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);
			break;
	
	
<<<<<<< HEAD
	case "edge": 
=======
	case 3: 
>>>>>>> origin/main
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
