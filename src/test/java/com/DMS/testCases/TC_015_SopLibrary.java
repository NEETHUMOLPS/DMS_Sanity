package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DMS.pageObjects.SOPLibrary;

import Base.BaseClassTest;

public class TC_015_SopLibrary extends BaseClassTest {

	
	@Test(priority=1)
	public void sign_TraineeSOP() throws IOException, InterruptedException
	{
		SOPLibrary sl = new SOPLibrary(driver);
		sl.clickOnSOPLibrary();
		sl.selView1("Initiated");
		Thread.sleep(2000);
		sl.sign_TraineeSop("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		sl.clickOnDashboard();
		sl.clickOnSOPLibrary();
	}
	
	@Test(priority=2)
	public void downloadSignedDoc_Trainee() throws IOException, InterruptedException
	{
		SOPLibrary sl = new SOPLibrary(driver);
		sl.selView1("Approved");
		Thread.sleep(5000);
		sl.clickOnDownload1();		
		sl.clickOnDashboard();
		sl.clickOnSOPLibrary();
	}
	
	@Test(priority=3)
	public void sign_TrainerSOP() throws IOException, InterruptedException
	{
		SOPLibrary sl = new SOPLibrary(driver);
		sl.clickOnsopForVerification();
		sl.selView2("Completed");
		Thread.sleep(2000);
		sl.sign_TrainerSop("neethumolp@datamatica.uk", "Neethu@12345", "Approval");		
		sl.DigiSignAlert();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(2000);	
		sl.clickOnDashboard();
		sl.clickOnSOPLibrary();
	}
	
	@Test(priority=4)
	public void downloadSignedDoc_Trainer() throws IOException, InterruptedException
	{
		SOPLibrary sl = new SOPLibrary(driver);
		sl.clickOnsopForVerification();
		sl.selView2("Approved");
		Thread.sleep(5000);
		sl.clickOnDownload1();		
		sl.clickOnDashboard();
		sl.clickOnSOPLibrary();
	}
	
	@Test(priority=5)
	public void initiatorSOP() throws IOException, InterruptedException
	{
		SOPLibrary sl = new SOPLibrary(driver);
		sl.clickOninitiatorSOP();
		WebElement ele = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/i[1]"));
		ele.click();
	}

}
