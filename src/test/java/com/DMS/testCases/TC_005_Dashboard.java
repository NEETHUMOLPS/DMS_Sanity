package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.Dashboard;

import Base.BaseClassTest;

public class TC_005_Dashboard extends BaseClassTest {

	@Test(priority=1)
	public void approveTrainingPlan() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.sign_ApproveTrainingPlan("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		db.sign_ApproveTrainingPlan_Alert();
		db.Dashboard2();
	}
	
	@Test(priority=2)
	public void signDocument() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.signDocument("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		db.signAlert();
		db.Dashboard2();
	}
	
	@Test(priority=3)
	public void signProcessTrainingAcknowledgement() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.signProcessTrainingAcknowledgement("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		db.signProcessTrainingAcknowledgement_Alert();
		db.Dashboard2();
	}
	
	@Test(priority=4)
	public void signOnlineTestReport() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.signOnlineTestReport("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		db.signOnlineTestReport_Alert();
		db.Dashboard2();
	}
	

}
