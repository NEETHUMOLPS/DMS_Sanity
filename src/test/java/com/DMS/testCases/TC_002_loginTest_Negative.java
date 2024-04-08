package com.DMS.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.DMS.pageObjects.LoginPage;
import com.DMS.utilities.XLUtility;

import Base.BaseClass;
import org.testng.asserts.SoftAssert;

public class TC_002_loginTest_Negative extends BaseClass{

	@Test(priority=1 , description = "Login with invalid credentials")
	public void loginWithInvalidCredentials() throws InterruptedException
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethumolp@datamatica.uk1");
		logger.info("Entered username");
		lp.setPassword("Ryan@12345");
		logger.info("Enterd password");
		lp.clickLogin();
		Thread.sleep(10000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg(), "Invalid username or password");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}	
	
	}


