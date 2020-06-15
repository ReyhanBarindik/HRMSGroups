#Author: reyhaneidiz92@gmail.com
@sprint1 @regression
Feature: Add a Language and a Memberships

  Background: 
    When user enters Admin username "Admin" and admin password "Hum@nhrm123"
    And user click on login button
    When user navigated to employee list page
    And user search an employee "12031"
    Given user is navigeted to "12031" employee page

  @sprint1
  Scenario: As an admin user should be able to
    add any available languages to any employee by specifying

    Given user click Qualifications
    When user added a language
      | Language | Fluency  | Competency | Comments                       |
      | Korean   | Speaking | Good       | I lived in Korea for two years |
    Then user verify added Language "Korean"

  @regression
  Scenario: As an admin user should be able to add memberships to any employee by specifying
    Given user click Memberships
    And user click add membership button
    When user add a membership
      | Membership        | SubscriptionPaidBy | Subscription Amount | Currency     | Subscription Commence Date | Subscription Renewal Date |
      | Quality Assurance | Company            |                 500 | Turkish Lira | 2020-Jun-20                | 2022-Jun-20               |
                   
    Then user verify added Membership "Quality Assurance"
    