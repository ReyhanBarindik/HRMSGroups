package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods {

	@FindBy(id = "welcome")
	public WebElement welcome;

	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;

	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pim;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy (id ="menu_core_viewDefinedPredefinedReports")
    public WebElement report;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
    @FindBy (xpath="//div[@class='menu']/ul/li")
    public List<WebElement> dashMenu;
	
    
	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);

	}
	
	public void navigateToAddEmp () {
		jsClick(pim);
		jsClick(addEmp);
	}
    
	public void navigateToReports () {
		jsClick(pim);
		jsClick(report);
	}
	
	public void navigateToEmployeeListPage () {
		jsClick(pim);
		jsClick(empListPage);
		
	}
	
}
