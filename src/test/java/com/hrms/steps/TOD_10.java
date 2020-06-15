package com.hrms.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TOD_10 extends CommonMethods {

	@When("user enters Admin username {string} and admin password {string}")
	public void user_enters_Admin_username_and_admin_password(String username, String password) {
	    sendText(login.username, username);
	    sendText(login.password, password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		waitAndClick(login.loginBtn);
	}

	@When("user navigated to employee list page")
	public void user_navigated_to_employee_list_page() {
		dashboard.navigateToEmployeeListPage();
	}

	@When("user search an employee {string}")
	public void user_search_an_employee(String employeeId) {
	    sendText(viewEmp.empID, employeeId);
	    jsClick(viewEmp.searchBtn);
	}

	@Given("user is navigeted to {string} employee page")
	public void user_is_navigeted_to_employee_page(String empIdNum) {
	    for (WebElement el : viewEmp.afterSearchEmpId) {
	    	 wait(2);
	    	 String text=el.getText();
	    	 if (text.equals(empIdNum)) {
	    		 waitAndClick(el);
	    		 break;
	    	 }
	    }
	}
	
	@Given("user click Qualifications")
	public void user_click_Qualifications() {
	   wait(3);
	   jsClick(pdetails.qualifications);
	}
    
	@When("user added a language")
	public void user_added_a_language(io.cucumber.datatable.DataTable dataTable) {
		jsClick(qualification.addLanguage);
	    List <Map<String, String>> language=dataTable.asMaps();
	    for (Map<String, String> map : language) {
	    	selectDdValue(qualification.language, map.get("Language"));
	    	selectDdValue(qualification.fluency, map.get("Fluency"));
	    	selectDdValue(qualification.competency, map.get("Competency"));
	    	sendText(qualification.comments, map.get("Comments"));
	    }
	    jsClick(qualification.saveLanguageBtn);
	    takeScreenShot("TOD_10");
	}


	@Then("user verify added Language {string}")
	public void user_verify_added_Language(String string) {
		for (WebElement el : qualification.listOfAddedLanguage) {
			String text= el.getText();
			if (text.equals(string)) {
				Assert.assertTrue(el.isDisplayed());
			}
			break;
		}
	}
	   
	@Given("user click Memberships")
	public void user_click_Memberships() {
		wait(2);
	    jsClick(pdetails.memberships);
	}

	@Given("user click add membership button")
	public void user_click_add_membership_button() {
		wait(2);
	    jsClick(membership.addMembershipBtn);
	}

	@When("user add a membership")
	public void user_add_a_membership(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> maps= dataTable.asMaps();
	    for (Map<String, String> map : maps) {
	    	selectDdValue(membership.membership, map.get("Membership"));
	    	selectDdValue(membership.subscriptionPaidBy, map.get("SubscriptionPaidBy"));
	    	wait(2);
	    	sendText(membership.subscriptionAmount,"500");
	    	wait(2);
	    	selectDdValue(membership.currency, map.get("Currency"));
	    	sendText(membership.commenceDate, map.get("Subscription Commence Date"));
	    	sendText(membership.renewalDate, map.get("Subscription Renewal Date"));
	    }
	    waitAndClick(membership.saveMembershipBtn);
	    takeScreenShot("TOD_12");
	}

	@Then("user verify added Membership {string}")
	public void user_verify_added_Membership(String string) {
		for (WebElement el : membership.verifyAddedMembership) {
			String text= el.getText();
			if (text.equals(string)) {
				Assert.assertTrue(el.isDisplayed());
			}
			break;
		}
	}


	
	
}
