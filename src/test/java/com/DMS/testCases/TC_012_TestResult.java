package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import com.DMS.pageObjects.TestResult;

import Base.BaseClassTest;

public class TC_012_TestResult extends BaseClassTest {
	
	@Test(priority=1, description = "Download test details")
	public void downloadTest() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnTestResult2();
		ee.downloadTest1("Passed", "Signed");
		driver.navigate().back();
	}
	
	@Test(priority=2, description = "Sign the completed test")
	public void signTest_Initiator() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.statusSearch_Initiator("Completed");
		ee.view_Initiator("Assessment04");
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		ee.testSignnAlert();
		ee.clickOnTestResult2();
	}
	
	@Test(priority=3, description = "Sign the completed test")
	public void sign_test_Supervisor() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnSupervisor();
		ee.signTest3a("Passed", "Completed");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/i[1]")).click();		
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		ee.testSignnAlert();
		ee.clickOnTestResult2();
	}
	
	@Test(priority=4, description = "Submit the exam")
	public void submitExam() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnEmployee();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		ee.submitExamAlert();
	}
	


}
