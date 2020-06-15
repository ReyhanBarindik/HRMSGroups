package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewQualificationsPageElements {

	
	@FindBy (id= "addLanguage")
	public WebElement addLanguage;
	
	@FindBy (id= "language_code")
	public WebElement language;
	
	@FindBy (id= "language_lang_type")
	public WebElement fluency;
	
	@FindBy (id= "language_competency")
	public WebElement competency;
	
	@FindBy (id= "language_comments")
	public WebElement comments;
	
	@FindBy (id= "btnLanguageSave")
	public WebElement saveLanguageBtn;
	
	@FindBy (xpath= "//td[@class='comments']")
	public List<WebElement> verifyComments;
	
	@FindBy (xpath= "//table[@id='lang_data_table']//a")
	public List<WebElement> listOfAddedLanguage;
	
	public ViewQualificationsPageElements () {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
