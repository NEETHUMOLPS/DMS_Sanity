package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.DMS.pageObjects.Departments;
import com.DMS.pageObjects.ProjectPage;
import com.DMS.pageObjects.UsersPage;
import Base.BaseClassTest;

public class TC_007_Departments extends BaseClassTest {

	@Test(priority=1, description = "Create department")
	public void mainDepartmentCreation() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnDepartment();
		dp.createDepartment("AD44");
		dp.departmentCreationAlert();
		driver.navigate().refresh();
	}
	
	@Test(priority=2, description = "Create sub department")
	public void subDepartmentCreation() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.selDepartment("AD39");
		dp.createDepartment("AD39g");
		dp.departmentCreationAlert();		
	}
	
	@Test(priority=3, description = "Main folder creation")
	public void mainFolderCreation() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		Thread.sleep(3000);
		dp.selDepartment("AD39");
		Thread.sleep(3000);
		dp.FolderCreation("Fol1");
		dp.FolderCreationAlert();	
	}
	
	
	@Test(priority=4, description = "Set permissions to the folder")
	public void MainFolder_Permission() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.permissionsFolder("Quality Analyst");
		dp.PermissionsFolderAlert();
	}
	
	@Test(priority=5, description = "Share the folder")
	public void MainFolder_Share() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.ShareFolder("Quality Analyst");
		dp.shareFolderAlert();
	}
	
	@Test(priority=6, description = "Delete the folder")
	public void MainFolder_Delete() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.deleteFolder();
		dp.deleteFolderAlert();
	} 
	
	@Test(priority=7, description = "Archive the folder")
	public void MainFolder_Archive() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.FolderCreation("F9");
		dp.FolderCreationAlert();
		dp.clickOnKebabMenu2("F9");
		dp.archiveFolder();
		dp.archiveFolderAlert();
	}
	
	@Test(priority=8, description = "Upload the document")
	public void UploadDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.selDepartment("AD39");
		dp.FolderCreation("Fold3");
		dp.FolderCreationAlert();
		dp.selFolder2("Fold3");
		dp.addDocumentIcon();
		dp.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(4000);
		dp.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (1).xlsx");
		dp.uploadDocAlert();
		Thread.sleep(2000);
		dp.addDocumentIcon();
		dp.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(4000);
		dp.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (2).xlsx");
		dp.uploadDocAlert();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=9, description = "Set permissions to the document")
	public void document_Permission() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (1).xlsx");
		dp.permissionDoc("Quality Analyst");
		dp.permissionDocAlert();
	}
	
	@Test(priority=10, description = "Share the document")
	public void document_Share() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (1).xlsx");
		dp.shareDoc("Quality Analyst");
		dp.shareDocAlert();
	}
	
	@Test(priority=11, description = "Delete the document")
	public void document_Delete() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (1).xlsx");
		dp.deleteDoc();
		dp.deleteDocAlert();
	}
	
	@Test(priority=12, description = "Archive the document")
	public void document_Archive() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (2).xlsx");
		dp.archiveDoc();
		dp.archiveDocAlert();
	}
	
	@Test(priority=13, description = "Add signers to the document") 
	public void addSignersToTheDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.addDocumentIcon();
		dp.fillDocument_addSigners("D1", "Neethumol PS", "V1.1","UAT Test script","Neethumol PS","Neethu Tester","Neethug G");
		Thread.sleep(4000);
		dp.uploadDoc("C:\\Users\\lenovo\\Downloads\\UAT EIDSA - E-Consent 1 (11).docx");
		dp.uploadDocAlert();
		Thread.sleep(1000);
	}
	
	@Test(priority=14, description = "Edit signers")
	public void signersEdit() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.selDoc("UAT EIDSA - E-Consent 1 (11).docx");
		dp.addSigners("Neethur R");
		dp.addSignersAlert();
	}
	
	@Test(priority=15, description = "Sign document")
	public void signDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.signDocument("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		dp.signAlert();
		Thread.sleep(10000);
	}
	
	@Test(priority=16, description = "Set approvers to the document")
	public void setApprover_Document() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentApprovalDoc("Quality Analyst");
		dp.documentApprovalAlert();
		Thread.sleep(1000);
	}

	
	@Test(priority=17, description = "Add new version")
	public void addNewVersion_Doc() throws Exception
	{
		Departments dp = new Departments(driver);
		Thread.sleep(10000);
		dp.addNewVersion("D2", "V1.2");
		Thread.sleep(4000);
		dp.uploadDoc("C:\\Users\\lenovo\\Downloads\\UAT EIDSA - E-Consent 1 (11).docx");
		dp.uploadDocAlert1();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
	}
	

}
