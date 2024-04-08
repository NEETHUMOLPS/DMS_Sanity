package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ConfigProcessTraining;

import Base.BaseClassTest;

public class TC_014_ConfigProcessTraining extends BaseClassTest {

	
	@Test(priority=1, description = "Assign SOP")
	public void assignSOP() throws IOException, InterruptedException
	{
		ConfigProcessTraining cp = new ConfigProcessTraining(driver);
		cp.clickOnConfigProcessTraining();
		cp.searchByName("Neethumol PS");
		cp.selUser("Neethumol PS");
		cp.assignTraining("Problem Management", "Neethur R", "06-04-2024", "06-04-2024");
		cp.invitationAlert();	
	}
	

}
