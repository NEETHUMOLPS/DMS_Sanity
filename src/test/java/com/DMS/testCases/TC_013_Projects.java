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
		pp.ProjectCreation("DMSPROJECT01", "IT");
		pp.projectCreationAlert();		
	}
	
	@Test(priority=2)
	public void editProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu1("DMSPROJECT01");
		pp.editProject("NA");
		pp.projectEditAlert();		
	}
	
	@Test(priority=3)
	public void addProjectRole() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selProject("DMSPROJECT01");
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
		pp.createUser("QA");
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
		pp.permissionsFolder("QA");
		pp.PermissionsFolderAlert();
		driver.navigate().refresh();
	}
	
	@Test(priority=14)
	public void docMainFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.ShareFolder("QA");
		pp.shareFolderAlert();
	}
	
	/*@Test(priority=15)
	public void docMainFolderShare_ExternalUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.shareFolder_ExternalUser("2023-12-29T10:03");
		pp.shareFolder_ExternalUserAlert();
	}*/
	
	@Test(priority=16)
	public void docMainFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder1");
		pp.deleteFolder();
		pp.deleteFolderAlert();
	} 
	
	@Test(priority=17)
	public void docMainFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.FolderCreation("Folder2");
		pp.FolderCreationAlert();
		pp.clickOnKebabMenu2("Folder2");
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=18)
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
	
	/*@Test(priority=19)
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
	
	@Test(priority=20)
	public void docSubFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();		
	}
	
	@Test(priority=21)
	public void docSubFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.permissionsFolder("QA");
		pp.PermissionsFolderAlert();
	}
	

	@Test(priority=22)
	public void docSubFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.ShareFolder("QA");
		pp.shareFolderAlert();
	}
	
	/*@Test(priority=23)
	public void docSubFolderShare_ExternalUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.shareFolder_ExternalUser("2023-12-28T10:03");
		pp.shareFolder_ExternalUserAlert();
	}
	
	@Test(priority=24)
	public void docSubFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Folder5");
		Thread.sleep(2000);
		pp.deleteFolder();
		pp.deleteFolderAlert();
	}
	
	@Test(priority=25)
	public void docSubFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Folder6");
		pp.clickOnKebabMenu2("Folder6");
		Thread.sleep(2000);
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}*/
	
	@Test(priority=26)
	public void docUploadDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		Thread.sleep(3000);
		//pp.clickOnProjectMenu();//
		//pp.selProject("PROJECT1");//
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
	
	@Test(priority=27)
	public void docEditDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.editDoc("D2");
		pp.editDocAlert();
	}
	
	@Test(priority=28)
	public void docPermissionDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.permissionDoc("QA");
		pp.permissionDocAlert();
	}
	
	@Test(priority=29)
	public void docShareDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.shareDoc("QA");
		pp.shareDocAlert();
	}
	
	@Test(priority=30)
	public void docDeletDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (1).xlsx");
		pp.deleteDoc();
		pp.deleteDocAlert();
	}
	
	@Test(priority=31)
	public void docArchiveDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentActions("Sample (2).xlsx");
		pp.archiveDoc();
		pp.archiveDocAlert();
		driver.navigate().refresh();
	}
	
	@Test(priority=32) 
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
	
	@Test(priority=33)
	public void addSigners_Document() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selDoc("UAT EIDSA - E-Consent 1 (11).docx");
		pp.addSigners("Neethur R");
		pp.addSignersAlert();
	}
	
	@Test(priority=34)
	public void signDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.signDocument("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		pp.signAlert();
		Thread.sleep(10000);
	}
	
	@Test(priority=35)
	public void approvalDoc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentApprovalDoc("QA");
		pp.documentApprovalAlert();
		Thread.sleep(1000);
	}

	
	@Test(priority=36)
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
	
	@Test(priority=37)
	public void docDownload_Print() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.download();
		//pp.print();
	}
	
	
	@Test(priority=38)
	public void devMainFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.selProject("DMSPROJECT01");
		pp.clickOnDevelopment();
		pp.devFolderCreation("Fol3");
		pp.FolderCreationAlert();	
	}
	
	/*@Test(priority=39)
	public void devMainFolderEdit() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		pp.FolderEdit();
		pp.FolderUpdationAlert();
	}
	
	@Test(priority=40)
	public void devMainFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();
	}
	
	@Test(priority=41)
	public void devMainFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		pp.permissionsFolder("QA");
		pp.PermissionsFolderAlert();
	}
	
	@Test(priority=42)
	public void devMainFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		pp.ShareFolder("QA");
		pp.shareFolderAlert();
	}
	
	/*@Test(priority=43)
	public void devMainFolderShare_ExternalUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		Thread.sleep(2000);
		pp.shareFolder_ExternalUser("2023-12-28T10:03");
		pp.shareFolder_ExternalUserAlert();
	}
	
	@Test(priority=44)
	public void devMainFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol1");
		pp.deleteFolder();
		pp.deleteFolderAlert();
	} 
	
	@Test(priority=45)
	public void devMainFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.devFolderCreation("Fol2");
		pp.FolderCreationAlert();
		pp.clickOnKebabMenu2("Fol2");
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=46)
	public void devSubFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.devFolderCreation("Fol3");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.devFolderCreation("Fol4");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		pp.devFolderCreation("Fol5");
		pp.FolderCreationAlert();
		Thread.sleep(2000);
		pp.devFolderCreation("Fol6");
		pp.FolderCreationAlert();
		Thread.sleep(2000);	
		driver.navigate().refresh();
	}
	
	@Test(priority=47)
	public void devSubFolderEdit() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnDevelopment();
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		pp.selFolder2("Fol5");
		pp.clickOnKebabMenu2("Fol5");
		Thread.sleep(2000);
		pp.FolderEdit();
		pp.FolderUpdationAlert();
		
	}
	
	@Test(priority=48)
	public void devSubFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol5");
		Thread.sleep(2000);
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();		
	}
	
	@Test(priority=49)
	public void devSubFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol5");
		Thread.sleep(2000);
		pp.permissionsFolder("QA");
		pp.PermissionsFolderAlert();
	}
	

	@Test(priority=50)
	public void devSubFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol5");
		Thread.sleep(2000);
		pp.ShareFolder("QA");
		pp.shareFolderAlert();
	}
	
	@Test(priority=51)
	public void devSubFolderShare_ExternalUser() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol5");
		Thread.sleep(2000);
		pp.shareFolder_ExternalUser("2023-12-28T10:03");
		pp.shareFolder_ExternalUserAlert();
	}
	
	@Test(priority=52)
	public void devSubFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("Fol5");
		Thread.sleep(2000);
		pp.deleteFolder();
		pp.deleteFolderAlert();
	}
	
	@Test(priority=53)
	public void devSubFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol6");
		pp.clickOnKebabMenu2("Fol6");
		Thread.sleep(2000);
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}*/
	
	@Test(priority=54)
	public void devUploadDocument_SubmitAndSign() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		pp.fillDocument_submitAndSign("Unit Test", "T1", "M1", "S1", "Neethumol PS", "Neethumol PS", "Neethumol PS", "A1", "neethumolp@datamatica.uk", "Neethu@12345", "Confirmation");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
	}
	
	@Test(priority=55)
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
	
	@Test(priority=56)
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
		
	}
	
	
	@Test(priority=57)
	public void addNewVersion2() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.selProject("DMSPROJECT01");
		pp.clickOnDevelopment();
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.clickOnNewVersion();
		Thread.sleep(2000);
		pp.addNewVersion_submitDocument2("neethumolp@datamatica.uk","Neethu@12345","Approval");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
		

	}

	@Test(priority=58)
	public void devUploadDocument_Save() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		pp.fillDocument_save("Unit Test", "T2", "M2", "S2", "Neethumol PS", "Neethumol PS", "Neethumol PS", "A1");
		pp.documentGenerationAlert_save1();
		Thread.sleep(2000);
	}
	
	@Test(priority=59)
	public void editSavedDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.editSavedDocument();
		pp.editSavedDocument1("Fol3");
		pp.documentGenerationAlert_save1();
		
	}
	
	@Test(priority=60)
	public void addNewVersion_savedDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.newVersionOfSavedDocument();
		pp.addNewVersion_savedDocument();
		pp.documentGenerationAlert_save1();
		
	}
	
	@Test(priority=61)
	public void addNewVersion_Document() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.deleteSavedDocument();
		pp.savedDocumentDeleteAlert();
		
	}
	
	@Test(priority=62)
	public void savedDocumentToSubmittedDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("Fol3");
		Thread.sleep(2000);
		WebElement action = driver.findElement(By.xpath("//div[@id='primaryDocumentTree']/table/tbody/tr/td[6]/div/i"));
		action.click();
		pp.editSavedDocument();
		pp.savedToSubmitDocument("neethumolp@datamatica.uk","Neethu@12345","Approval");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=63)
	public void deleteProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		Thread.sleep(2000);
		pp.clickOnKebabMenu1("DMSPROJECT01");
		pp.deleteProject();
		pp.deleteProjectAlert();	
	}
	
	@Test(priority=64)
	public void archiveProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.ProjectCreation("DMSPROJECT08", "IT");
		pp.projectCreationAlert();	
		pp.clickOnKebabMenu1("DMSPROJECT08");
		pp.archiveProject();
		pp.archiveProjectAlert();	
	}
}
