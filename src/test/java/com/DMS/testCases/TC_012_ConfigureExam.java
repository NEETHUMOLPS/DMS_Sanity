package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ConfigureExam;

import Base.BaseClassTest;

public class TC_012_ConfigureExam extends BaseClassTest {

	
	@Test(priority=1)
	public void configureExam() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.configureExam("Auto01", "10", "50", "23-11-2023", "Neethumol P S");
		ce.examConfigurationAlert();
	}
	
	@Test(priority=2)
	public void userAddition() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.userAddition();
		ce.userAdditionAlert();
	}
	
	@Test(priority=3)
	public void employeeAddition() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.selEmployeeActions("Neethu Tester");
		ce.employeeDeletion();
		ce.employeeDeletionAlert();
	}
	
	@Test(priority=4)
	public void createQuestion() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.createQuestion1();
		ce.qusCreationAlert();
	}
	
	@Test(priority=2)
	public void examNameSearchValidation() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.nameSearch("IT - 12");		
		Thread.sleep(2000);
		Assert.assertTrue(ce.nameValidation("IT - 12"));
		logger.info("Exam name search functionality verified");	
		driver.navigate().refresh();
	}
	
	

}
