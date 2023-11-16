package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.DesignationPage;

import Base.BaseClassTest;

public class TC_007_Designation extends BaseClassTest {

	@Test(priority=1)
	public void createDesignation() throws IOException, InterruptedException
	{
		DesignationPage up = new DesignationPage(driver);
		up.clickDesignation();
		up.clickCreateDesignation("Automation Tester", "NA");
		up.creationAlert();	
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void setPrivilege() throws IOException, InterruptedException
	{
		DesignationPage up = new DesignationPage(driver);
		up.desSeach("Automation Tester");
		up.privilege("Automation Tester");
		up.setPrivilege();
		up.privilegeAlert1();
		driver.navigate().refresh();		
	}
	
	@Test(priority=3)
	public void editPrivilege() throws IOException, InterruptedException
	{
		DesignationPage up = new DesignationPage(driver);
		up.desSeach("Automation Tester");
		up.privilege("Automation Tester");
		up.setPrivilege();
		up.privilegeAlert2();
		driver.navigate().refresh();		
	}
	@Test(priority=4)
	public void edit() throws IOException, InterruptedException
	{
		DesignationPage up = new DesignationPage(driver);
		up.desSeach("Automation Tester");
		up.edit1("Automation Tester");
		up.editdes("NA");
		up.editAlert();
		driver.navigate().refresh();
	}

	@Test(priority=5)
	public void delete() throws IOException, InterruptedException
	{
	DesignationPage up = new DesignationPage(driver);
	up.desSeach("Automation Tester");
	up.delete("Automation Tester");
	up.deleteAlert();
	driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void desNameSearchValidation() throws IOException, InterruptedException
	{
	DesignationPage up = new DesignationPage(driver);
	up.desSeach("Quality Analyst");
	Assert.assertTrue(up.desNameValidation("Quality Analyst"));
	logger.info("Designation name search functionality verified");	
	driver.navigate().refresh();
	}
}
