package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.TrainingPlan;

import Base.BaseClassTest;

public class TC_TrainingPlan  extends BaseClassTest {

	@Test(priority=1)
	public void addTrainingPlan_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlan();
		tp.clickOnAddTrainingPlan_MyTrainingPlan("Performance Testing", "14-11-2023", "14-11-2023", "14-11-2023", "14-11-2023", "Self", "Neethu Tester");
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
	
	/*@Test(priority=4)
	public void plannedDateSearch_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.searchDate1_MyTrainingPlan("30-10-2023", "02-11-2023");
		Assert.assertTrue(tp.dateSearchValidation1_MyTrainingPlan("30-OCT-2023\n"
				+ "to\n"
				+ "2-NOV-2023"));
		logger.info("Date search functionality verified");	
		tp.clearSearchDate_MyTrainingPlan();
	}
	
	@Test(priority=5)
	public void actualDateSearch_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.searchDate2_MyTrainingPlan("03-11-2023", "07-11-2023");
		Assert.assertTrue(tp.dateSearchValidation2_MyTrainingPlan("30-OCT-2023\r\n"
				+ "to\r\n"
				+ "2-NOV-2023"));
		logger.info("Date search functionality verified");	
		tp.clearSearchDate_MyTrainingPlan();
	}
	
	@Test(priority=6)
	public void statusSearch_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.searchStatus_MyTrainingPlan("Completed");
		Assert.assertTrue(tp.statusSearchValidation_MyTrainingPlan("Signed By"));
		logger.info("Status search functionality verified");	
		tp.clearSearchDate_MyTrainingPlan();
	}*/
	
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
		tp.sign1_TrainingPlanForApproval("Performance Testing");
		tp.sign2_TrainingPlanForApproval("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		tp.signALert_TrainingPlanForApproval();
	}
	
	@Test(priority=6)
	public void addTrainingPlan_addTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnAddTrainingPlan();
		tp.clickOnAddTrainingPlan_AddTrainingPlan("Performance Testing", "15-11-2023", "15-11-2023", "Self", "Neethumol P S");
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
