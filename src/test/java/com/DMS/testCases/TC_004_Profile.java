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
		lp.setPassword("Neethu@1");
		lp.clickLogin();
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.changePassword("Neethu@1", "Neethu@2", "Neethu@2");
		pp.changePasswordAlert();	
	}
	
	@Test(priority=2, description = "Create digi sign password")
	public void createDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.createDigiSign("Neethu@1", "Neethu@1");
		pp.DigiSignPwdCreationAlert();
		
	}
	
	@Test(priority=3, description = "Update digi sign password")
	public void updatePasswordForDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.updatePasswordForDigiSign("Neethu@1", "Neethu@2", "Neethu@2");
		pp.digiSignChangePasswordAlert();
	}
	
	@Test(priority=4, description = "Forgot digi sign password")
	public void forgotDigiSignPassword() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.forgotDigiSignPwd("Neethu@2");
		pp.forgotDigiSignPwdAlert();
	}
	
	

}

