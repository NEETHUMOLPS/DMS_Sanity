package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
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
		ce.createQuestion2();
		ce.qusCreationAlert();
		ce.createQuestion3();
		ce.qusCreationAlert();
		ce.createQuestion4();
		ce.qusCreationAlert();
		ce.createQuestion5();
		ce.qusCreationAlert();
		ce.createQuestion6();
		ce.qusCreationAlert();
		ce.createQuestion7();
		ce.qusCreationAlert();
		ce.createQuestion8();
		ce.qusCreationAlert();
		ce.createQuestion9();
		ce.qusCreationAlert();
		ce.createQuestion10();
		ce.qusCreationAlert();
		ce.createQuestion11();
		ce.qusCreationAlert();		
	}
	
	@Test(priority=5)
	public void editQuestion() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.selQus("10");
		ce.editQus();
		ce.editQusAlert();
	}
	
	@Test(priority=6)
	public void deleteQuestion() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.selQus("10");
		ce.deleteQus();
		ce.deleteQusAlert();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-1000)");
	}
	
	@Test(priority=7)
	public void addDocument() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.referenceDocuments();
		ce.referenceDocumentAlert();
	}
	
	@Test(priority=8)
	public void delDocument() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.selDoc("new");
		ce.deleteDoc();
		ce.deleteDocAlert();
	}
	
	@Test(priority=9)
	public void examConfiguration() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.configExam();
		ce.examConfigurationUpdateAlert();
		driver.navigate().back();
		
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
