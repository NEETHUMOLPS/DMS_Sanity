package com.DMS.testCases;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.DMS.pageObjects.MyFiles;

import Base.BaseClassTest;

public class TC_012_MyFiles extends BaseClassTest {

	
	@Test(priority=1)
	public void mainFolderCreation() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		mf.FolderCreation("DMS");
		mf.FolderCreationAlert();	
	}
	
	@Test(priority=2)
	public void MainFolderEdit() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMS");
		mf.FolderEdit();
		mf.FolderUpdationAlert();
	}
	
	@Test(priority=3)
	public void MainFolderPermission() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMS");
		mf.permissionsFolder("Quality Analyst");
		mf.PermissionsFolderAlert();
	}
	
	@Test(priority=4)
	public void MainFolderShare() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMS");
		mf.ShareFolder("Quality Analyst");
		mf.shareFolderAlert();
	}
	
	@Test(priority=5)
	public void MainFolderDelete() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMS");
		mf.deleteFolder();
		mf.deleteFolderAlert();
	} 
	
	@Test(priority=6)
	public void MainFolderArchive() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.FolderCreation("DMS01");
		mf.FolderCreationAlert();
		mf.clickOnKebabMenu2("DMS01");
		mf.archiveFolder();
		mf.archiveFolderAlert();
	}
	
	@Test(priority=7)
	public void SubFolderCreation() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.FolderCreation("DMS03");
		mf.FolderCreationAlert();
		Thread.sleep(2000);
		mf.FolderCreation("DMS04");
		mf.FolderCreationAlert();
		Thread.sleep(2000);
		mf.selFolder2("DMS03");
		Thread.sleep(2000);
		mf.FolderCreation("DMS05");
		mf.FolderCreationAlert();
		Thread.sleep(2000);
		mf.FolderCreation("DMS07");
		mf.FolderCreationAlert();
		Thread.sleep(2000);	
		driver.navigate().refresh();
	}
	
	@Test(priority=8)
	public void SubFolderEdit() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.selFolder2("DMS03");
		Thread.sleep(2000);
		mf.selFolder2("DMS05");
		mf.clickOnKebabMenu2("DMS05");
		Thread.sleep(2000);
		mf.FolderEdit();
		mf.FolderUpdationAlert();
		
	}
	
	@Test(priority=9)
	public void SubFolderPermission() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMS05");
		Thread.sleep(2000);
		mf.permissionsFolder("Quality Analyst");
		mf.PermissionsFolderAlert();
	}
	

	@Test(priority=10)
	public void SubFolderShare() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMS05");
		Thread.sleep(2000);
		mf.ShareFolder("Quality Analyst");
		mf.shareFolderAlert();
	}
	
	@Test(priority=11)
	public void SubFolderDelete() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMS05");
		Thread.sleep(2000);
		mf.deleteFolder();
		mf.deleteFolderAlert();
	}
	
	@Test(priority=12)
	public void SubFolderArchive() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.selFolder2("DMS07");
		mf.clickOnKebabMenu2("DMS07");
		Thread.sleep(2000);
		mf.archiveFolder();
		mf.archiveFolderAlert();
	}
	
	@Test(priority=13)
	public void UploadDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		Thread.sleep(3000);
		mf.selFolder2("DMS03");
		mf.createDocumentIcon();
		mf.fillDocument("D1", "Neethumol P S", "V1.1");
		mf.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (1).xlsx");
		mf.uploadDocAlert();
		Thread.sleep(2000);
		mf.createDocumentIcon();
		mf.fillDocument("D1", "Neethumol P S", "V1.1");
		mf.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (2).xlsx");
		mf.uploadDocAlert();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)");
	}
	
	@Test(priority=14)
	public void EditDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("Sample (2).xlsx");
		mf.editDoc("D2");
		mf.editDocAlert();
	}
	
	@Test(priority=15)
	public void PermissionDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("Sample (1).xlsx");
		mf.permissionDoc("Quality Analyst");
		mf.permissionDocAlert();
	}
	
	@Test(priority=16)
	public void ShareDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("Sample (1).xlsx");
		mf.shareDoc("Quality Analyst");
		mf.shareDocAlert();
	}
	
	@Test(priority=17)
	public void DeletDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("Sample (1).xlsx");
		mf.deleteDoc();
		mf.deleteDocAlert();
	}
	
	@Test(priority=18)
	public void ArchiveDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("Sample (2).xlsx");
		mf.archiveDoc();
		mf.archiveDocAlert();
	}
	
	@Test(priority=19) 
	public void addSignersToTheDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		//mf.selFolder2("Fold3");//
		mf.createDocumentIcon();
		mf.fillDocument_addSigners("D1", "Neethumol P S", "V1.1","UAT Test script","Neethumol P S","Neethu Tester","Neethug G");
		mf.uploadDoc("C:\\Users\\lenovo\\Downloads\\UAT EIDSA - E-Consent 1.docx");
		mf.uploadDocAlert();
		Thread.sleep(1000);
	}
	
	@Test(priority=20)
	public void addSigners_Document() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.selDoc("UAT EIDSA - E-Consent 1.docx");
		mf.addSigners("Neethur R");
		mf.addSignersAlert();
	}
	
	@Test(priority=21)
	public void signDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.signDocument("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		mf.signAlert();
		Thread.sleep(10000);
	}

	
	@Test(priority=22)
	public void addNewVersion() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		Thread.sleep(10000);
		mf.addNewVersion("D2", "V1.2");
		mf.uploadDoc("C:\\Users\\lenovo\\Downloads\\UAT EIDSA - E-Consent 1.docx");
		mf.uploadDocAlert1();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
	}
	
	@Test(priority=23)
	public void docDownload_Print() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.download();
		//mf.print();
		//driver.close();
	}
	

}
