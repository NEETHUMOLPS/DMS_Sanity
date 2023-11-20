package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.UsersPage;

import Base.BaseClassTest;

public class TC_006_Users extends BaseClassTest {

	@Test(priority=1)
	public void usersPage() throws IOException, InterruptedException
	{
		UsersPage up = new UsersPage(driver);
		up.clickUsers();
		up.clickCreateUsers("Neethurg", "RG", "NeethuRG", "neethurg@yopmail.com");
		up.creationAlert();
		driver.navigate().refresh();
	}
	
	
	@Test(priority=2)
	public void edit() throws IOException, InterruptedException
	{		
		UsersPage up = new UsersPage(driver);
		up.nameSearch("Neethurg RG");
		up.edit("Neethurg RG");
		up.edituser1("Neethurg");
		up.editAlert();
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void nameSearchValidation() throws IOException, InterruptedException
	{		
		UsersPage up = new UsersPage(driver);
		up.nameSearch("Neethumol P S");
		Thread.sleep(2000);
		Assert.assertTrue(up.nameValidation("Neethumol P S"));
		logger.info("Name search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void designationSearchValidation() throws IOException, InterruptedException
	{		
		UsersPage up = new UsersPage(driver);
		up.DesignationSearch("Quality Analyst");
		Thread.sleep(2000);
		Assert.assertTrue(up.designationValidation("Quality Analyst"));
		logger.info("Designation search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void departmentSearchValidation() throws IOException, InterruptedException
	{		
		UsersPage up = new UsersPage(driver);
		Thread.sleep(4000);
		up.DepartmentSearch("AF");
		Thread.sleep(2000);
		Assert.assertTrue(up.departmentValidation("AF"));
		logger.info("Department search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void delete() throws IOException, InterruptedException
	{		
		UsersPage up = new UsersPage(driver);
		up.nameSearch("Neethurg RG");
		up.delete("Neethurg RG");
		up.deleteAlert();
		driver.navigate().refresh();
	}
	
	

}
