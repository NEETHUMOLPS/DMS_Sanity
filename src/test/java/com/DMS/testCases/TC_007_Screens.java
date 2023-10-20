package com.DMS.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.DMS.pageObjects.Screens;

import Base.BaseClassTest;

public class TC_007_Screens extends BaseClassTest {

	@Test(priority=1)
	public void addScreen() throws IOException, InterruptedException
	{
		Screens sp = new Screens(driver);
		sp.clickOnScreesMenu();
		sp.AddScreen("Documents");
		sp.screenCreationAlert();
	}
	
	@Test(priority=2)
	public void editScreen() throws IOException, InterruptedException
	{
		Screens sp = new Screens(driver);
		sp.selScreen("Documents");
		sp.EditScreen("Documents new");
		sp.screenUpdationAlert();
	}
	
	@Test(priority=3)
	public void addControl() throws IOException, InterruptedException
	{
		Screens sp = new Screens(driver);
		sp.addControl("Control1");
		sp.controlCreationAlert();
	}
	
	@Test(priority=4)
	public void editControl() throws IOException, InterruptedException
	{
		Screens sp = new Screens(driver);
		sp.editControl("Control2");
		sp.controlUpdationAlert();
	}
	
	@Test(priority=5)
	public void deleteControl() throws IOException, InterruptedException
	{
		Screens sp = new Screens(driver);
		sp.deleteControl();
		sp.controlDeletionAlert();
	}
}
