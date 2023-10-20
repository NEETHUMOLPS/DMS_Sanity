package com.DMS.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.DMS.pageObjects.DocumentTemplate;

import Base.BaseClassTest;

public class TC_008_DocumentTemplate extends BaseClassTest {

	@Test(priority=1)
	public void createDocumenttemplate() throws IOException, InterruptedException
	{
		DocumentTemplate dt = new DocumentTemplate(driver);
		dt.clickOnDocumentTemplate();
		dt.createDocumentTemplate("Acceptance Table", "C1", "C2","SOP","New Project");
		dt.documentTemplateCreationAlert();
		dt.clickOnDocumentTemplate();
	}
	
	@Test(priority=2)
	public void documentView() throws IOException, InterruptedException
	{
		DocumentTemplate dt = new DocumentTemplate(driver);
		dt.view("New Project");
		dt.clickOnDocumentTemplate();
	}
	
	@Test(priority=3)
	public void documentDelete() throws IOException, InterruptedException
	{
		DocumentTemplate dt = new DocumentTemplate(driver);
		dt.delete("New Project");
		dt.deletetionAlert();
	}


}
