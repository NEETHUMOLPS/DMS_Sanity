package com.DMS.pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class Departments extends AbstractComponent{
	static WebDriver driver;
	public Departments(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Departments menu
	@FindBy(xpath="//img[@alt='departments menu']")
	WebElement departmentsMenu;
	
	//Department creation
	@FindBy(xpath="//img[@alt='create organization']")
	WebElement createDepartment;
	@FindBy(xpath="//input[@placeholder='Enter Department Name']")
	WebElement enterDepartmentName;
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement add;
	@FindBy(xpath="//label[@class='tree_labels']")
	List<WebElement> departmentList;
	
	//Folder Creation
	@FindBy(xpath="//img[@alt='create department']")
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
	@FindBy(xpath="//span[contains(text(),'Save')]")
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
	@FindBy(xpath="(//label[@class='tree_labels'][normalize-space()='QA'])[2]")
	WebElement selectDepartment2;
	@FindBy(xpath="//button[contains(text(),'Move')]")
	WebElement move;
	
	//permissions - main folder
	@FindBy(xpath="//label[contains(text(),'Choose Designation')]//following-sibling::select")
	WebElement chooseDesignation1;
	@FindBy(xpath="//input[@value='neethug']")
	WebElement name1;
	@FindBy(xpath="//input[@value='Neethur']")
	WebElement name2;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save4;
	
	//share - main folder
	@FindBy(xpath="//label[contains(text(),'Choose Designation')]//following-sibling::select")
	WebElement chooseDesignation2;
	@FindBy(xpath="//button[contains(text(),'Share')]")
	WebElement share3;
	
	//Sub folder creation
	@FindBy(xpath="//label[@class='tree_label tree_label']")
	List<WebElement> clickOnSubFolder;
	@FindBy(xpath="//div[@class='px-2 more-option-icon cursor-pointer']")
	List<WebElement> kebabMenu3;
	
	//Document screen
	
	@FindBy(xpath="(//img[@alt='create department'])[2]")
	WebElement createDocIcon;	
	@FindBy(xpath="//label[contains(text(),'Title')]//following-sibling::input[1]")
	WebElement docTitle;
	@FindBy(xpath="//select[@id='owner']")
	WebElement docowner;
	@FindBy(xpath="//textarea[@id='description']")
	WebElement documentDescription;
	@FindBy(xpath="//select[@id='category']")
	WebElement catagory;
	@FindBy(xpath="//select[@id='standard']")
	WebElement standard;
	@FindBy(xpath="//select[@id='document type']")
	WebElement doctype;
	@FindBy(xpath="//label[contains(text(),'Version')]//following-sibling::input[1]")
	WebElement docversion;
	@FindBy(xpath="//input[@for='expiry-date']")
	WebElement expiryDate;
	@FindBy(xpath="//textarea[@id='changesHistory']")
	WebElement changesHistory;
	@FindBy(xpath="(//button[normalize-space()='Browse'])[1]")
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
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement shareDocument;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement deleteDoc;
	@FindBy(xpath="//div[contains(text(),'Archive')]")
	WebElement archiveDoc;
	
	public void clickOnDepartment() throws InterruptedException
	{		
		Thread.sleep(3000);
		departmentsMenu.click();
		Thread.sleep(3000);		
	}
	
	public void createDepartment(String dep) throws InterruptedException
	{		
		Thread.sleep(2000);
		createDepartment.click();
		Thread.sleep(2000);	
		enterDepartmentName.sendKeys(dep);
		Thread.sleep(2000);	
		add.click();
		Thread.sleep(2000);	;
	}
	
	public static boolean departmentCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Department created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void selDepartment(String dep) throws InterruptedException
	{
		for(int i=0;i<departmentList.size();i++)
		{
			String text=departmentList.get(i).getText();
			if(text.equals(dep))
			{
				departmentList.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
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
		Select os = new Select(chooseDesignation1);
		os.selectByVisibleText(role);
		Thread.sleep(3000);
		name1.click();
		Thread.sleep(2000);
		save4.click();
		Thread.sleep(3000);
		
	}
	
	public void ShareFolder(String role) throws InterruptedException
	{		
		Thread.sleep(3000);
		share2.click();
		Thread.sleep(3000);
		Select os = new Select(chooseDesignation2);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
		name2.click();
		Thread.sleep(2000);
		share3.click();
		Thread.sleep(3000);
		
	}
	
	public void FolderEdit() throws InterruptedException
	{		
		Thread.sleep(3000);
		edit2.click();
		Thread.sleep(5000);
		save3.click();
		Thread.sleep(3000);
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
	
	public static boolean FolderCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Folder created successfully"));
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
		Select os = new Select(chooseDesignation1);
		os.selectByVisibleText(role);
		Thread.sleep(3000);
		name1.click();
		Thread.sleep(2000);
		save4.click();
		Thread.sleep(3000);		
	}
	
	public void shareDoc(String role) throws Exception
	{
		Thread.sleep(2000);	
		shareDoc.click();
		Thread.sleep(2000);
		Select os = new Select(chooseDesignation2);
		os.selectByVisibleText(role);
		Thread.sleep(3000);
		name2.click();
		Thread.sleep(2000);
		shareDocument.click();
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