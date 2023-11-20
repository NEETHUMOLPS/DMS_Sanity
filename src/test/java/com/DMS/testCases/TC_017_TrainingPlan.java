package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.TrainingPlan;

import Base.BaseClassTest;

public class TC_017_TrainingPlan  extends BaseClassTest {

	@Test(priority=1)
	public void addTrainingPlan_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlan();
		tp.clickOnAddTrainingPlan_MyTrainingPlan("Performance Testing", "20-11-2023", "20-11-2023", "20-11-2023", "20-11-2023", "Self", "Neethu Tester");
		tp.addTrainingPlanAlert_MyTrainingPlan();	
	}
	
	@Test(priority=2)
	public void editTrainingPlan_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.searchStatus1("Planned");
		tp.edit1_MyTrainingPlan("Performance Testing");
		tp.edit2_MyTrainingPlan("NA");
		tp.editTrainingPlanAlert_MyTrainingPlan();
	}
	
	@Test(priority=3)
	public void deleteTrainingPlan_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		//tp.searchStatus1("Planned");
		tp.delete1_MyTrainingPlan("Performance Testing");
		tp.delete2_MyTrainingPlan();
		tp.deleteTrainingPlanAlert_MyTrainingPlan();
	}
	
	
	@Test(priority=4)
	public void export_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.export_MyTrainingPlan();
	}
	
	@Test(priority=5)
	public void sign_TrainingPlanForApproval() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlanForApproval();
		tp.searchStatus2("Planned");
		tp.sign1_TrainingPlanForApproval("Pen Testing");
		tp.sign2_TrainingPlanForApproval("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		tp.signALert_TrainingPlanForApproval();
	}
	
	@Test(priority=6)
	public void addTrainingPlan_addTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnAddTrainingPlan();
		tp.clickOnAddTrainingPlan_AddTrainingPlan("Performance Testing", "20-11-2023", "20-11-2023", "Self", "Neethumol P S");
		tp.addTrainingPlanAlert_AddTrainingPlan();
	}
	
	@Test(priority=7)
	public void editTrainingPlan_addTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.searchStatus3("Planned");
		tp.edit1_AddTrainingPlan("Performance Testing");
		tp.edit2_AddTrainingPlan("NA");
		tp.editTrainingPlanAlert_AddTrainingPlan();
		
	}
	
	@Test(priority=8)
	public void deleteTrainingPlan_addTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		//tp.searchStatus3("Planned");
		tp.delete1_AddTrainingPlan("Performance Testing");
		tp.delete2_AddTrainingPlan();
		tp.deleteTrainingPlanAlert_AddTrainingPlan();
	}

}
