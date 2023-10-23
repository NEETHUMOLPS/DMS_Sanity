package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.Dashboard;

import Base.BaseClassTest;

public class TC_004_Dashboard extends BaseClassTest {

	@Test(priority=1)
	public void Department() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.department();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://dmsdev.datamatica.uk/department"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "Department");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}
	
	@Test(priority=2)
	public void Projects() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.Dashboard();
		db.projects();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://dmsdev.datamatica.uk/projectList"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "Projects");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}
	
	@Test(priority=3)
	public void Users() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.Dashboard();
		db.users();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://dmsdev.datamatica.uk/userlisting"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "Users");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}
	
	@Test(priority=4)
	public void Designation() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.Dashboard();
		db.designation();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://dmsdev.datamatica.uk/designation"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "Designation");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}
	
	@Test(priority=5)
	public void SOPLibrary() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.Dashboard();
		db.sopLibrary();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://dmsdev.datamatica.uk/soplibrary"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "SOPLibrary");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}
	
	@Test(priority=6)
	public void ConfigureExam() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.Dashboard();
		db.configureExam();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://dmsdev.datamatica.uk/testList"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "ConfigureExam");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}
	
	@Test(priority=7)
	public void MyFiles() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.Dashboard();
		db.myFiles();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://dmsdev.datamatica.uk/generalFiles"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "MyFiles");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}
	
	@Test(priority=8)
	public void ExamEvidence() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.Dashboard();
		db.examEvidence();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://dmsdev.datamatica.uk/examevidence"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "ExamEvidence");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}
	

}
