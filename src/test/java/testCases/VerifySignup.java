package testCases;

import java.io.IOException;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignupPageobjects;
import resources.BaseClass;
import resources.CommonMethods;


public class VerifySignup extends BaseClass{

	
	
	 @Test 
	 public void signup() throws IOException, InterruptedException {
	   
	  
	  
		 LoginPageObjects LPO=new LoginPageObjects (driver);  
	  LPO.clicktryForFree().click(); 
	  
	  SignupPageobjects SPO=new SignupPageobjects(driver);
	  Thread.sleep(5000);
	  
	  SPO.enterFirstname().sendKeys("hello");
	  SPO.enterLastname().sendKeys("helo");
	  Thread.sleep(2000);
	  SPO.Jobtitle().sendKeys("IT");
	  CommonMethods.handleDropdown(SPO.Employees(), 1);
	  
	  CommonMethods.handleDropdown(SPO.Country(), 1);
	  
	} 
	 
	}

