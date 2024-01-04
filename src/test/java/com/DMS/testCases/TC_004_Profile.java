package com.DMS.testCases;

import Base.BaseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.Profile;

public class TC_004_Profile extends BaseClass {

	@Test(priority=1)
	public void changePassword() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethu@yopmail.com");
		lp.setPassword("Neethu@9");
		lp.clickLogin();
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.changePassword("Neethu@9", "Neethu@10", "Neethu@10");
		pp.changePasswordAlert();	
	}
	
	/*@Test(priority=2)
	public void createDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.createDigiSign("Digi@123", "Digi@123");
		pp.digiSignUpdatePasswordAlert();
		
	}*/
	
	@Test(priority=3)
	public void updatePasswordForDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.updatePasswordForDigiSign("Neethu@9", "Neethu@10", "Neethu@10");
		pp.digiSignChangePasswordAlert();
	}
	
	@Test(priority=4)
	public void forgotDigiSignPassword() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.forgotDigiSignPwd("Neethu@10");
		pp.forgotDigiSignPwdAlert();
	}
	
	@Test(priority=5)
	public void editSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.editSign("NE", "neethu@yopmail.com", "Neethu@10");
	}
	
	@Test(priority=6)
	public void selectSignatureStyle() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.selStyle();
	}
	

}

