package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.DocumentApprovals;

import Base.BaseClassTest;

public class TC_014_DocumentApprovals extends BaseClassTest {

	
	@Test(priority=1)
	public void docuemntTitleSearchValidation() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.clickOnApprovals();
		da.documentTitleSearch("D1");
		Thread.sleep(2000);
		Assert.assertTrue(da.documentTitleSearchValidation("D1"));
		logger.info("Employee name search functionality verified");	
	}
	
	@Test(priority=2)
	public void dateSearchValidation() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.dateSearch("20-11-2023");
		Thread.sleep(2000);
		Assert.assertTrue(da.dateSearchValidation("2023-11-20"));
		logger.info("Date search functionality verified");	
	}
	
	@Test(priority=3)
	public void statusSearchValidation() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.statusSearch("Approved");
		Thread.sleep(2000);
		Assert.assertTrue(da.statusSearchValidation("Approved"));
		logger.info("Status search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void approveDoc1() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.documentTitleSearch("D3");
		da.selApprovalStatus("D3");
		da.approval1("Approved");
		da.docApprovalAlert1();
		driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void rejectDoc1() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.documentTitleSearch("D4");
		da.selApprovalStatus("D4");
		da.rejection1("Rejected");
		da.docRejectionAlert1();
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void viewStatus() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.documentTitleSearch("D2");
		da.selStatus("D2");
		da.viewStatus();
		driver.navigate().refresh();
	}
	
	@Test(priority=7)
	public void viewDocumet_Approval() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.documentTitleSearch("D3");
		da.selView("D3");
		da.viewStatus_approve("Approved");
		da.docApprovalAlert1();
		da.clickOnApprovals();
		
	}

	@Test(priority=8)
	public void viewDocumet_Reject() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.documentTitleSearch("D4");
		da.selView("D4");
		da.viewStatus_reject("Rejected");
		da.docRejectionAlert1();
		da.clickOnApprovals();	
	}
	
	@Test(priority=9)
	public void viewApprovedDocumet_download_print() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.documentTitleSearch("D2");
		da.selView("D2");
		da.downloadAndPrint();
		da.clickOnApprovals();	
		
	}

}
