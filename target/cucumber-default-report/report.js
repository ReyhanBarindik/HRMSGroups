$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TOD_10.feature");
formatter.feature({
  "name": "Add a Language and a Memberships",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters Admin username \"Admin\" and admin password \"Hum@nhrm123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_enters_Admin_username_and_admin_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to employee list page",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_navigated_to_employee_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search an employee \"12031\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_search_an_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigeted to \"12031\" employee page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_is_navigeted_to_employee_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As an admin user should be able to",
  "description": "    add any available languages to any employee by specifying",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sprint1"
    }
  ]
});
formatter.step({
  "name": "user click Qualifications",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_click_Qualifications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user added a language",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_added_a_language(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify added Language \"Korean\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_verify_added_Language(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "As an admin user should be able to");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters Admin username \"Admin\" and admin password \"Hum@nhrm123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_enters_Admin_username_and_admin_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to employee list page",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_navigated_to_employee_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search an employee \"12031\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_search_an_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigeted to \"12031\" employee page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_is_navigeted_to_employee_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As an admin user should be able to add memberships to any employee by specifying",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user click Memberships",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_click_Memberships()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click add membership button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_click_add_membership_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add a membership",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_add_a_membership(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify added Membership \"Quality Assurance\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.TOD_10.user_verify_added_Membership(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "As an admin user should be able to add memberships to any employee by specifying");
formatter.after({
  "status": "passed"
});
});