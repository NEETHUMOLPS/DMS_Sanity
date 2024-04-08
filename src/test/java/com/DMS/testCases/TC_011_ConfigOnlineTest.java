package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.DMS.pageObjects.ConfigOnlineTest;

import Base.BaseClassTest;
import org.openqa.selenium.interactions.Actions;
public class TC_011_ConfigOnlineTest extends BaseClassTest {

	
	@Test(priority=1, description = "Create test and assign users")
	public void configureExam() throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.clickOnConfigExam();
		ce.configureExam("Assessment12", "10", "50", "07-04-2024", "Neethumol PS");
		ce.examConfigurationAlert();
		
	}
	
	@Test(priority=2, description = "Assign users")
	public void userAddition() throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.userAddition();
		ce.userAdditionAlert();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	}
	
	
	@Test(priority=3, description = "Create question")
	public void createQuestion() throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
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
	
	@Test(priority=4, description = "Upload question")
	public void uploadQuestion() throws Exception
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.clickOnConfigExam();	
		ce.configureExam("Assessment12", "10", "50", "07-04-2024", "Neethumol PS");
		ce.examConfigurationAlert();
		ce.uploadQus("C:\\Users\\NeethumolPS\\Downloads\\Software Testing MCQ 2.xlsx");
		ce.uploadQusAlert();
		driver.navigate().back();
		ce.configureExam("Assessment12", "10", "50", "07-04-2024", "Neethumol PS");
		ce.examConfigurationAlert();
		ce.uploadQus("C:\\Users\\NeethumolPS\\Downloads\\Software Testing MCQ 2.xlsx");
		ce.uploadQusAlert();
	}
	
	@Test(priority=5, description = "View test")
	public void viewTest() throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.clickOnConfigExam();	
		ce.nameSearch("Assessment04");		
		Thread.sleep(2000);
		ce.viewTest1("Assessment04");
		ce.viewTest2("Signed");
	}
	

}
