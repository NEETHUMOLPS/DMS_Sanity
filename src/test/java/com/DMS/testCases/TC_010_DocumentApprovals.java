package com.DMS.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.DocumentApprovals;
import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.MyFiles;

import Base.BaseClass;

public class TC_010_DocumentApprovals extends BaseClass {
	
	@Test(priority=1, description = "Approve the document")
	public void viewDocumet_Approval() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("neethug@yopmail.com");
		lp.setPassword("Neethu@g1");
		lp.clickLogin();
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		DocumentApprovals da = new DocumentApprovals(driver);
		da.clickOnApprovals();
		da.statusSearch("Pending");
		da.documentTitleSearch("DA");
		da.selView("DA");
		da.viewStatus_approve("Approved");
		da.docApprovalAlert1();
		da.clickOnApprovals();
		
	}

	@Test(priority=2, description = "Reject the document")
	public void viewDocumet_Reject() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.statusSearch("Pending");
		da.documentTitleSearch("DR");
		da.selView("DR");
		da.viewStatus_reject("Rejected");
		da.docRejectionAlert1();
		da.clickOnApprovals();	
	}

}
