package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageobjects {
	
	public WebDriver driver; 
	
	By firstname=By.xpath("//input[@name='UserFirstName']"); 
	By Lastname=By.xpath("//input[@name='UserLastName']"); 
	By jobtitle=By.xpath("//input[@name='UserTitle']");
	
	By Email=By.xpath("//input[@name='UserEmail']");
	By Phone=By.xpath("//input[@name='UserPhone']");
	
	By Employees=By.xpath("//select[@name='CompanyEmployees']");
	By Company=By.xpath("//input[@name='CompanyName']");
	
	By Country=By.xpath("//select[@name='CompanyCountry']");
	
	By StartMyFreeTRial=By.xpath("//button[@type='submit']");
 
	 
	public SignupPageobjects(WebDriver driver2) {
		 this.driver=driver2;	
	
	}
	public WebElement enterFirstname() { 
		return driver.findElement(firstname); }
	 public WebElement enterLastname() {
		 return driver.findElement(Lastname);}
	 public WebElement Jobtitle() {
		 return driver.findElement(jobtitle);}
	 public WebElement Email() {
		 return driver.findElement(Email);}
	 public WebElement Phone() {
		 return driver.findElement(Phone);}
	 public WebElement Employees() {
		 return driver.findElement(Employees);}
	 public WebElement company() {
		 return driver.findElement(Company);}
	 public WebElement Country() {
		 return driver.findElement(Country);}
	 public WebElement  StartMyFreeTRial() {
		 return driver.findElement( StartMyFreeTRial);}
}
