package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
	WebDriver driver;
	
	private By dashboardLinkText = By.xpath("//span[text()=' Dashboard']");
	private By loginInStatusText = By.xpath("//div[@class='container px-4 mt-12 mx-auto ']/descendant::div[1]");
	private By greetingText = By.xpath("//div[@class='container px-4 mt-12 mx-auto ']/descendant::div[2]");
	private By totalApplicants = By.xpath("(//div[@class='text-neutral-400 uppercase text-label-lg'])[1]");
	private By totalApplicantsNumber = By.xpath("//div[@class='text-primary-500 font-bold  text-heading-md']");
	private By totalApplications = By.xpath("(//div[@class='text-neutral-400 uppercase text-label-lg'])[2]");
	private By totalApplicationsNumber = By.xpath("//div[@class='text-accent-500 font-bold  text-heading-md']");
	private By grantedStudent = By.xpath("(//div[@class='text-neutral-400 uppercase text-label-lg'])[3]");
	private By grantedStudentNumber = By.xpath("//div[@class='text-success-500 font-bold  text-heading-md']");
	private By totalUniversities = By.xpath("(//div[@class='text-neutral-400 uppercase text-label-lg'])[4]");
	private By totalUniversitiesNumber = By.xpath("//div[@class='text-[#FEA501] font-bold  text-heading-md']");
	
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
	
	public WebElement totalApplicants() {
		
		return driver.findElement(totalApplicants);
	}
	
	public WebElement totalApplicantsNumber() {
		
		return driver.findElement(totalApplicantsNumber);
	}
	
	public WebElement totalApplications() {
		
		return driver.findElement(totalApplications);
	}
	
	public WebElement totalApplicationsNumber() {
		
		return driver.findElement(totalApplicationsNumber);
	}
	
	public WebElement grantedStudent() {
		
		return driver.findElement(grantedStudent);
	}
	
	public WebElement grantedStudentNumber() {
		
		return driver.findElement(grantedStudentNumber);
	}
	
	public WebElement totalUniversties() {
		
		return driver.findElement(totalUniversities);
	}
	
	public WebElement totalUniversitiesNumber() {
		
		return driver.findElement(totalUniversitiesNumber);
	}

}
