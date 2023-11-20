package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ConfigProcessTraining;

import Base.BaseClassTest;

public class TC_018_ConfigProcessTraining extends BaseClassTest {

	
	@Test(priority=1)
	public void assignSOP() throws IOException, InterruptedException
	{
		ConfigProcessTraining cp = new ConfigProcessTraining(driver);
		cp.clickOnConfigProcessTraining();
		cp.searchByName("Neethumol P S");
		cp.selUser("Neethumol P S");
		cp.assignTraining("Problem Management", "Neethu Tester", "20-11-2023", "20-11-2023");
		cp.invitationAlert();	
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void nameSearchValidation() throws IOException, InterruptedException
	{
		ConfigProcessTraining cp = new ConfigProcessTraining(driver);
		cp.searchByName("Neethumol P S");
		Assert.assertTrue(cp.nameSearchValidation("Neethumol P S"));
		logger.info("Name search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void designationSearchValidation() throws IOException, InterruptedException
	{
		ConfigProcessTraining cp = new ConfigProcessTraining(driver);
		cp.searchByDesignation("Quality Analyst");
		Assert.assertTrue(cp.designationSearchValidation("Quality Analyst"));
		logger.info("Designation search functionality verified");		
		driver.navigate().refresh();
	}

}
