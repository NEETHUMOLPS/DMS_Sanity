package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.UsersPage;

import Base.BaseClassTest;

public class TC_005_Users extends BaseClassTest {

	@Test(priority=1, description = "Create user")
	public void usersPage() throws IOException, InterruptedException
	{
		UsersPage up = new UsersPage(driver);
		up.clickUsers();
		up.clickCreateUsers("Neethurg", "RG", "NeethuRG", "neethurg@yopmail.com");
		up.creationAlert();
	}
	
	@Test(priority=2, description = "Delete user")
	public void delete() throws IOException, InterruptedException
	{		
		UsersPage up = new UsersPage(driver);
		up.nameSearch("Neethurg RG");
		up.delete("Neethurg RG");
		up.deleteAlert();
	}
	
	

}
