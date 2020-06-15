package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeeListPageElements  {

	@FindBy (id="empsearch_employee_name_empName")
	public WebElement empName;
	
	@FindBy (id="empsearch_id")
	public WebElement empID;
	
	@FindBy (id ="searchBtn")
	public WebElement searchBtn;
	
	@FindBy (xpath ="//table[@id ='resultTable']/tbody/tr/td/a")
	public List<WebElement> afterSearchEmpId;
	
	@FindBy (xpath="//a[text()='Reyhane']")
	public WebElement reyhane;
	
	
	@FindBy (xpath ="//div[@id='profile-pic']/h1")
	public WebElement newEmp;
	
	
	@FindBy (xpath="//table[@id='resultTable']//td//a")
	public List<WebElement> emp;
	
	
	
	
	public ViewEmployeeListPageElements(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
}
