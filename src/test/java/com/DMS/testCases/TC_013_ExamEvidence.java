package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ExamEvidence;

import Base.BaseClassTest;

public class TC_013_ExamEvidence extends BaseClassTest {

	
	@Test(priority=1)
	public void employeeNameSearchValidation_Initiator() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.clickOnExamEvidence1();
		ee.employeeNameSearch_Initiator("Neethu Tester");
		Thread.sleep(2000);
		Assert.assertTrue(ee.employeeNameSearchValidation_Initiator("Neethu Tester"));
		logger.info("Employee name search functionality verified");	
	}
	
	@Test(priority=2)
	public void resultSearchValidation_Initiator() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.resultSearch_Initiator("Passed");
		Thread.sleep(2000);
		Assert.assertTrue(ee.resultSearchValidation_Initiator("Passed"));
		logger.info("Result search functionality verified");	
	}
	
	@Test(priority=3)
	public void statusSearchValidation_Initiator() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.statusSearch_Initiator("Signed");
		Thread.sleep(2000);
		Assert.assertTrue(ee.statusSearchValidation_Initiator("Completed"));
		logger.info("Status search functionality verified");	
	}
	
	@Test(priority=4)
	public void dateSearchValidation_Initiator() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.dateSearch_Initiator("24-10-2023","24-10-2023");
		Thread.sleep(2000);
		Assert.assertTrue(ee.dateSearchValidation_Initiator("24-10-2023"));
		logger.info("Date search functionality verified");	
		ee.clickOnExamEvidence2();
	}
	
	@Test(priority=5)
	public void sign_test() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.signTest1("Passed", "Completed");
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Reviewer");
		ee.testSignnAlert();
		ee.clickOnExamEvidence2();
	}
	
	@Test(priority=6)
	public void downloadTest() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.downloadTest1("Passed", "Signed");
	}
	
	@Test(priority=7)
	public void employeeNameSearchValidation_Supervisor() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.clickOnSupervisor();
		ee.employeeNameSearch_Supervisor("Neethu Tester");
		Thread.sleep(2000);
		Assert.assertTrue(ee.employeeNameSearchValidation_Supervisor("Neethu Tester"));
		logger.info("Employee name search functionality verified");	
	}
	
	@Test(priority=8)
	public void resultSearchValidation_Supervisor() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.resultSearch_Supervisor("Passed");
		Thread.sleep(2000);
		Assert.assertTrue(ee.resultSearchValidation_Supervisor("Passed"));
		logger.info("Result search functionality verified");	
	}
	
	@Test(priority=9)
	public void statusSearchValidation_Supervisor() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.statusSearch_Supervisor("Completed");
		Thread.sleep(2000);
		Assert.assertTrue(ee.statusSearchValidation_Supervisor("Signed"));
		logger.info("Status search functionality verified");	
	}
	
	@Test(priority=10)
	public void dateSearchValidation_Supervisor() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.dateSearch_Supervisor("24-10-2023","24-10-2023");
		Thread.sleep(2000);
		Assert.assertTrue(ee.dateSearchValidation_Supervisor("24-10-2023"));
		logger.info("Date search functionality verified");	
		ee.clickOnExamEvidence3();
	}
	
	@Test(priority=11)
	public void sign_test_Supervisor() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.signTest3("Passed", "Completed");
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Reviewer");
		ee.testSignnAlert();
		ee.clickOnExamEvidence2();
	}
	
	@Test(priority=12)
	public void submitExam() throws IOException, InterruptedException
	{
		ExamEvidence ee = new ExamEvidence(driver);
		ee.clickOnEmployee();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		ee.submitExamAlert();
	}
	


}
