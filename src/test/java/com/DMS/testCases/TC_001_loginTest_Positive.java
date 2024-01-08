package com.DMS.testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.DMS.pageObjects.LoginPage;
import Base.BaseClass;
public class TC_001_loginTest_Positive extends BaseClass {
	
	@Test(priority = 1 , description = "Login with valid credentials")
	public void loginWithValidCredentials() throws IOException
	{
		
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Enterd password");
		lp.clickLogin();
		logger.info("login success");
		Assert.assertEquals(lp.verifyHomepage(),"Dashboard");
		logger.info("homepage verified");
		lp.profileIcon();
		lp.logout();
		logger.info("logged out successfully");
	
	}
}

