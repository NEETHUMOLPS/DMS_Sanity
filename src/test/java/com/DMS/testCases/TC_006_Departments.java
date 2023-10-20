package com.DMS.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.DMS.pageObjects.Departments;
import com.DMS.pageObjects.ProjectPage;
import com.DMS.pageObjects.UsersPage;
import Base.BaseClassTest;

public class TC_006_Departments extends BaseClassTest {

	@Test(priority=1)
	public void createDepartment() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnDepartment();
		dp.createDepartment("AD2");
		dp.departmentCreationAlert();
	}
	
	@Test(priority=2)
	public void userAssigning() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		UsersPage up = new UsersPage(driver);
		up.clickUsers();
		up.nameSearch("Neethumol");
		Thread.sleep(2000);
		up.edit("Neethumol P S");
		Thread.sleep(2000);
		up.edituser2();
		up.editAlert();
		Thread.sleep(2000);
		up.nameSearch("Neethug");
		Thread.sleep(2000);
		up.edit("Neethug G");
		Thread.sleep(2000);
		up.edituser2();
		up.editAlert();
		Thread.sleep(2000);
		up.nameSearch("Neethur");
		Thread.sleep(2000);
		up.edit("Neethur R");
		Thread.sleep(2000);
		up.edituser2();
		up.editAlert();
		Thread.sleep(2000);
		dp.clickOnDepartment();		
	}
	
	@Test(priority=3)
	public void subDepartmentCreation() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.selDepartment("AD2");
		dp.createDepartment("AD2c");
		dp.departmentCreationAlert();
		driver.navigate().refresh();		
	}
	
	@Test(priority=4)
	public void mainFolderCreation() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.selDepartment("AD2");
		dp.FolderCreation("Fol1");
		dp.FolderCreationAlert();	
	}
	
	@Test(priority=5)
	public void MainFolderEdit() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.FolderEdit();
		dp.FolderUpdationAlert();
	}
	
	@Test(priority=6)
	public void MainFolderSendTo() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.SendToFolder("QA");
		dp.sendToFolderAlert();
	}
	
	@Test(priority=7)
	public void MainFolderPermission() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.permissionsFolder("Quality Analyst");
		dp.PermissionsFolderAlert();
	}
	
	@Test(priority=8)
	public void MainFolderShare() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.ShareFolder("Quality Analyst");
		dp.shareFolderAlert();
	}
	
	@Test(priority=9)
	public void MainFolderDelete() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.deleteFolder();
		dp.deleteFolderAlert();
	} 
	
	@Test(priority=10)
	public void MainFolderArchive() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.FolderCreation("F5");
		dp.FolderCreationAlert();
		dp.clickOnKebabMenu2("F5");
		dp.archiveFolder();
		dp.archiveFolderAlert();
	}
	
	@Test(priority=11)
	public void SubFolderCreation() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.FolderCreation("Fold3");
		dp.FolderCreationAlert();
		Thread.sleep(2000);
		dp.FolderCreation("Fold4");
		dp.FolderCreationAlert();
		Thread.sleep(2000);
		dp.selFolder2("Fold3");
		Thread.sleep(2000);
		dp.FolderCreation("Fold5");
		dp.FolderCreationAlert();
		Thread.sleep(2000);
		dp.FolderCreation("Fold7");
		dp.FolderCreationAlert();
		Thread.sleep(2000);	
		driver.navigate().refresh();
	}
	
	@Test(priority=12)
	public void SubFolderEdit() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.selDepartment("AD2");
		dp.selFolder2("Fold3");
		Thread.sleep(2000);
		dp.selFolder2("Fold5");
		dp.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		dp.FolderEdit();
		dp.FolderUpdationAlert();
		
	}
	
	@Test(priority=13)
	public void SubFolderSendTo() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		dp.SendToFolder("QA");
		dp.sendToFolderAlert();		
	}
	
	@Test(priority=14)
	public void SubFolderPermission() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		dp.permissionsFolder("Quality Analyst");
		dp.PermissionsFolderAlert();
	}
	

	@Test(priority=15)
	public void SubFolderShare() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		dp.ShareFolder("Quality Analyst");
		dp.shareFolderAlert();
	}
	
	@Test(priority=16)
	public void SubFolderDelete() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fold5");
		Thread.sleep(2000);
		dp.deleteFolder();
		dp.deleteFolderAlert();
	}
	
	@Test(priority=17)
	public void SubFolderArchive() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.selFolder2("Fold7");
		dp.clickOnKebabMenu2("Fold7");
		Thread.sleep(2000);
		dp.archiveFolder();
		dp.archiveFolderAlert();
	}
	
	@Test(priority=18)
	public void UploadDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		Thread.sleep(3000);
		dp.selFolder2("Fold3");
		dp.createDocumentIcon();
		dp.fillDocument("D1", "Neethumol P S", "V1.1");
		dp.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (1).xlsx");
		dp.uploadDocAlert();
		Thread.sleep(2000);
		dp.createDocumentIcon();
		dp.fillDocument("D1", "Neethumol P S", "V1.1");
		dp.uploadDoc("C:\\Users\\lenovo\\Downloads\\Sample (2).xlsx");
		dp.uploadDocAlert();
		Thread.sleep(2000);
	}
	
	@Test(priority=19)
	public void EditDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (1).xlsx");
		dp.editDoc("D2");
		dp.editDocAlert();
	}
	
	@Test(priority=20)
	public void PermissionDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (1).xlsx");
		dp.permissionDoc("Quality Analyst");
		dp.permissionDocAlert();
	}
	
	@Test(priority=21)
	public void ShareDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (1).xlsx");
		dp.shareDoc("Quality Analyst");
		dp.shareDocAlert();
	}
	
	@Test(priority=22)
	public void DeletDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (1).xlsx");
		dp.deleteDoc();
		dp.deleteDocAlert();
	}
	
	@Test(priority=23)
	public void ArchiveDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("Sample (2).xlsx");
		dp.archiveDoc();
		dp.archiveDocAlert();
		driver.navigate().refresh();
	}

}