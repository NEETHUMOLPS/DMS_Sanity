package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.TestResult;

import Base.BaseClass;

public class TC_012_TestResult extends BaseClass {
	
	@Test(priority=1, description = "Submit the exam")
	public void submitExam() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethur@yopmail.com");
		lp.setPassword("Neethu@r1");
		lp.clickLogin();
		TestResult ee = new TestResult(driver);
		ee.clickOnTestResult2();
		ee.clickOnEmployee();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		ee.submitExamAlert();
		driver.navigate().back();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		ee.submitExamAlert();
		driver.navigate().back();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		ee.submitExamAlert();
		driver.navigate().refresh();
		lp.profileIcon();
		lp.logout();
	}
	
	@Test(priority=2, description = "Sign the completed test")
	public void signTest_Initiator() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethumolp@datamatica.uk");
		lp.setPassword("Ryan@1234");
		lp.clickLogin();
		TestResult ee = new TestResult(driver);
		ee.clickOnTestResult2();
		ee.statusSearch_Initiator("Completed");
		ee.view_Initiator("Assessment12");
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		ee.testSignnAlert();
		ee.clickOnTestResult2();
		ee.statusSearch_Initiator("Completed");
		ee.view_Initiator("Assessment12");
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		ee.testSignnAlert();
		ee.clickOnTestResult2();
	}
	
	@Test(priority=3, description = "Sign the completed test")
	public void sign_test_Supervisor() throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnSupervisor();
		ee.signTest3a("Failed", "Completed");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/i[1]")).click();		
		ee.signTest2("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		ee.testSignnAlert();
		ee.clickOnTestResult2();
	}
	


}
