package com.DMS.testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DMS.pageObjects.MyFiles;
import com.DMS.pageObjects.ProjectPage;

import Base.BaseClassTest;

public class TC_009_Projects extends BaseClassTest {

	@Test(priority=1, description = "Create the project")
	public void createProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.ProjectCreation("DMSPROJECT01", "IT");
		pp.projectCreationAlert();		
	}
	
	@Test(priority=2, description = "Import roles to the project")
	public void importRole() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selProject("DMSPROJECT01");
		pp.profile();
		pp.RoleImport();
		pp.importRoleAlert();
	}
	
	@Test(priority=3, description = "Add role to the project")
	public void addProjectRole() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.ProjectRoleCreation("Automation Tester11");
		pp.roleCreationAlert();
	}
	
	
	@Test(priority=4, description = "Create the user")
	public void createUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.createUser("QA");
		pp.userCreationAlert();		
	}
	
	@Test(priority=5, description = "Main folder creation")
	public void docMainFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnDocument();
		pp.FolderCreation("Folder1");
		pp.FolderCreationAlert();	
	}
	
	@Test(priority=6, description = "Set permissions to the folder")
	public void docMainFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.permissionsFolder("QA");
		pp.PermissionsFolderAlert();
		driver.navigate().refresh();
	}
	
	@Test(priority=7, description = "Share the folder")
	public void docMainFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.ShareFolder("QA");
		pp.shareFolderAlert();
	}
	
	@Test(priority=8, description = "Share folder to external user")
	public void docMainFolderShare_ExternalUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.shareFolder_ExternalUser1();
		pp.shareFolder_ExternalUserAlert();
	}
	
	@Test(priority=9, description = "Delete the folder")
	public void docMainFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.deleteFolder();
		pp.deleteFolderAlert();
	} 
	
	@Test(priority=10, description = "Archive the folder")
	public void docMainFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.FolderCreation("Folder2");
		pp.FolderCreationAlert();
		pp.clickOnKebabMenu2("Folder2");
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=11, description = "Upload the document")
	public void docUploadDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.FolderCreation("Folder3");
		pp.FolderCreationAlert();
		pp.selFolder2("Folder3");
		pp.createDocumentIcon();
		pp.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(4000);
		pp.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (1).xlsx");
		pp.uploadDocAlert();
		Thread.sleep(2000);
		pp.createDocumentIcon();
		pp.fillDocument("D1", "Neethumol PS", "V1.1");
		pp.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (2).xlsx");
		pp.uploadDocAlert();
		Thread.sleep(2000);
	}
	
	@Test(priority=12, description = "Set permissions to the document")
	public void docPermissionDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.permissionDoc("QA");
		pp.permissionDocAlert();
	}
	
	@Test(priority=13, description = "Share the document")
	public void docShareDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.shareDoc("QA");
		pp.shareDocAlert();
	}
	
	@Test(priority=14, description = "Delete the document")
	public void docDeletDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.deleteDoc();
		pp.deleteDocAlert();
	}
	
	@Test(priority=15, description = "Archive the document")
	public void docArchiveDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (2).xlsx");
		pp.archiveDoc();
		pp.archiveDocAlert();
		driver.navigate().refresh();
	}
	
	@Test(priority=16, description = "Add signers to the document") 
	public void addSignersToTheDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Folder3");
		pp.createDocumentIcon();
		pp.fillDocument_addSigners("D1", "Neethumol PS", "V1.1","UAT Test script","Neethumol PS","Neethu Tester","Neethug G");
		Thread.sleep(4000);
		pp.uploadDoc("C:\\Users\\lenovo\\Downloads\\UAT EIDSA - E-Consent 1 (11).docx");
		pp.uploadDocAlert();
		Thread.sleep(1000);
	}
	
	@Test(priority=17, description = "Edit signers")
	public void addSigners_Document() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selDoc("UAT EIDSA - E-Consent 1 (11).docx");
		pp.addSigners("Neethur R");
		pp.addSignersAlert();
	}
	
	@Test(priority=18, description = "Sign the document")
	public void signDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.signDocument("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		pp.signAlert();
		Thread.sleep(10000);
	}
	
	@Test(priority=19, description = "Set approvers to the document")
	public void approvalDoc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentApprovalDoc("QA");
		pp.documentApprovalAlert();
		Thread.sleep(1000);
	}

	
	@Test(priority=20, description = "Add new version")
	public void addNewVersion_Doc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		Thread.sleep(10000);
		pp.addNewVersion("D2", "V1.2");
		Thread.sleep(4000);
		pp.uploadDoc("C:\\Users\\lenovo\\Downloads\\UAT EIDSA - E-Consent 1 (11).docx");
		pp.uploadDocAlert1();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
	}
	
	
	@Test(priority=21, description = "Main folder creation")
	public void devMainFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.selProject("DMSPROJECT01");
		pp.clickOnDevelopment();
		pp.devFolderCreation("Fol1");
		pp.FolderCreationAlert();	
	}
	
	
	@Test(priority=22, description = "Set permissions to the folder")
	public void devMainFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		pp.permissionsFolder("QA");
		pp.PermissionsFolderAlert();
	}
	
	@Test(priority=23, description = "Share the folder")
	public void devMainFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		pp.ShareFolder("QA");
		pp.shareFolderAlert();
	}
	
	@Test(priority=24, description = "Share the folder tho the external user")
	public void devMainFolderShare_ExternalUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		Thread.sleep(2000);
		pp.shareFolder_ExternalUser1();
		pp.shareFolder_ExternalUserAlert();
	}
	
	@Test(priority=25, description = "Delete the folder")
	public void devMainFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		pp.deleteFolder();
		pp.deleteFolderAlert();
	} 
	
	@Test(priority=26, description = "Archive the folder")
	public void devMainFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.devFolderCreation("Fol2");
		pp.FolderCreationAlert();
		pp.clickOnKebabMenu2("Fol2");
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	
	@Test(priority=27, description = "Save and submit the form")
	public void devUploadDocument_SubmitAndSign() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.devFolderCreation("Fol3");
		pp.FolderCreationAlert();
		pp.selFolder2("Fol3");
		pp.fillDocument_submitAndSign("Unit Test", "T1", "M1", "S1", "Neethumol PS", "Neethumol PS", "Neethumol PS", "A1", "neethumolp@datamatica.uk", "Neethu@12345", "Confirmation");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
	}
	
	@Test(priority=28, description = "View the document")
	public void viewDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement view = driver.findElement(By.xpath("(//img[@alt='View document'])[1]"));
		view.click();
		driver.navigate().back();
	}
	
	@Test(priority=29, description = "Add new version")
	public void addNewVersion1() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement view = driver.findElement(By.xpath("(//img[@alt='View document'])[1]"));
		view.click();
		Thread.sleep(2000);
		pp.addNewVersion_submitDocument1("neethumolp@datamatica.uk","Neethu@12345","Approval");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
	}
	
	@Test(priority=30, description = "Download and print the form")
	public void download_printDoc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement view = driver.findElement(By.xpath("(//img[@alt='View document'])[1]"));
		view.click();
		Thread.sleep(2000);
		pp.docDownload();
		//pp.docPrint();
		driver.navigate().back();
		
	}
	

	@Test(priority=31, description = "Save the form")
	public void devUploadDocument_Save() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		pp.fillDocument_save("Unit Test", "T2", "M2", "S2", "Neethumol PS", "Neethumol PS", "Neethumol PS", "A1");
		pp.documentGenerationAlert_save1();
		Thread.sleep(2000);
	}
	
	@Test(priority=32, description = "Delete the saved form")
	public void devUploadDocument_Save_Delete() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.deleteSavedDocument();
		pp.savedDocumentDeleteAlert();
		
	}
	

}
