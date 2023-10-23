package com.DMS.testCases;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.DMS.pageObjects.MyFiles;

import Base.BaseClassTest;

public class TC_011_MyFiles extends BaseClassTest {

	
	@Test(priority=1)
	public void mainFolderCreation() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		mf.FolderCreation("Fol1");
		mf.FolderCreationAlert();	
	}
	
	@Test(priority=2)
	public void MainFolderEdit() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("Fol1");
		mf.FolderEdit();
		mf.FolderUpdationAlert();
	}
	
	@Test(priority=3)
	public void MainFolderPermission() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("Fol1");
		mf.permissionsFolder("Quality Analyst");
		mf.PermissionsFolderAlert();
	}
	
	@Test(priority=4)
	public void MainFolderShare() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("Fol1");
		mf.ShareFolder("Quality Analyst");
		mf.shareFolderAlert();
	}
	
	@Test(priority=5)
	public void MainFolderDelete() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("Fol1");
		mf.deleteFolder();
		mf.deleteFolderAlert();
	} 
	
	@Test(priority=6)
	public void MainFolderArchive() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.FolderCreation("F5");
		mf.FolderCreationAlert();
		mf.clickOnKebabMenu2("F5");
		mf.archiveFolder();
		mf.archiveFolderAlert();
	}
	
	@Test(priority=7)
	public void SubFolderCreation() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.FolderCreation("Fold3");
		mf.FolderCreationAlert();
		Thread.sleep(2000);
		mf.FolderCreation("Fold4");
		mf.FolderCreationAlert();
		Thread.sleep(2000);
		mf.selFolder2("Fold3");
		Thread.sleep(2000);
		mf.FolderCreation("Fold5");
		mf.FolderCreationAlert();
		Thread.sleep(2000);
		mf.FolderCreation("Fold7");
		mf.FolderCreationAlert();
		Thread.sleep(2000);	
		driver.navigate().refresh();
	}
	
	@Test(priority=8)
	public void SubFolderEdit() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.selFolder2("Fold3");
		Thread.sleep(2000);
		mf.selFolder2("Fold5");
		mf.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		mf.FolderEdit();
		mf.FolderUpdationAlert();
		
	}
	
	@Test(priority=9)
	public void SubFolderPermission() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		mf.permissionsFolder("Quality Analyst");
		mf.PermissionsFolderAlert();
	}
	

	@Test(priority=10)
	public void SubFolderShare() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		mf.ShareFolder("Quality Analyst");
		mf.shareFolderAlert();
	}
	
	@Test(priority=11)
	public void SubFolderDelete() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		mf.deleteFolder();
		mf.deleteFolderAlert();
	}
	
	@Test(priority=12)
	public void SubFolderArchive() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.selFolder2("Fold7");
		mf.clickOnKebabMenu2("Fold7");
		Thread.sleep(2000);
		mf.archiveFolder();
		mf.archiveFolderAlert();
	}
	
	@Test(priority=13)
	public void UploadDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		Thread.sleep(3000);
		mf.selFolder2("Fold3");
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

}
