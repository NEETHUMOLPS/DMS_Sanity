
package com.DMS.testCases;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.DMS.pageObjects.Departments;
import com.DMS.pageObjects.MyFiles;
import Base.BaseClassTest;

public class TC_008_MyFiles extends BaseClassTest {

	
	@Test(priority=1, description = "Main folder creation")
	public void mainFolderCreation() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		mf.FolderCreation("DMSEIDSA");
		mf.FolderCreationAlert();	
	}
	
	@Test(priority=2, description = "Clone")
	public void MainFolder_Clone() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.cloneFolder("Folder,permission and files","F2","My Files");
		mf.cloneAlert();
	}
	
	
	@Test(priority=3, description = "Set permissions to the folder")
	public void MainFolderPermission() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.permissionsFolder("Quality Analyst");
		mf.PermissionsFolderAlert();
	}
	
	@Test(priority=4, description = "Share the folder")
	public void MainFolderShare() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.ShareFolder("Quality Analyst");
		mf.shareFolderAlert();
	}
	
	@Test(priority=5, description = "Create control form")
	public void MainFolder_Create() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.controlForm("101","High","F1","NA","NA","NA","Neethumol PS","Neethug G","Neethur R");
		mf.criticalFormAlert();
	}
	
	@Test(priority=6, description = "Delete the folder")
	public void MainFolderDelete() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.deleteFolder();
		mf.deleteFolderAlert();
	} 
	
	@Test(priority=7, description = "Archive the folder")
	public void MainFolderArchive() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.FolderCreation("DMSEIDSA26");
		mf.FolderCreationAlert();
		mf.clickOnKebabMenu2("DMSEIDSA26");
		mf.archiveFolder();
		mf.archiveFolderAlert();
	}
	
	
	@Test(priority=8, description = "Upload the document")
	public void UploadDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.FolderCreation("DMS04");
		mf.FolderCreationAlert();	
		mf.selFolder2("DMS04");
		mf.createDocumentIcon();
		mf.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(2000);
		mf.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
		mf.uploadDocAlert();
		Thread.sleep(2000);
		mf.createDocumentIcon();
		mf.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(2000);
		mf.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(2).docx");
		mf.uploadDocAlert();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)");
	}
	
	
	@Test(priority=9, description = "Add permissions to the document")
	public void PermissionDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("UAT EIDSA - E-Consent(1).docx");
		mf.permissionDoc("Quality Analyst");
		mf.permissionDocAlert();
	}
	
	@Test(priority=10, description = "Share the document")
	public void ShareDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("UAT EIDSA - E-Consent(1).docx");
		mf.shareDoc("Quality Analyst");
		mf.shareDocAlert();
	}
	
	@Test(priority=11, description = "Delete the document")
	public void DeleteDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("UAT EIDSA - E-Consent(1).docx");
		mf.deleteDoc();
		mf.deleteDocAlert();
	}
	
	@Test(priority=12, description = "Archive the document")
	public void ArchiveDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("UAT EIDSA - E-Consent(2).docx");
		mf.archiveDoc();
		mf.archiveDocAlert();
		Thread.sleep(4000);
	}
	
	@Test(priority=13, description = "Add signers to the document") 
	public void addSignersToTheDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.createDocumentIcon();
		mf.fillDocument_addSigners("DA", "Neethumol PS", "V1.1","UAT Test script","Neethumol PS","Neethu Tester","Neethug G");
		Thread.sleep(4000);
		mf.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
		mf.uploadDocAlert();
		Thread.sleep(1000);
	}
	
	@Test(priority=14, description = "Edit signers to the document")
	public void editSigners_Document() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.selDoc1();
		mf.addSigners("Neethur R");
		mf.addSignersAlert();
	}
	
	@Test(priority=15, description = "Sign the document")
	public void signDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.signDocument("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		mf.signAlert();
		Thread.sleep(10000);
	}
	
	@Test(priority=16, description = "Set approver to the document")
	public void setApprover_Document() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentApprovalDoc("Quality Analyst");
		dp.documentApprovalAlert();
		Thread.sleep(1000);
	}

	
	@Test(priority=17, description = "Add new version")
	public void addNewVersion() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		Thread.sleep(10000);
		mf.addNewVersion("D2", "V1.2");
		Thread.sleep(4000);
		mf.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
		mf.uploadDocAlert1();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
	}
	

	

}
