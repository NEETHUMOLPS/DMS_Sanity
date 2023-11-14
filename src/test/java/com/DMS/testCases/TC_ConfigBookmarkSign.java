package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ConfigBookmarkSign;

import Base.BaseClassTest;

public class TC_ConfigBookmarkSign extends BaseClassTest {

	@Test(priority=1)
	public void createDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.clickOnConfigBookmark();
		cb.createDocumentType("Policy Document");
		cb.docTypeCreationAlert();
		Thread.sleep(2000);	
	}
	
	@Test(priority=2)
	public void documentTypeSearchValidation() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.docTypeSearch("Policy Document");
		Assert.assertTrue(cb.docTypeSearchValidation("Policy Document"));
		Thread.sleep(2000);	
	}
	
	@Test(priority=3)
	public void editDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.editDocType1("Policy Document");
		cb.editDocType2("Policy Document New");
		cb.editDocumentTyepALert();
		Thread.sleep(2000);	
	}
	
	@Test(priority=4)
	public void addBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.addBookmark1("Policy Document New");
		cb.addBookmark2("QA");
		cb.bookmarkCreationALert();
		Thread.sleep(2000);	
	}
	
	@Test(priority=5)
	public void editBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		//cb.editBookmark1("QA");
		cb.editRole();
		cb.editBookmark2("Quality_Analyst");
		cb.bookmarkUpdationALert();
		Thread.sleep(2000);	
	}
	
	@Test(priority=6)
	public void deleteBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		//cb.deleteBookmark1("Quality Analyst");
		cb.deleteRole();
		cb.bookmarkDeletionALert();
		cb.closeBookmarkWndow();
		Thread.sleep(2000);	
	}
	
	@Test(priority=7)
	public void deleteDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.deletDocumentType("Policy Document New");
		cb.deleteDocumentTyepALert();
		Thread.sleep(2000);	
	}
	

}
