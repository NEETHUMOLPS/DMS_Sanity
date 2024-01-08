package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.DocumentApprovals;

import Base.BaseClassTest;

public class TC_010_DocumentApprovals extends BaseClassTest {
	
	@Test(priority=1, description = "Approve the document")
	public void viewDocumet_Approval() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.clickOnApprovals();
		da.statusSearch("Pending");
		da.documentTitleSearch("D7");
		da.selView("D7");
		da.viewStatus_approve("Approved");
		da.docApprovalAlert1();
		da.clickOnApprovals();
		
	}

	@Test(priority=2, description = "Reject the document")
	public void viewDocumet_Reject() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.statusSearch("Pending");
		da.documentTitleSearch("D8");
		da.selView("D8");
		da.viewStatus_reject("Rejected");
		da.docRejectionAlert1();
		da.clickOnApprovals();	
	}

}
