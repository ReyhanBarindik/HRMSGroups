package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;


public class AddEmployeePageElements extends CommonMethods {

	

	@FindBy(id = "firstName")
	public WebElement empFirstName;

	@FindBy (id= "middleName")
	public WebElement empMiddleName;
	
	@FindBy(id = "lastName")
	public WebElement empLastName;
	
	@FindBy (id="chkLogin")
	public WebElement createLoginDetails;
	
	@FindBy (id="user_name")
	public WebElement empUsername;
	
	@FindBy (id ="user_password")
	public WebElement empPassword;
	
	@FindBy (id ="re_password")
	public WebElement empRePassword;
	
	@FindBy (id="status")
	public WebElement status;
	
	@FindBy (xpath="//span[@for='firstName']")
	public WebElement requiredFirstName;
	
	@FindBy (xpath="//span[@for='lastName']")
	public WebElement requiredLastName;
	
	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id="photofile")
	public WebElement addPhoto;
	
	@FindBy(id = "btnSave")
	public WebElement saveEmp;
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement personalID;
	
	@FindBy (xpath="//div[@id='profile-pic']/h1")
	public WebElement addedEmployee;

	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

    public void addEmployeeInHMR (String empFirstN, String empLastN) {
    	sendText (empFirstName, empFirstN);
    	sendText (empLastName, empLastN);
    }
	
    public void createLoginDetails (String empUserName, String ePassword) {
    	
    	sendText (empUsername, empUserName);
    	sendText (empPassword, ePassword);
    	sendText (empRePassword, ePassword);
    	Select select = new Select (status);
    	select.selectByVisibleText("Enabled");
    }
	
	
	
	
}
