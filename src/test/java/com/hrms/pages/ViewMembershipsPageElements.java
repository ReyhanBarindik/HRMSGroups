package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewMembershipsPageElements {

	@FindBy(id = "btnAddMembershipDetail")
	public WebElement addMembershipBtn;

	@FindBy (id ="membership_membership")
	public WebElement membership;
	
	@FindBy (id ="membership_subscriptionPaidBy")
	public WebElement subscriptionPaidBy ;
	
	@FindBy (name ="membership[subscriptionAmount]")
	public WebElement subscriptionAmount;
	
	@FindBy (id ="membership_currency")
	public WebElement currency;
	
	@FindBy (id ="membership_subscriptionCommenceDate")
	public WebElement commenceDate;
	
	@FindBy (id ="membership_subscriptionRenewalDate")
	public WebElement renewalDate;
	
	@FindBy (id= "btnSaveMembership")
	public WebElement saveMembershipBtn;
	
	@FindBy (xpath= "//table[@class='table hover']//a")
	public List<WebElement> verifyAddedMembership;
	
	public ViewMembershipsPageElements() {

		PageFactory.initElements(BaseClass.driver, this);
	}

}
