package com.DMS.pageObjects;

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

public class ConfigureExam extends AbstractComponent{
	static WebDriver driver;
	public ConfigureExam(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Configure Exam menu
	@FindBy(xpath="//span[normalize-space()='Dashboard']")
	WebElement dashboardMenu;
	@FindBy(xpath="//b[normalize-space()='Configure Exam']")
	WebElement configureExam;
	
	//Search
	@FindBy(xpath="//input[@type='text']")
	WebElement examNameSearch;
	@FindBy(xpath="//span[@type='button']")
	WebElement search;
	
	//Test config list
	@FindBy(xpath="//td[1]")
	List<WebElement> examName;
	@FindBy(xpath="//td[2]")
	List<WebElement> supervisorName;
	@FindBy(xpath="//td[3]")
	List<WebElement> percentage;
	@FindBy(xpath="//td[4]")
	List<WebElement> qusNo;
	@FindBy(xpath="//td[5]")
	List<WebElement> time;
	@FindBy(xpath="//td[6]")
	List<WebElement> edit;
	@FindBy(xpath="//td[7]")
	List<WebElement> view;
	
	//Create test
	@FindBy(xpath="//img[@alt='Create test']")
	WebElement createTest;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement testName;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement noOfQus;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement percentageToPass;
	@FindBy(xpath="//input[@placeholder='Hours']")
	WebElement hours;
	@FindBy(xpath="//input[@placeholder='Minutes ']")
	WebElement minutes;
	@FindBy(xpath="//input[@type='date']")
	WebElement examDate;
	@FindBy(xpath="//select[@name='account']")
	WebElement supervisor;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div[7]/div")
	WebElement des1;
	@FindBy(xpath="//li[@id='multiselect-option-baded23b-1d0a-4219-9b15-ff84dad86db0']")//li[contains(text(),'Quality Analyst')]
	WebElement des2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div[7]/div/span[2]")
	WebElement des3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div[8]/div")
	WebElement user1;
	@FindBy(id="multiselect-option-631b1a3f-8e9d-42fe-a35c-a8761f58aca6")//li[contains(text(),'Quality Analyst')]
	WebElement user2;
	@FindBy(id="multiselect-option-4bb7c35e-0e56-4813-82dd-a724b45768bd")
	WebElement user3;
	@FindBy(id="multiselect-option-9bb335ad-d9c4-4c8a-926a-7b39ec12ef1f")
	WebElement user4;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div[8]/div/span[2]")
	WebElement user5;
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	//Add user
	@FindBy(xpath="//div[@id='tab-1']//img[@alt='Add User']")
	WebElement addUser;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div/div")
	WebElement desig1;
	@FindBy(id="multiselect-option-baded23b-1d0a-4219-9b15-ff84dad86db0")
	WebElement desig2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div/div/span[2]")
	WebElement desig3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div[2]/div")
	WebElement users1;
	@FindBy(id="multiselect-option-4bb7c35e-0e56-4813-82dd-a724b45768bd")
	WebElement users2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div[2]/div/span[2]")
	WebElement users3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div[2]/button[2]")
	WebElement save;
	
	//Users list
	@FindBy(xpath="//td[1]")
	List<WebElement> employeeName;
	@FindBy(xpath="//td[2]")
	List<WebElement> testName1;
	@FindBy(xpath="//td[3]")
	List<WebElement> supervisorName1;
	@FindBy(xpath="//td[4]")
	List<WebElement> examDate1;
	@FindBy(xpath="//td[5]")
	List<WebElement> status;
	@FindBy(xpath="//td[6]")
	List<WebElement> view1;
	@FindBy(xpath="//td[7]")
	List<WebElement> actions;
	
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement delete;
	
	//Create question
	@FindBy(xpath="//a[normalize-space()='Questions']")
	WebElement question;
	@FindBy(xpath="//img[@alt='Create Question']")
	WebElement createQuestion;
	@FindBy(xpath="//input[@placeholder='Question']")
	WebElement question1;
	@FindBy(xpath="//input[@placeholder='options']")
	WebElement options;
	@FindBy(xpath="//input[@value='UserDto.option']")
	WebElement setAns;
	@FindBy(xpath="//button[normalize-space()='+ Add']")
	WebElement add;//setAns.click();
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save1;
	
	public void createQuestion1() throws InterruptedException
	{		
		Thread.sleep(2000);
		question.click();
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is statement coverage?");
		options.sendKeys("Testing each line of code at least once");
		setAns.click();
		add.click();
		options.sendKeys("Testing each possible combination of inputs");
		add.click();
		options.sendKeys("Testing the functionality of the software as a whole");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion2() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is system testing?");
		options.sendKeys("Testing each line of code at least once");
		setAns.click();
		add.click();
		options.sendKeys("Testing each possible combination of inputs");
		add.click();
		options.sendKeys("Testing the functionality of the software as a whole");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	
	public void clickOnConfigureExam() throws InterruptedException
	{		
		Thread.sleep(2000);
		configureExam.click();
		Thread.sleep(2000);
	}
	
	public void employeeDeletion() throws InterruptedException
	{		
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
	}
	
	public void selEmployeeView(String name) throws InterruptedException
	{
		for(int i=0;i<employeeName.size();i++)
		{
			String text=employeeName.get(i).getText();
			if(text.equals(name))
			{
				view1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void selEmployeeActions(String name) throws InterruptedException
	{
		for(int i=0;i<employeeName.size();i++)
		{
			String text=employeeName.get(i).getText();
			if(text.equals(name))
			{
				actions.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void userAddition() throws InterruptedException
	{		
		Thread.sleep(2000);
		addUser.click();
		Thread.sleep(2000);
		desig1.click();
		Thread.sleep(2000);
		desig2.click();
		Thread.sleep(2000);
		desig3.click();
		Thread.sleep(2000);
		users1.click();
		Thread.sleep(2000);
		users2.click();
		Thread.sleep(2000);
		users3.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}

	public void configureExam(String name,String no,String per,String date,String sup) throws InterruptedException
	{		
		Thread.sleep(2000);
		configureExam.click();
		Thread.sleep(2000);
		createTest.click();
		Thread.sleep(2000);
		testName.sendKeys(name);
		Thread.sleep(2000);
		noOfQus.sendKeys(no);
		Thread.sleep(2000);
		percentageToPass.sendKeys(per);
		Thread.sleep(2000);
		examDate.sendKeys(date);
		Thread.sleep(2000);
		Select os = new Select(supervisor);
		os.selectByVisibleText(sup);
		Thread.sleep(2000);
		des1.click();
		Thread.sleep(2000);
		des2.click();
		Thread.sleep(2000);
		des3.click();
		Thread.sleep(2000);
		user1.click();
		Thread.sleep(2000);
		user2.click();
		Thread.sleep(2000);
		user5.click();
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
	public static boolean examConfigurationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Exam configured successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean qusCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Question created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean employeeDeletionAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this user?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean userAdditionAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User added succesfullly"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void nameSearch(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		examNameSearch.sendKeys(name);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public Boolean nameValidation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =examName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<examName.size();i++)
			{
				String stat=examName.get(i).getText();
				if (!(stat.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
}
