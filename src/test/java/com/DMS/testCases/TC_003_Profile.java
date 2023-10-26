package com.DMS.testCases;

import Base.BaseClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.Profile;

public class TC_003_Profile extends BaseClass {

	@Test(priority=1)
	public void changePassword() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethur@yopmail.com");
		lp.setPassword("Neethu@1");
		lp.clickLogin();
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.changePassword("Neethu@1", "Neethu@2", "Neethu@2");
		pp.changePasswordAlert();	
	}
	
	@Test(priority=2)
	public void createDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.createDigiSign("Digi@123", "Digi@123");
		pp.digiSignUpdatePasswordAlert();
		
	}
	
	@Test(priority=3)
	public void updatePasswordForDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.updatePasswordForDigiSign("Digi@123", "Digi@1234", "Digi@1234");
		pp.digiSignChangePasswordAlert();
	}
	
	@Test(priority=4)
	public void editSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.editSign("NE", "neethug@yopmail.com", "Digi@4321");
	}
	
	@Test(priority=5)
	public void selectSignatureStyle() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.selStyle();
	}
	

}

