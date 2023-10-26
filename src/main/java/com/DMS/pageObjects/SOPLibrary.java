package com.DMS.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;

import com.AbstractComponents.AbstractComponent;

public class SOPLibrary extends AbstractComponent{
	static WebDriver driver;
	public SOPLibrary(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Dashboard menu
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	WebElement dashboard;
	
	//Approvals  menu
	@FindBy(xpath="//b[contains(text(),'SOP Library')]")
	WebElement sopLibrary;
	@FindBy(xpath="//a[contains(text(),'Trainee SOPs')]")
	WebElement traineeSOP;
	@FindBy(xpath="//a[contains(text(),'SOPs for verification')]")
	WebElement sopForVerification;
	@FindBy(xpath="//a[contains(text(),'Initiator SOPs')]")
	WebElement initiatorSOP;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> documentName1;
	@FindBy(xpath="//td[2]")
	List<WebElement> trainerName1;
	@FindBy(xpath="//td[3]")
	List<WebElement> startDate;
	@FindBy(xpath="//td[4]")
	List<WebElement> endDate;
	@FindBy(xpath="//td[5]")
	List<WebElement> status1;
	@FindBy(xpath="//td[6]")
	List<WebElement> view1;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> documentName2;
	@FindBy(xpath="//td[2]")
	List<WebElement> traineeName2;
	@FindBy(xpath="//td[3]")
	List<WebElement> startDate2;
	@FindBy(xpath="//td[4]")
	List<WebElement> endDate2;
	@FindBy(xpath="//td[5]")
	List<WebElement> status2;
	@FindBy(xpath="//td[6]")
	List<WebElement> view2;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> documentName3;
	@FindBy(xpath="//td[2]")
	List<WebElement> traineeName3;
	@FindBy(xpath="//td[3]")
	List<WebElement> trainerName3;
	@FindBy(xpath="//td[4]")
	List<WebElement> startDate3;
	@FindBy(xpath="//td[5]")
	List<WebElement> endDate3;
	@FindBy(xpath="//td[6]")
	List<WebElement> status3;
	@FindBy(xpath="//td[7]")
	List<WebElement> view3;
	
	//Sign_TraineeSOP
	@FindBy(xpath="//input[@id='agreement']")
	WebElement agree1;
	@FindBy(xpath="//b[contains(text(),'Click here to sign')]")
	WebElement sign1;
	@FindBy(xpath="//input[@id='email']")
	WebElement email1;
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd1;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement reason1;
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement submit1;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/button[1]/span[1]/i[1]")
	WebElement close1;
	
	//Download
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")
	WebElement download1;
	
	
	
	public void clickOnDashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		dashboard.click();
		Thread.sleep(2000);
	}
	
	public void clickOnsopForVerification() throws InterruptedException
	{
		Thread.sleep(2000);
		sopForVerification.click();
		Thread.sleep(2000);
	}
	
	public void clickOninitiatorSOP() throws InterruptedException
	{
		Thread.sleep(2000);
		initiatorSOP.click();
		Thread.sleep(2000);
	}
	
	public void clickOnDownload1() throws InterruptedException
	{
		Thread.sleep(2000);
		download1.click();
		Thread.sleep(2000);
	}
	
	public void clickOnSOPLibrary() throws InterruptedException
	{
		Thread.sleep(2000);
		sopLibrary.click();
		Thread.sleep(2000);
	}
	
	public void sign_TraineeSop(String em,String pwd,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		agree1.click();
		Thread.sleep(2000);
		sign1.click();
		Thread.sleep(2000);
		email1.sendKeys(em);
		Thread.sleep(2000);
		pwd1.sendKeys(pwd);
		Thread.sleep(2000);
		Select s = new Select(reason1);
		s.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit1.click();
		Thread.sleep(2000);
		close1.click();
		Thread.sleep(2000);		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);	
	}
	
	public void sign_TrainerSop(String em,String pwd,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		sign1.click();
		Thread.sleep(2000);
		email1.sendKeys(em);
		Thread.sleep(2000);
		pwd1.sendKeys(pwd);
		Thread.sleep(2000);
		Select s = new Select(reason1);
		s.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit1.click();
		Thread.sleep(2000);		
	}
	
	public void selView1(String st) throws InterruptedException
	{
		for(int i=0;i<status1.size();i++)
		{
			String text=status1.get(i).getText();
			if(text.equals(st))
			{
				view1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void selView2(String st) throws InterruptedException
	{
		for(int i=0;i<status2.size();i++)
		{
			String text=status2.get(i).getText();
			if(text.equals(st))
			{
				view2.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void selView3(String st) throws InterruptedException
	{
		for(int i=0;i<status3.size();i++)
		{
			String text=status3.get(i).getText();
			if(text.equals(st))
			{
				Thread.sleep(3000);
				view3.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public static boolean DigiSignAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("You have Digi-signed successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}

}
