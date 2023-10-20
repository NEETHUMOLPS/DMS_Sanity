package com.DMS.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.DMS.pageObjects.LoginPage;
import com.DMS.utilities.XLUtility;

import Base.BaseClass;
import org.testng.asserts.SoftAssert;

public class TC_002_loginTest_Negative extends BaseClass{

	@Test(dataProvider="LoginData")
	public void LoginTestNegative(String email, String pwd) throws InterruptedException
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.clearEmail();
		lp.setEmail(email);	
		logger.info("Email provided");
		lp.clearPwd();
		lp.setPassword(pwd);
		logger.info("Pssword provided");
		lp.clickLogin();
		Thread.sleep(3000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg(), "Invalid username or password");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}	
		
	@DataProvider(name="LoginData")
	 String [][] getData() throws IOException
	{
		
		String path = "C:\\Users\\lenovo\\OneDrive\\Desktop\\DMS\\Login_Negative.xlsx";
		int rownum=XLUtility.getRowCount(path, "Sheet1");
		int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
		for(int j=0;j<colcount;j++)
		{
			logindata[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
	}	
	return logindata;		
	}	
	}


