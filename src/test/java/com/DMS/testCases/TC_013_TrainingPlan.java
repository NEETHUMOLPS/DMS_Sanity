package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.TrainingPlan;

import Base.BaseClass;

public class TC_013_TrainingPlan  extends BaseClass {

	@Test(priority=1, description = "Add my training plan")
	public void addTrainingPlan_MyTrainingPlan() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethumolp@datamatica.uk");
		lp.setPassword("Ryan@1234");
		lp.clickLogin();
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlan();
		tp.clickOnAddTrainingPlan_MyTrainingPlan("Performance Testing", "07-04-2024", "07-04-2024", "07-04-2024", "07-04-2024", "Self", "Neethur R");
		tp.addTrainingPlanAlert_MyTrainingPlan();	
	}
	
	@Test(priority=2, description = "Export the training plan details")
	public void export_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.export_MyTrainingPlan();
	}
	
	@Test(priority=3, description = "Assign training plan")
	public void addTrainingPlan_addTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnAddTrainingPlan();
		tp.clickOnAddTrainingPlan_AddTrainingPlan("Performance Testing", "07-04-2024", "07-04-2024", "Self", "Neethumol PS");
		tp.addTrainingPlanAlert_AddTrainingPlan();
		LoginPage lp=new LoginPage(driver);
		lp.profileIcon();
		lp.logout();
	}
	
	@Test(priority=4, description = "Sign the completed training plan")
	public void sign_TrainingPlanForApproval() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethur@yopmail.com");
		lp.setPassword("Neethu@r1");
		lp.clickLogin();
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlan();
		tp.clickOnTrainingPlanForApproval();
		tp.searchStatus2("Planned");
		tp.sign1_TrainingPlanForApproval("Performance Testing");
		tp.sign2_TrainingPlanForApproval("neethur@yopmail.com", "Neethu@r1", "Approval");
		tp.signALert_TrainingPlanForApproval();
	}
	

	

}
