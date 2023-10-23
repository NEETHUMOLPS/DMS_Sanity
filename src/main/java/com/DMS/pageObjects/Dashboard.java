package com.DMS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class Dashboard extends AbstractComponent{
	static WebDriver driver;
	public Dashboard(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[normalize-space()='Dashboard']")
	WebElement Dashboard;
	@FindBy(xpath="//b[normalize-space()='Department']")
	WebElement department;
	@FindBy(xpath="//b[normalize-space()='Projects']")
	WebElement projects;
	@FindBy(xpath="//b[normalize-space()='Users']")
	WebElement users;
	@FindBy(xpath="//b[normalize-space()='Designation']")
	WebElement designation;
	@FindBy(xpath="//b[normalize-space()='SOP Library']")
	WebElement sopLibrary;
	@FindBy(xpath="//b[normalize-space()='Configure Exam']")
	WebElement configureExam;
	@FindBy(xpath="//b[normalize-space()='My Files']")
	WebElement myFiles;
	@FindBy(xpath="//b[normalize-space()='Exam Evidence']")
	WebElement examEvidence;
	
	public void Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		Dashboard.click();
		Thread.sleep(2000);
	}
	
	public void department() throws InterruptedException
	{
		Thread.sleep(2000);
		department.click();
		Thread.sleep(2000);
	}
	
	public void projects() throws InterruptedException
	{
		Thread.sleep(2000);
		projects.click();
		Thread.sleep(2000);
	}
		
	public void users() throws InterruptedException
	{
		Thread.sleep(2000);
		users.click();
		Thread.sleep(2000);
	}
	
	public void designation() throws InterruptedException
	{
		Thread.sleep(2000);
		designation.click();
		Thread.sleep(2000);
	}
	
	public void sopLibrary() throws InterruptedException
	{
		Thread.sleep(2000);
		sopLibrary.click();
		Thread.sleep(2000);
	}
	
	public void configureExam() throws InterruptedException
	{
		Thread.sleep(2000);
		configureExam.click();
		Thread.sleep(2000);
	}
	
	public void myFiles() throws InterruptedException
	{
		Thread.sleep(2000);
		myFiles.click();
		Thread.sleep(2000);
	}
	
	public void examEvidence() throws InterruptedException
	{
		Thread.sleep(2000);
		examEvidence.click();
		Thread.sleep(2000);
	}
	

}
