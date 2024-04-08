package com.DMS.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.DMS.pageObjects.MyFiles;

import Base.BaseClassTest;

public class TC_017_MergeFiles extends BaseClassTest {

	
	@Test(priority=1, description = "Merge files from DMS")
	public void mergeFiles_DMS() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		mf.selFolder2("Merge Files");
		//mf.docSel("UAT EIDSA - E-Consent(4).pdf");
		mf.mergeFile_DMS("My Files");
		mf.mergeAlert();		
	}
	
	@Test(priority=2, description = "Merge files from local system")
	public void mergeFiles_Local() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		mf.selFolder2("Merge Files");
		//mf.docSel("UAT EIDSA - E-Consent(5).pdf");
		mf.mergeFile_local("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(6).pdf");
		mf.mergeAlert();		
	}

}
