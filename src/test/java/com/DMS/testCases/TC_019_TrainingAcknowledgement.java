package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DMS.pageObjects.TrainingAcknowledgement;

import Base.BaseClassTest;

public class TC_019_TrainingAcknowledgement extends BaseClassTest {

	
	@Test(priority=1)
	public void sign_MyTraining() throws IOException, InterruptedException
	{
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnTrainingAcknowledgement();
		sl.selView1("Initiated");		
		sl.sign_TraineeSop("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		sl.DigiSignAlert();
		sl.clickOnTrainingAcknowledgement1();
	}
	
	@Test(priority=2)
	public void view_download_MyTraining() throws IOException, InterruptedException
	{
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.selView1("Approved");
		sl.clickOnDownload();
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void sign_Verification() throws IOException, InterruptedException
	{
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnVerification();
		sl.selView2("Completed");
		sl.sign_TrainerSop("neethumolp@datamatica.uk", "Neethu@12345", "Approval");		
		sl.DigiSignAlert();
		sl.clickOnTrainingAcknowledgement1();
	}
	
	@Test(priority=4)
	public void downloadSignedDoc_Verification() throws IOException, InterruptedException
	{
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnVerification();
		sl.selView2("Approved");
		sl.clickOnDownload1();		
		sl.clickOnTrainingAcknowledgement();
	}
	
	@Test(priority=5)
	public void assignTraining() throws IOException, InterruptedException
	{
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnAssignTraining();
		WebElement ele = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/i[1]"));
		ele.click();
	}

}
