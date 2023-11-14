package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.DMS.pageObjects.ConfigureExam;

import Base.BaseClassTest;
import org.openqa.selenium.interactions.Actions;
public class TC_012_ConfigureExam extends BaseClassTest {

	
	@Test(priority=1)
	public void configureExam() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.clickOnConfigExam();
		ce.configureExam("Auto20", "10", "50", "23-11-2023", "Neethumol P S");
		ce.examConfigurationAlert();
	}
	
	@Test(priority=2)
	public void userAddition() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.userAddition();
		ce.userAdditionAlert();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	}
	
	@Test(priority=3)
	public void employeeDeletion() throws IOException, InterruptedException
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
		Thread.sleep(5000);	
	}
	
	@Test(priority=5)
	public void editQuestion() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);	
		WebElement action = driver.findElement(By.xpath("//table[@class='table table-bordered question-table']//i"));
		action.click();
		ce.editQus();
		ce.editQusAlert();
	}
	
	@Test(priority=6)
	public void deleteQuestion() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		WebElement action = driver.findElement(By.xpath("//table[@class='table table-bordered question-table']//i"));
		action.click();
		ce.deleteQus();
		ce.deleteQusAlert();
	}
	
	@Test(priority=7)
	public void addDocument() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
		ce.referenceDocuments();
		ce.referenceDocumentAlert();
	}
	
	@Test(priority=8)
	public void delDocument() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.selDoc("sample doc");
		ce.deleteDoc();
		ce.deleteDocAlert();
	}
	
	@Test(priority=9)
	public void examConfiguration() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.configExam();
		ce.examConfigurationUpdateAlert();
		ce.clickOnConfigExam();	
	}
	
	@Test(priority=10)
	public void examNameSearchValidation() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		ce.nameSearch("Auto20");		
		Thread.sleep(2000);
		Assert.assertTrue(ce.nameValidation("Auto20"));
		logger.info("Exam name search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=11)
	public void editTest() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		//ce.nameSearch("Auto20");		
		Thread.sleep(2000);
		ce.editTest1("Auto20");
		ce.editTest2();
		ce.examConfigurationUpdationAlert();
		ce.clickOnConfigExam();	
	}
	
	@Test(priority=12)
	public void viewTest() throws IOException, InterruptedException
	{
		ConfigureExam ce = new ConfigureExam(driver);
		//ce.nameSearch("Auto20");		
		Thread.sleep(2000);
		ce.viewTest1("Auto20");
		driver.navigate().refresh();
	}
	

}
