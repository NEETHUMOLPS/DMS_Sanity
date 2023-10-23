package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ProjectPage;

import Base.BaseClassTest;

public class TC_007_Projects extends BaseClassTest {

	/*@Test(priority=1)
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
	public void devMainFolderCreation() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.selProject("PROJECT1");
		pp.clickOnDevelopment();
		pp.devFolderCreation("F1");
		pp.FolderCreationAlert();	
	}
	
	@Test(priority=31)
	public void devMainFolderEdit() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.FolderEdit();
		pp.FolderUpdationAlert();
	}
	
	@Test(priority=32)
	public void devMainFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();
	}
	
	@Test(priority=33)
	public void devMainFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.permissionsFolder("Quality Analyst");
		pp.PermissionsFolderAlert();
	}
	
	@Test(priority=34)
	public void devMainFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.ShareFolder("Quality Analyst");
		pp.shareFolderAlert();
	}
	
	@Test(priority=35)
	public void devMainFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F1");
		pp.deleteFolder();
		pp.deleteFolderAlert();
	} 
	
	@Test(priority=36)
	public void devMainFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.devFolderCreation("F2");
		pp.FolderCreationAlert();
		pp.clickOnKebabMenu2("F2");
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=37)
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
	
	@Test(priority=38)
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
	
	@Test(priority=39)
	public void devSubFolderSendTo() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.SendToFolder("QA");
		pp.sendToFolderAlert();		
	}
	
	@Test(priority=40)
	public void devSubFolderPermission() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.permissionsFolder("Quality Analyst");
		pp.PermissionsFolderAlert();
	}
	

	@Test(priority=41)
	public void devSubFolderShare() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.ShareFolder("Quality Analyst");
		pp.shareFolderAlert();
	}
	
	@Test(priority=42)
	public void devSubFolderDelete() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnKebabMenu2("F5");
		Thread.sleep(2000);
		pp.deleteFolder();
		pp.deleteFolderAlert();
	}
	
	@Test(priority=43)
	public void devSubFolderArchive() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.selFolder2("F6");
		pp.clickOnKebabMenu2("F6");
		Thread.sleep(2000);
		pp.archiveFolder();
		pp.archiveFolderAlert();
	}
	
	@Test(priority=44)
	public void devUploadDocument_SubmitAndSign() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		Thread.sleep(3000);
		pp.selFolder2("F3");
		pp.fillDocument_submitAndSign("Unit Test", "T1", "M1", "S1", "Neethumol P S", "Neethumol P S", "Neethumol P S", "A1", "neethumolp@datamatica.uk", "Neethu@12345", "Confirmation");
		pp.documentGenerationAlert_sumbmitAndSign();
		Thread.sleep(2000);
	}*/
	
	@Test(priority=45)
	public void addNewVersion() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();//
		pp.selProject("PROJECT1");//
		pp.clickOnDevelopment();//
		pp.selFolder2("F3");//
		Thread.sleep(3000);
		//pp.clickOnView("S1");
		driver.findElement(By.xpath("//img[@alt='View document']")).click();
		Thread.sleep(5000);
		pp.addNewVersion("Neethumol P S");
		pp.uploadDoc1("C:\\Users\\lenovo\\Downloads\\Sample (1).xlsx");
		pp.uploadDocAlert();	
	}
	
	@Test(priority=45)
	public void downloadDoc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.docDownload();
	}
	

	@Test(priority=46)
	public void printDoc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.docPrint();
	}
	
	@Test(priority=47)
	public void approveDoc() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.documentApproval("Quality Analyst");
		pp.documentApprovalAlert();
		driver. navigate(). back();
	}
	
	@Test(priority=48)
	public void devUploadDocument_Save() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		Thread.sleep(2000);
		pp.fillDocument_save("Unit Test", "T1", "M1", "S2", "Neethumol P S", "Neethumol P S", "Neethumol P S", "A1");
		pp.documentGenerationAlert_save();
	}
	
	@Test(priority=49)
	public void editSavedDocument() throws Exception
	{
		ProjectPage pp = new ProjectPage(driver);
		Thread.sleep(3000);
		pp.clickOnActions("S2");
		pp.editSavedDocument("T2");
		pp.documentGenerationAlert_save();
	}
	
	@Test(priority=50)
	public void archiveProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnProjectMenu();
		pp.clickOnKebabMenu1("PROJECT1");
		pp.archiveProject();
		pp.archiveProjectAlert();		
	}
	
	@Test(priority=51)
	public void deleteProject() throws IOException, InterruptedException
	{
		ProjectPage pp = new ProjectPage(driver);
		pp.ProjectCreation("PROJECT2", "Dev");
		pp.projectCreationAlert();	
		pp.clickOnKebabMenu1("PROJECT2");
		pp.deleteProject();
		pp.deleteProjectAlert();
	}
	

}
