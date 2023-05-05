package testCases;


import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constant;


public class VerifyLogIn extends BaseClass {
	
	
		@Test
		 public void login() throws IOException {  
		  
		    
		  LoginPageObjects  LPO=new LoginPageObjects (driver);  
		  LPO.enterUsername().sendKeys(Constant.username);  
		  LPO.enterpassword().sendKeys(Constant.password);
		  LPO.clickLogin().click();  
		  
		  String actualText=LPO.errorText().getText();
		  String expectedText="Please check your username. If you still can't log in, contact your Salesforce administrator.";
		  CommonMethods.handleAssertions(actualText,expectedText , "error message is not valid");
	        
	        
	       //String privacyActualText=LPO.privacyText().getText();
	         
	       //String privacyExpctedText="Privacy";
	       
	      // CommonMethods.handleAssertions(privacyActualText,privacyExpctedText , "privayc text is not showing on screen");

	  
	     
	       // CommonMethodns.handlseeAssertion(s.getFirstSelectedOption().getText(), "Option2","dd")
	     
	 }

}
	 
	 
	 

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	  
	  
	 

	 
	 
	 

	


