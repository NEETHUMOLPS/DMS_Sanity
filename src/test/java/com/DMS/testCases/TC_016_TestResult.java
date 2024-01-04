package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import com.DMS.pageObjects.TestResult;

import Base.BaseClassTest;

public class TC_016_TestResult extends BaseClassTest {

	
	@Test(priority=1)
	public void employeeNameSearchValidation_Initiator() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnTestResult2();
		ee.employeeNameSearch_Initiator("Neethug G");
		Thread.sleep(2000);
		Assert.assertTrue(ee.employeeNameSearchValidation_Initiator("Neethug G"));
		logger.info("Employee name search functionality verified");	
	}
	
	@Test(priority=2)
	public void resultSearchValidation_Initiator() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.resultSearch_Initiator("Passed");
		Thread.sleep(2000);
		Assert.assertTrue(ee.resultSearchValidation_Initiator("Passed"));
		logger.info("Result search functionality verified");	
	}
	
	@Test(priority=3)
	public void statusSearchValidation_Initiator() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.statusSearch_Initiator("Signed");
		Thread.sleep(2000);
		Assert.assertTrue(ee.statusSearchValidation_Initiator("Signed"));
		logger.info("Status search functionality verified");	
	}
	
	@Test(priority=4)
	public void dateSearchValidation_Initiator() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.dateSearch_Initiator("29-12-2023","29-12-2023");
		Thread.sleep(2000);
		Assert.assertTrue(ee.dateSearchValidation_Initiator("29-12-2023"));
		logger.info("Date search functionality verified");	
		ee.clickOnTestResult2();
	}
	
	@Test(priority=5)
	public void downloadTest() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.downloadTest1("Passed", "Signed");
		driver.navigate().back();
	}
	
	@Test(priority=6)
	public void signTest_Initiator() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.statusSearch_Initiator("Completed");
		ee.view_Initiator("Assessment new");
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		ee.testSignnAlert();
		ee.clickOnTestResult2();
	}
	
	@Test(priority=7)
	public void employeeNameSearchValidation_Supervisor() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnSupervisor();
		ee.employeeNameSearch_Supervisor("Neethug G");
		Thread.sleep(2000);
		Assert.assertTrue(ee.employeeNameSearchValidation_Supervisor("Neethug G"));
		logger.info("Employee name search functionality verified");	
	}
	
	@Test(priority=8)
	public void resultSearchValidation_Supervisor() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.resultSearch_Supervisor("Passed");
		Thread.sleep(2000);
		Assert.assertTrue(ee.resultSearchValidation_Supervisor("Passed"));
		logger.info("Result search functionality verified");	
	}
	
	@Test(priority=9)
	public void statusSearchValidation_Supervisor() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.statusSearch_Supervisor("Signed");
		Thread.sleep(2000);
		Assert.assertTrue(ee.statusSearchValidation_Supervisor("Signed"));
		logger.info("Status search functionality verified");	
	}
	
	@Test(priority=10)
	public void dateSearchValidation_Supervisor() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.dateSearch_Supervisor("29-12-2023","29-12-2023");
		Thread.sleep(2000);
		Assert.assertTrue(ee.dateSearchValidation_Supervisor("29-12-2023"));
		logger.info("Date search functionality verified");	
		ee.clickOnTestResult3();
	}
	
	@Test(priority=11)
	public void sign_test_Supervisor() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnSupervisor();
		ee.signTest3a("Passed", "Completed");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/i[1]")).click();		
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Reviewer");
		ee.testSignnAlert();
		ee.clickOnTestResult2();
	}
	
	@Test(priority=12)
	public void submitExam() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnEmployee();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		ee.submitExamAlert();
	}
	


}
