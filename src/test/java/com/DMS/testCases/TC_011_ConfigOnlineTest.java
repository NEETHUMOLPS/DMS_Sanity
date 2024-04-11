package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.DMS.pageObjects.ConfigOnlineTest;
import com.DMS.utilities.XLUtility;

import Base.BaseClassTest;
import org.openqa.selenium.interactions.Actions;
public class TC_011_ConfigOnlineTest extends BaseClassTest {

	
	@Test(dataProvider = "DD1",priority=1, description = "Create test and assign users")
	public void configureExam(String ExamName,String NoOfQus,String PerToPass,String Date,String SupName) throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.clickOnConfigExam();
		ce.configureExam(ExamName,NoOfQus,PerToPass,Date,SupName);
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
	
	@Test(dataProvider = "DD1",priority=4, description = "Upload question")
	public void uploadQuestion(String ExamName,String NoOfQus,String PerToPass,String Date,String SupName) throws Exception
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.clickOnConfigExam();	
		ce.configureExam(ExamName,NoOfQus,PerToPass,Date,SupName);
		ce.examConfigurationAlert();
		ce.uploadQus("C:\\Users\\NeethumolPS\\Downloads\\Software Testing MCQ 2.xlsx");
		ce.uploadQusAlert();
		driver.navigate().back();
		ce.configureExam(ExamName,NoOfQus,PerToPass,Date,SupName);
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
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\ConfigOnlineTest.xlsx";
		int rownum=XLUtility.getRowCount(path, "ExamDetails");
	int colcount=XLUtility.getCellCount(path, "ExamDetails", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "ExamDetails", i, j);
		}
	}
	
	return data;	

	}
	

}
