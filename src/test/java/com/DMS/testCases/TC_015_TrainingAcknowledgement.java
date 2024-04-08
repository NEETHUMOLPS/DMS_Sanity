package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.TrainingAcknowledgement;

import Base.BaseClass;

public class TC_015_TrainingAcknowledgement extends BaseClass {

	
	@Test(priority=1, description = "Sign the SOP training form")
	public void sign_MyTraining() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethumolp@datamatica.uk");
		lp.setPassword("Ryan@1234");
		lp.clickLogin();
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnTrainingAcknowledgement();
		sl.selView1("Initiated");		
		sl.sign_TraineeSop("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		sl.DigiSignAlert();
		sl.clickOnTrainingAcknowledgement1();
	}
	
	@Test(priority=2, description = "View the SOP training form")
	public void assignTraining() throws IOException, InterruptedException
	{
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnAssignTraining();
		WebElement ele = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/i[1]"));
		ele.click();
		LoginPage lp=new LoginPage(driver);
		lp.profileIcon();
		lp.logout();
	}
	
	
	@Test(priority=3, description = "Sign the SOP training form")
	public void sign_Verification() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethur@yopmail.com");
		lp.setPassword("Neethu@r1");
		lp.clickLogin();
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnTrainingAcknowledgement();
		sl.clickOnVerification();
		sl.selView2("Completed");
		sl.sign_TrainerSop("neethur@yopmail.com", "Neethu@r1", "Approval");		
		sl.DigiSignAlert();
		sl.clickOnTrainingAcknowledgement1();
	}

}
