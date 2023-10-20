package com.DMS.pageObjects;

import java.io.File;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class ProjectPage extends AbstractComponent{
	static WebDriver driver;
	public ProjectPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Users menu
	@FindBy(xpath="//img[@alt='projects menu']")
	WebElement projectsMenu;
	
	//Project creation
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement createProjectIcon;
	@FindBy(xpath="//label[contains(text(),'Project name')]//following-sibling::input[1]")
	WebElement projectName;
	@FindBy(xpath="//label[contains(text(),'Project code')]//following-sibling::input[1]")
	WebElement projectCode;
	@FindBy(tagName="select")
	WebElement projectType;
	@FindBy(xpath="//textarea[@class='form-control mb-2']")
	WebElement description;
	@FindBy(xpath="//input[@value='true']")
	WebElement active;
	@FindBy(xpath="//button[contains(text(),'Clear')]")
	WebElement clear;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save1;
	
	//project list
	@FindBy(xpath="//div[@id='primaryTree']")
	List<WebElement> projectsList;
	
	//options from kebab menu of project
	@FindBy(xpath="//i[@class='fa fa-ellipsis-v']")
	List<WebElement> kebabMenu1;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement edit1;
	@FindBy(xpath="//div[contains(text(),'Archive')]")
	WebElement archive1;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement delete1;
	
	//create folder
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement createFolder;
	@FindBy(xpath="//label[contains(text(),'Folder Name')]//following-sibling::input[1]")
	WebElement folderName;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	WebElement selectFormat1;
	@FindBy(xpath="//li[@id='format-multiselect-option-docx']")
	WebElement selectFormat2;
	@FindBy(xpath="//li[@id='format-multiselect-option-xlsx']")
	WebElement selectFormat3;
	@FindBy(xpath="//li[@id='format-multiselect-option-pdf']")
	WebElement selectFormat4;
	@FindBy(xpath="(//input[@id='password'])[1]")
	WebElement prefix;
	@FindBy(xpath="(//input[@id='password'])[2]")
	WebElement majVer;
	@FindBy(xpath="(//input[@id='password'])[3]")
	WebElement minVer;
	@FindBy(xpath="(//input[@id='password'])[4]")
	WebElement minMax;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save2;
	@FindBy(xpath="//body/div[@id='app']/div/div[@class='pace-done body-small']/div[@id='wrapper']/div[@id='page-wrapper']/div[@class='wrapper wrapper-content']/div[@class='row']/div[@class='create-folder-modal']/div[@class='folder-modal-container']/div[@class='ibox-content p-4']/div[@class='form-group pt-2']/span[1]")
	WebElement save3;
	
	//kebab options from main folder
	@FindBy(xpath="//label[@class='tree_label tree_label']") 
	List<WebElement> FoldersList1;
	@FindBy(xpath="//li[@class='d-flex justify-content-between']") 
	List<WebElement> FoldersList2;
	@FindBy(xpath="//i[@class='fa fa-ellipsis-v mr-3']")
	List<WebElement> kebabMenu2;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement edit2;
	@FindBy(xpath="//div[contains(text(),'Send to')]")
	WebElement sendTo2;
	@FindBy(xpath="//div[contains(text(),'Permissions')]")
	WebElement permissions2;
	@FindBy(xpath="//div[contains(text(),'Share')]")
	WebElement share2;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement delete2;
	@FindBy(xpath="//div[contains(text(),'Archive')]")
	WebElement archive2;
	
	//Send To - main folder
	@FindBy(xpath="//label[contains(text(),'Select Department')]//following-sibling::select")
	WebElement selectDepartment1;
	@FindBy(xpath="//label[contains(text(),'QA')]")
	WebElement selectDepartment2;
	@FindBy(xpath="//button[contains(text(),'Move')]")
	WebElement move;
	
	//permissions - main folder
	@FindBy(xpath="//label[contains(text(),'Choose Role')]//following-sibling::select")
	WebElement chooseRole1;
	@FindBy(xpath="//input[@value='Neethu Tester']")
	WebElement name1;
	@FindBy(xpath="//input[@value='Neethug G']")
	WebElement name2;
	@FindBy(xpath="//input[@value='Neethur R']")
	WebElement name3;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save4;
	
	//share - main folder
	@FindBy(xpath="//label[contains(text(),'Choose Role')]//following-sibling::select")
	WebElement chooseRole2;
	@FindBy(xpath="//button[contains(text(),'Share')]")
	WebElement share3;
	
	//Sub folder creation
	@FindBy(xpath="//label[@class='tree_label tree_label']")
	List<WebElement> clickOnSubFolder;
	@FindBy(xpath="//div[@class='px-2 more-option-icon cursor-pointer']")
	List<WebElement> kebabMenu3;
	
	//Document screen
	
	@FindBy(xpath="//img[@alt='Add a file']")
	WebElement createDocIcon;	
	@FindBy(xpath="//label[contains(text(),'Title')]//following-sibling::input[1]")
	WebElement docTitle;
	@FindBy(xpath="//select[@id='owner']")
	WebElement docowner;
	@FindBy(xpath="//textarea[@id='document description']")
	WebElement documentDescription;
	@FindBy(xpath="//select[@id='department']")
	WebElement department;
	@FindBy(xpath="//select[@id='category']")
	WebElement catagory;
	@FindBy(xpath="//select[@id='standard']")
	WebElement standard;
	@FindBy(xpath="//select[@id='document type']")
	WebElement doctype;
	@FindBy(xpath="//label[contains(text(),'Version')]//following-sibling::input[1]")
	WebElement docversion;
	@FindBy(xpath="//input[@id='expiry date']")
	WebElement expiryDate;
	@FindBy(xpath="//textarea[@id='changesHistory']")
	WebElement changesHistory;
	@FindBy(xpath="//button[@type='button']")
	WebElement browsedoc;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveDoc;
	@FindBy(xpath="//div[@id='primaryDocumentTree']//tr")
	List<WebElement> documents;	
	@FindBy(xpath="//div[@id='primaryDocumentTree']//tr//i")
	List<WebElement> documentoptions;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement editDoc;
	@FindBy(xpath="//div[contains(text(),'Send to')]")
	WebElement sendToDoc;
	@FindBy(xpath="//div[contains(text(),'Permissions')]")
	WebElement permissionsDoc;
	@FindBy(xpath="//div[contains(text(),'Share')]")
	WebElement shareDoc;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement deleteDoc;
	@FindBy(xpath="//div[contains(text(),'Archive')]")
	WebElement archiveDoc;
	
	//Profile
	@FindBy(xpath="//a[@id='profile']")
	WebElement profile;
	@FindBy(xpath="//img[@alt='Create project role']")
	WebElement addProjectRole;
	@FindBy(xpath="//label[contains(text(),'Role')]//following-sibling::input[1]")
	WebElement role;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveRole1;
	@FindBy(xpath="//div[@class='project-list']//tr")
	List<WebElement> roleList;
	@FindBy(xpath="//div[@class='project-list']//tr//i")////i[@class='fa fa-ellipsis-v']
	List<WebElement> roleOptions;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement editRole;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement deleteRole;
	@FindBy(xpath="//a[contains(text(),'Yes')]")
	WebElement yes;
	@FindBy(xpath="//button[@class='btn btn-primary'][normalize-space()='Save']")
	WebElement saveRole2;
	@FindBy(xpath="//img[@alt='Create Project User']")
	WebElement createUser;
	@FindBy(xpath="//label[contains(text(),'Choose Role')]//following-sibling::select")
	WebElement chooseRole;
	@FindBy(xpath="//div[@id='tab-2']/div/div/div/div/div[2]/div[3]/div/div/div[2]/div")
	WebElement chooseUser1;
	@FindBy(xpath="//span[contains(text(),'Neethu Tester')]")
	WebElement chooseUser2a;
	@FindBy(xpath="//span[contains(text(),'Neethug G')]")
	WebElement chooseUser2b;
	@FindBy(xpath="//span[contains(text(),'Neethur R')]")
	WebElement chooseUser2c;
	@FindBy(xpath="//div[@id='tab-2']/div/div/div/div/div[2]/div[3]/div/div/div[2]/div/span[2]")
	WebElement chooseUser3;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveUser;
	@FindBy(xpath="//div[@class='project-list1']//tr")
	List<WebElement> userList;
	@FindBy(xpath="//div[@class='project-list1']//tr//i")
	List<WebElement> userOptions;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement editUser;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement deleteUser;
	@FindBy(xpath="//label[contains(text(),'Choose Role')]//following-sibling::select")
	WebElement changeUser;

	
	//Develpoment
	@FindBy(xpath="//a[@id='development']")
	WebElement development;
	@FindBy(xpath="//select[@name='account']")
	WebElement createNewDoc;
	@FindBy(xpath="(//img[@alt='create department'])[2]")
	WebElement devCreateFolder;
	
	
	public void clickOnDevelopment() throws InterruptedException
	{
		Thread.sleep(2000);
		development.click();
		Thread.sleep(2000);
		
	}
	
	public void createUser(String role) throws InterruptedException
	{
		Thread.sleep(3000);
		createUser.click();
		Thread.sleep(3000);
		Select os = new Select(chooseRole);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
		chooseUser1.click();
		Thread.sleep(2000);
		chooseUser2a.click();
		Thread.sleep(2000);
		chooseUser2b.click();
		Thread.sleep(2000);
		chooseUser2c.click();
		Thread.sleep(2000);
		chooseUser3.click();
		Thread.sleep(3000);
		saveUser.click();		
	}
	
	public void editUser(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		editUser.click();
		Thread.sleep(3000);
		Select os = new Select(changeUser);
		os.selectByVisibleText(name);
		Thread.sleep(3000);
		saveUser.click();
		Thread.sleep(3000);
		
	}
	
	public void deleteUser() throws InterruptedException
	{
		Thread.sleep(3000);
		deleteUser.click();
		Thread.sleep(3000);
	}
	
	public void ProjectRoleCreation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		profile.click();
		Thread.sleep(2000);
		addProjectRole.click();
		Thread.sleep(2000);
		role.sendKeys(name);
		Thread.sleep(2000);
		saveRole1.click();
		Thread.sleep(2000);
	}
	
	public boolean roleActions(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		
		for(int i=0;i<roleList.size();i++)
		{
			String dname=roleList.get(i).getText();
			if(dname.contains(name))
			{
				Thread.sleep(3000);
				roleList.get(i).click();
				Thread.sleep(3000);
				roleOptions.get(i).click();
				Thread.sleep(1000);
				return true;
			}
		}
		return false;
	}
	
	public boolean userActions(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		
		for(int i=0;i<userList.size();i++)
		{
			String dname=userList.get(i).getText();
			if(dname.contains(name))
			{
				userOptions.get(i).click();
				Thread.sleep(1000);
				return true;
			}
		}
		return false;
	}
	
	public void RoleEdit(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		editRole.click();
		Thread.sleep(3000);
		role.clear();
		Thread.sleep(3000);
		role.sendKeys(name);
		saveRole1.click();
		Thread.sleep(2000);
		
	}
	
	public void RoleDelete() throws InterruptedException
	{
		Thread.sleep(3000);
		deleteRole.click();
		Thread.sleep(3000);
	}
	
	public void RoleImport() throws InterruptedException
	{
		Thread.sleep(3000);
		addProjectRole.click();
		Thread.sleep(2000);
		yes.click();
		Thread.sleep(2000);
		saveRole2.click();
		Thread.sleep(2000);
		
	}
	
	public void clickOnProjectMenu() throws InterruptedException
	{		
		Thread.sleep(3000);
		projectsMenu.click();
		Thread.sleep(3000);		
	}

	
	public void deleteFolder() throws InterruptedException
	{		
		Thread.sleep(3000);
		delete2.click();
		Thread.sleep(3000);
		
	}
	
	public void archiveFolder() throws InterruptedException
	{		
		Thread.sleep(3000);
		archive2.click();
		Thread.sleep(3000);
		
	}
	
	public void SendToFolder(String dep1) throws InterruptedException
	{		
		Thread.sleep(3000);
		sendTo2.click();
		Thread.sleep(3000);
		Select os = new Select(selectDepartment1);
		os.selectByVisibleText(dep1);
		Thread.sleep(3000);
		selectDepartment2.click();
		Thread.sleep(3000);
		move.click();
		Thread.sleep(3000);	
	}
	
	public void permissionsFolder(String role) throws InterruptedException
	{		
		Thread.sleep(3000);
		permissions2.click();
		Thread.sleep(3000);
		Select os = new Select(chooseRole1);
		os.selectByVisibleText(role);
		Thread.sleep(3000);
		name2.click();
		Thread.sleep(2000);
		save4.click();
		Thread.sleep(3000);
		
	}
	
	public void ShareFolder(String role) throws InterruptedException
	{		
		Thread.sleep(3000);
		share2.click();
		Thread.sleep(3000);
		Select os = new Select(chooseRole1);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
		name3.click();
		Thread.sleep(2000);
		share3.click();
		Thread.sleep(3000);
		
	}
	
	public void ProjectCreation(String pname,String ptype) throws InterruptedException
	{		
		Thread.sleep(3000);
		createProjectIcon.click();
		Thread.sleep(3000);	
		projectName.sendKeys(pname);
		Thread.sleep(3000);	
		Select sel=new Select(projectType);
		sel.selectByVisibleText(ptype);
		Thread.sleep(3000);	
		save1.click();		
	}
	
	public void FolderCreation(String fname) throws InterruptedException
	{		
		Thread.sleep(3000);
		createFolder.click();
		Thread.sleep(3000);
		folderName.sendKeys(fname);
		Thread.sleep(3000);
		save2.click();
		Thread.sleep(2000);
	}
	
	public void devFolderCreation(String fname) throws InterruptedException
	{		
		Thread.sleep(3000);
		devCreateFolder.click();
		Thread.sleep(3000);
		folderName.sendKeys(fname);
		Thread.sleep(3000);
		save2.click();
		Thread.sleep(2000);
	}
	
	public void FolderEdit() throws InterruptedException
	{		
		Thread.sleep(3000);
		edit2.click();
		Thread.sleep(5000);
		save3.click();
		Thread.sleep(3000);
	}
	
	public static boolean projectCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Project created successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean roleNameUpdationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean userUpdationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean importRoleAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Roles added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean roleCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Role created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean userCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean shareFolderAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Folder shared successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean projectEditAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Project details updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean FolderCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Folder created successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean FolderUpdationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("The folder details updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean sendToFolderAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to move the folder?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Folder moved successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean userDeleteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this user?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Deleted successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean roleDeletionAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this role?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Deleted successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean deleteFolderAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this folder ?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("All the folders and documents under this folder will be deleted ?"));
			alert2.accept();
			Thread.sleep(2000);
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alert3 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Folder deleted successfully"));
			alert3.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean archiveFolderAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to archive this folder?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("By archiving the folder, the selected folder, subfolder(s), and the documents inside the folder(s) will be archived."));
			alert2.accept();
			Thread.sleep(2000);
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.alertIsPresent());
			Alert alert3 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Folder archived successfully"));
			alert3.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean PermissionsFolderAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Permission added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean uploadDocAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Documents saved successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public boolean clickOnKebabMenu1(String pname) throws InterruptedException
	{
		Thread.sleep(3000);

		for(int i=0;i<projectsList.size();i++)
		{
			String selpname=projectsList.get(i).getText();
			if(selpname.equals(pname))
			{
				kebabMenu1.get(i).click();
				Thread.sleep(2000);
				return true;
			}
		}
		return false;
	}
	
	public boolean clickOnKebabMenu2(String pname) throws InterruptedException
	{
		Thread.sleep(3000);

		for(int i=0;i<FoldersList2.size();i++)
		{
			String selpname=FoldersList2.get(i).getText();
			if(selpname.equals(pname))
			{
				FoldersList2.get(i).click();
				Thread.sleep(2000);
				kebabMenu2.get(i).click();
				Thread.sleep(2000);
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean selFolder2(String name) throws InterruptedException
	{
		Thread.sleep(3000);

		for(int i=0;i<FoldersList1.size();i++)
		{
			String selpname=FoldersList1.get(i).getText();
			if(selpname.equals(name))
			{
				Thread.sleep(3000);
				FoldersList1.get(i).click();
				Thread.sleep(2000);
				return true;
			}
		}
		return false;
	}
	
	public void editProject(String des) throws InterruptedException
	{		
		Thread.sleep(3000);
		edit1.click();
		Thread.sleep(2000);
		description.sendKeys(des);
		Thread.sleep(3000);
		save1.click();
	}
	
	public boolean selProject(String pname) throws InterruptedException
	{
		Thread.sleep(3000);

		for(int i=0;i<projectsList.size();i++)
		{
			String inname=projectsList.get(i).getText();
			if(inname.contains(pname))
			{
				projectsList.get(i).click();
				return true;
			}
		}
		return false;
	}
	
	public void createDocumentIcon() throws InterruptedException
	{
		Thread.sleep(3000);
		createDocIcon.click();
		Thread.sleep(3000);
	}
	public void fillDocument(String dtitle,String downer, String ver) throws InterruptedException
	{
		Thread.sleep(3000);	
		docTitle.sendKeys(dtitle);
		Thread.sleep(3000);
		Select sel=new Select(docowner);
		sel.selectByVisibleText(downer);	
		Thread.sleep(3000);
		docversion.sendKeys(ver);
		Thread.sleep(3000);
	}
	
	public void uploadDoc(String doclocation) throws Exception
	{
		Thread.sleep(3000);	
		browsedoc.click();
		String absolutepath= new File(doclocation).getAbsolutePath();
		//browsedoc.sendKeys(absolutepath);
		Thread.sleep(3000);	
		Robot robot = new Robot();
		// Press the "CTRL" and "V" keys to paste the file path into the file input field
		StringSelection stringSelection = new StringSelection(absolutepath); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		// Press the "ENTER" key to submit the file
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		saveDoc.click();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
	}
	
	public boolean documentActions(String docname) throws InterruptedException
	{
		Thread.sleep(3000);
		
		for(int i=0;i<documents.size();i++)
		{
			String dname=documents.get(i).getText();
			if(dname.contains(docname))
			{
				documentoptions.get(i).click();
				Thread.sleep(1000);
				return true;
			}
		}
		return false;
	}
	
	public void editDoc(String title) throws Exception
	{
		Thread.sleep(2000);	
		editDoc.click();
		Thread.sleep(2000);	
		docTitle.clear();
		Thread.sleep(2000);	
		docTitle.sendKeys(title);
		Thread.sleep(2000);	
		saveDoc.click();
		Thread.sleep(2000);
	}
	
	public void permissionDoc(String role) throws Exception
	{
		Thread.sleep(2000);	
		permissionsDoc.click();
		Thread.sleep(2000);
		Select os = new Select(chooseRole1);
		os.selectByVisibleText(role);
		Thread.sleep(3000);
		name2.click();
		Thread.sleep(2000);
		save4.click();
		Thread.sleep(3000);		
	}
	
	public void shareDoc(String role) throws Exception
	{
		Thread.sleep(2000);	
		shareDoc.click();
		Thread.sleep(2000);
		Select os = new Select(chooseRole1);
		os.selectByVisibleText(role);
		Thread.sleep(3000);
		name3.click();
		Thread.sleep(2000);
		share3.click();
		Thread.sleep(3000);		
	}
	
	public void deleteDoc() throws Exception
	{
		Thread.sleep(2000);	
		deleteDoc.click();
		Thread.sleep(2000);	
	}
	
	public void archiveDoc() throws Exception
	{
		Thread.sleep(2000);	
		archiveDoc.click();
		Thread.sleep(2000);	
	}
	
	public static boolean editDocAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Document updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean permissionDocAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Permission added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean shareDocAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Document shared successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean deleteDocAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this document?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Document deleted successfully"));
			alert2.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean archiveDocAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to archive this document ?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Document archived successfully"));
			alert2.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}

}
