package com.DMS.testCases;

import Base.BaseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.Profile;

public class TC_004_Profile extends BaseClass {

	@Test(priority=1, description = "Change password for DMS account")
	public void changePassword_DMS_Account() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("richu@yopmail.com");
		lp.setPassword("Neethu@3");
		lp.clickLogin();
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.changePassword("Neethu@3", "Neethu@4", "Neethu@4");
		pp.changePasswordAlert();	
	}
	
	/*@Test(priority=2, description = "Create digi sign password")
	public void createDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.createDigiSign("Neethu@1", "Neethu@1");
		pp.DigiSignPwdCreationAlert();
		
	}*/
	
	@Test(priority=2, description = "Update digi sign password")
	public void updatePasswordForDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.updatePasswordForDigiSign("Neethu@4", "Neethu@5", "Neethu@5");
		pp.digiSignChangePasswordAlert();
	}
	
	@Test(priority=3, description = "Forgot digi sign password")
	public void forgotDigiSignPassword() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.forgotDigiSignPwd("Neethu@4");
		pp.forgotDigiSignPwdAlert();
	}
	
	

}

