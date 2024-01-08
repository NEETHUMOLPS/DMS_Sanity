package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.TrainingPlan;

import Base.BaseClassTest;

public class TC_013_TrainingPlan  extends BaseClassTest {

	@Test(priority=1, description = "Add my training plan")
	public void addTrainingPlan_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlan();
		tp.clickOnAddTrainingPlan_MyTrainingPlan("Performance Testing", "07-01-2024", "07-01-2024", "07-01-2024", "07-01-2024", "Self", "Neethu Tester");
		tp.addTrainingPlanAlert_MyTrainingPlan();	
	}
	
	@Test(priority=2, description = "Export the training plan details")
	public void export_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.export_MyTrainingPlan();
	}
	
	@Test(priority=3, description = "Sign the completed training plan")
	public void sign_TrainingPlanForApproval() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlanForApproval();
		tp.searchStatus2("Planned");
		tp.sign1_TrainingPlanForApproval("Selenium2");
		tp.sign2_TrainingPlanForApproval("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		tp.signALert_TrainingPlanForApproval();
	}
	
	@Test(priority=4, description = "Assign training plan")
	public void addTrainingPlan_addTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnAddTrainingPlan();
		tp.clickOnAddTrainingPlan_AddTrainingPlan("Performance Testing", "07-01-2024", "07-01-2024", "Self", "Neethumol PS");
		tp.addTrainingPlanAlert_AddTrainingPlan();
	}
	

}
