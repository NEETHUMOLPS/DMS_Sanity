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

public class TC_013_Projects extends BaseClassTest {

	@Test(priority=1)
	public void createProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.ProjectCreation("PROJECT1", "Dev");
		pp.projectCreationAlert();		
	}
	
	@Test(priority=2)
	public void editProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu1("PROJECT1");
		pp.editProject("NA");
		pp.projectEditAlert();		
	}
	
	@Test(priority=3)
	public void addProjectRole() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selProject("PROJECT1");
		pp.ProjectRoleCreation("Automation Tester");
		pp.roleCreationAlert();
	}
	
	@Test(priority=4)
	public void editRole() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.roleActions("Automation Tester");
		pp.RoleEdit("Automation Tester New");
		pp.roleNameUpdationAlert();
	}
	
	@Test(priority=5)
	public void deleteRole() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.roleActions("Automation Tester New");
		pp.RoleDelete();
		pp.roleDeletionAlert();
	}
	
	@Test(priority=6)
	public void importRole() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.RoleImport();
		pp.importRoleAlert();
	}
	
	@Test(priority=7)
	public void createUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.createUser("Quality Analyst");
		pp.userCreationAlert();		
	}
	
	@Test(priority=8)
	public void editUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.userActions("Neethu Tester");
		pp.editUser("Automation Tester");
		pp.userUpdationAlert();		
	}
	
	@Test(priority=9)
	public void deleteUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.userActions("Neethu Tester");
		pp.deleteUser();
		pp.userDeleteAlert();
		driver.navigate().refresh();
	}
		
	
	
	@Test(priority=10)
	public void docMainFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.FolderCreation("Folder1");
		pp.FolderCreationAlert();	
	}
	
	@Test(priority=11)
	public void docMainFolderEdit() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.FolderEdit();
		pp.FolderUpdationAlert();
	}
	
	@Test(priority=12)
	public void docMainFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();
	}
	
	@Test(priority=13)
	public void docMainFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.permissionsFolder("Quality Analyst");
		pp.PermissionsFolderAlert();
		driver.navigate().refresh();
	}
	
	@Test(priority=14)
	public void docMainFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.ShareFolder("Quality Analyst");
		pp.shareFolderAlert();
	}
	
	@Test(priority=15)
	public void docMainFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.deleteFolder();
		pp.deleteFolderAlert();
	} 
	
	@Test(priority=16)
	public void docMainFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.FolderCreation("Folder2");
		pp.FolderCreationAlert();
		pp.clickOnKebabMenu2("Folder2");
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=17)
	public void docSubFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.FolderCreation("Folder3");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.FolderCreation("Folder4");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.selFolder2("Folder3");
		Thread.sleep(2000);
		pp.FolderCreation("Folder5");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.FolderCreation("Folder6");
		pp.FolderCreationAlert();
		Thread.sleep(2000);	
		driver.navigate().refresh();
	}
	
	@Test(priority=18)
	public void docSubFolderEdit() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Folder3");
		Thread.sleep(2000);
		pp.selFolder2("Folder5");
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.FolderEdit();
		pp.FolderUpdationAlert();
		
	}
	
	@Test(priority=19)
	public void docSubFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();		
	}
	
	@Test(priority=20)
	public void docSubFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.permissionsFolder("Quality Analyst");
		pp.PermissionsFolderAlert();
	}
	

	@Test(priority=21)
	public void docSubFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.ShareFolder("Quality Analyst");
		pp.shareFolderAlert();
	}
	
	@Test(priority=22)
	public void docSubFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.deleteFolder();
		pp.deleteFolderAlert();
	}
	
	@Test(priority=23)
	public void docSubFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Folder6");
		pp.clickOnKebabMenu2("Folder6");
		Thread.sleep(2000);
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=24)
	public void docUploadDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		Thread.sleep(3000);
		//pp.clickOnProjectMenu();//
		//pp.selProject("PROJECT1");//
		pp.selFolder2("Folder3");
		pp.createDocumentIcon();
		pp.fillDocument("D1", "Neethumol P S", "V1.1");
		pp.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (1).xlsx");
		pp.uploadDocAlert();
		Thread.sleep(2000);
		pp.createDocumentIcon();
		pp.fillDocument("D1", "Neethumol P S", "V1.1");
		pp.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (2).xlsx");
		pp.uploadDocAlert();
		Thread.sleep(2000);
	}
	
	@Test(priority=25)
	public void docEditDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.editDoc("D2");
		pp.editDocAlert();
	}
	
	@Test(priority=26)
	public void docPermissionDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.permissionDoc("Quality Analyst");
		pp.permissionDocAlert();
	}
	
	@Test(priority=27)
	public void docShareDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.shareDoc("Quality Analyst");
		pp.shareDocAlert();
	}
	
	@Test(priority=28)
	public void docDeletDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.deleteDoc();
		pp.deleteDocAlert();
	}
	
	@Test(priority=29)
	public void docArchiveDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (2).xlsx");
		pp.archiveDoc();
		pp.archiveDocAlert();
		driver.navigate().refresh();
	}
	
	@Test(priority=30) 
	public void addSignersToTheDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Folder3");
		pp.createDocumentIcon();
		pp.fillDocument_addSigners("D1", "Neethumol P S", "V1.1","UAT Test script","Neethumol P S","Neethu Tester","Neethug G");
		pp.uploadDoc("C:\\Users\\lenovo\\Downloads\\UAT EIDSA - E-Consent 1.docx");
		pp.uploadDocAlert();
		Thread.sleep(1000);
	}
	
	@Test(priority=31)
	public void addSigners_Document() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selDoc("UAT EIDSA - E-Consent 1.docx");
		pp.addSigners("Neethur R");
		pp.addSignersAlert();
	}
	
	@Test(priority=32)
	public void signDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.signDocument("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		pp.signAlert();
		Thread.sleep(10000);
	}
	
	@Test(priority=33)
	public void approvalDoc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentApprovalDoc("Quality Analyst");
		pp.documentApprovalAlert();
		Thread.sleep(1000);
	}

	
	@Test(priority=34)
	public void addNewVersion_Doc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		Thread.sleep(10000);
		pp.addNewVersion("D2", "V1.2");
		pp.uploadDoc("C:\\Users\\lenovo\\Downloads\\UAT EIDSA - E-Consent 1.docx");
		pp.uploadDocAlert1();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
	}
	
	@Test(priority=35)
	public void docDownload_Print() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.download();
		//pp.print();
	}
	
	
	@Test(priority=36)
	public void devMainFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.selProject("PROJECT1");
		pp.clickOnDevelopment();
		pp.devFolderCreation("F1");
		pp.FolderCreationAlert();	
	}
	
	@Test(priority=37)
	public void devMainFolderEdit() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.FolderEdit();
		pp.FolderUpdationAlert();
	}
	
	@Test(priority=38)
	public void devMainFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();
	}
	
	@Test(priority=39)
	public void devMainFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.permissionsFolder("Quality Analyst");
		pp.PermissionsFolderAlert();
	}
	
	@Test(priority=40)
	public void devMainFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.ShareFolder("Quality Analyst");
		pp.shareFolderAlert();
	}
	
	@Test(priority=41)
	public void devMainFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.deleteFolder();
		pp.deleteFolderAlert();
	} 
	
	@Test(priority=42)
	public void devMainFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.devFolderCreation("F2");
		pp.FolderCreationAlert();
		pp.clickOnKebabMenu2("F2");
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=43)
	public void devSubFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.devFolderCreation("F3");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.devFolderCreation("F4");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.selFolder2("F3");
		Thread.sleep(2000);
		pp.devFolderCreation("F5");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.devFolderCreation("F6");
		pp.FolderCreationAlert();
		Thread.sleep(2000);	
		driver.navigate().refresh();
	}
	
	@Test(priority=44)
	public void devSubFolderEdit() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnDevelopment();
		pp.selFolder2("F3");
		Thread.sleep(2000);
		pp.selFolder2("F5");
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.FolderEdit();
		pp.FolderUpdationAlert();
		
	}
	
	@Test(priority=45)
	public void devSubFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();		
	}
	
	@Test(priority=46)
	public void devSubFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.permissionsFolder("Quality Analyst");
		pp.PermissionsFolderAlert();
	}
	

	@Test(priority=47)
	public void devSubFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.ShareFolder("Quality Analyst");
		pp.shareFolderAlert();
	}
	
	@Test(priority=48)
	public void devSubFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.deleteFolder();
		pp.deleteFolderAlert();
	}
	
	@Test(priority=49)
	public void devSubFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F6");
		pp.clickOnKebabMenu2("F6");
		Thread.sleep(2000);
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=50)
	public void devUploadDocument_SubmitAndSign() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F3");
		pp.fillDocument_submitAndSign("Unit Test", "T1", "M1", "S1", "Neethumol P S", "Neethumol P S", "Neethumol P S", "A1", "neethumolp@datamatica.uk", "Neethu@12345", "Confirmation");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
	}
	
	@Test(priority=51)
	public void addNewVersion1() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		Thread.sleep(3000);
		pp.selFolder2("F3");
		Thread.sleep(4000);
		WebElement view = driver.findElement(By.xpath("(//img[@alt='View document'])[1]"));
		view.click();
		Thread.sleep(4000);
		pp.addNewVersion_submitDocument1("neethumolp@datamatica.uk","Neethu@12345","Approval");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
	}
	
	@Test(priority=52)
	public void download_printDoc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F3");
		Thread.sleep(4000);
		WebElement view = driver.findElement(By.xpath("(//img[@alt='View document'])[1]"));
		view.click();
		Thread.sleep(4000);
		pp.docDownload();
		//pp.docPrint();	
		
	}
	
	
	@Test(priority=53)
	public void addNewVersion2() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.selProject("PROJECT1");
		pp.clickOnDevelopment();
		pp.selFolder2("F3");
		Thread.sleep(4000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.clickOnNewVersion();
		Thread.sleep(4000);
		pp.addNewVersion_submitDocument2("neethumolp@datamatica.uk","Neethu@12345","Approval");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
		

	}

	@Test(priority=54)
	public void devUploadDocument_Save() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F3");
		Thread.sleep(3000);
		pp.fillDocument_save("Unit Test", "T2", "M2", "S2", "Neethumol P S", "Neethumol P S", "Neethumol P S", "A1");
		pp.documentGenerationAlert_save1();
		Thread.sleep(2000);
	}
	
	@Test(priority=55)
	public void editSavedDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F3");
		Thread.sleep(3000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.editSavedDocument();
		pp.editSavedDocument1("T3");
		pp.documentGenerationAlert_save1();
		
	}
	
	@Test(priority=56)
	public void addNewVersion_savedDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F3");
		Thread.sleep(3000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.newVersionOfSavedDocument();
		pp.addNewVersion_savedDocument();
		pp.documentGenerationAlert_save1();
		
	}
	
	@Test(priority=57)
	public void addNewVersion_Document() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F3");
		Thread.sleep(3000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.deleteSavedDocument();
		pp.savedDocumentDeleteAlert();
		
	}
	
	@Test(priority=58)
	public void savedDocumentToSubmittedDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F3");
		Thread.sleep(3000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.editSavedDocument();
		pp.savedToSubmitDocument("neethumolp@datamatica.uk","Neethu@12345","Approval");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=59)
	public void archiveProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.clickOnKebabMenu1("PROJECT1");
		pp.deleteProject();
		pp.deleteProjectAlert();	
	}
	
	@Test(priority=60)
	public void deleteProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.ProjectCreation("PROJECT2", "Dev");
		pp.projectCreationAlert();	
		pp.clickOnKebabMenu1("PROJECT2");
		pp.archiveProject();
		pp.archiveProjectAlert();	
	}
}
