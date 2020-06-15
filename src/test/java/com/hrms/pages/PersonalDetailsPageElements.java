package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {

	@FindBy (id="personal_txtEmployeeId")
	public WebElement EId;

	@FindBy (xpath="//input[@value='Edit']")
	public WebElement edit;
	
	@FindBy(xpath= "//input[@id='personal_txtLicenNo']")
	public WebElement driverLicenceNum;
	
	@FindBy(id="personal_txtLicExpDate")
	public WebElement licenceExp;
	
	@FindBy (id="personal_txtNICNo")
	public WebElement SSN;
	
	@FindBy (id="personal_txtSINNo")
	public WebElement SIN;

	@FindBy(id="personal_cmbNation")
	public WebElement nationalityDD;
	
	@FindBy (id="personal[optGender]")
	public List<WebElement> genderRadioGroup;
	
	@FindBy (id="personal_optGender_2")
	public WebElement FemaleRB;
	
	@FindBy (id="personal_cmbMarital")
	public WebElement maritalStatus;
	
	@FindBy (id="personal_DOB")
	public WebElement dateOfBirth;
	
	@FindBy (id="personal_txtEmpNickName")
	public WebElement nickName;
	
	@FindBy (id="personal_chkSmokeFlag")
	public WebElement smoker;
	
	@FindBy (xpath="//input[@class='editable']")
	public List<WebElement> smokerBtn;
	
	@FindBy (id="personal_txtMilitarySer")
	public WebElement militaryService;
	
	@FindBy (id="btnSave")
	public WebElement saveButton;
	
	@FindBy (xpath="//ul[@id='sidenav']//a[contains(text(),'Qualifications')]")
	public WebElement qualifications;
	
	@FindBy (xpath="//ul[@id='sidenav']//a[contains(text(),'Memberships')]")
	public WebElement memberships;
	
	public PersonalDetailsPageElements () {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
}
