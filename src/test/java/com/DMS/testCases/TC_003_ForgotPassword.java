package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ForgotPassword;

import Base.BaseClass;

public class TC_003_ForgotPassword extends BaseClass {
	
	@Test
	public void forgotPassword() throws IOException, InterruptedException
	{		
		logger.info("URL is opened");
		ForgotPassword fp=new ForgotPassword(driver);
		fp.clickOnForgotPassword();
		fp.accoutEmail("neethu@yopmail.com");
		fp.Alert();	
	}

}
