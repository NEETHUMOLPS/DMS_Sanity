package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ConfigBookmarkSign;

import Base.BaseClassTest;

public class TC_006_ConfigBookmarkSign extends BaseClassTest {

	@Test(priority=1, description = "Create document type")
	public void createDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.clickOnConfigBookmark();
		cb.createDocumentType("Policy Document");
		cb.docTypeCreationAlert();
	}
	
	@Test(priority=2, description = "Edit document type")
	public void editDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.docTypeSearch("Policy Document");
		cb.editDocType1("Policy Document");
		cb.editDocType2("Policy Document New");
		cb.editDocumentTyepALert();
	}
	
	@Test(priority=3, description = "Add bookmark")
	public void addBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.addBookmark1("Policy Document New");
		cb.addBookmark2("QA");
		cb.bookmarkCreationALert();	
	}
	
	@Test(priority=4, description = "Edit book mark")
	public void editBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		//cb.editBookmark1("QA");
		cb.editRole();
		cb.editBookmark2("Quality_Analyst");
		cb.bookmarkUpdationALert();
	}
	
	@Test(priority=5, description = "Delete book mark")
	public void deleteBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		//cb.deleteBookmark1("Quality Analyst");
		cb.deleteRole();
		cb.bookmarkDeletionALert();
		cb.closeBookmarkWndow();	
	}
	
	@Test(priority=6, description = "Delete document type")
	public void deleteDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.deletDocumentType("Policy Document New");
		cb.deleteDocumentTyepALert();
	}
	

}
