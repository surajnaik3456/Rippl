@login @smoke
Feature: Verify shopify login functionality

  Background: 
    Given User is on homepage
    When User clicks on login link
    Then Login page is displayed

  @loginCheck
  Scenario Outline: User logs in with valid credentails
    When User enters valid <email> into email field
    And User clicks on Continue with email button
    And User enters the valid <password>
    And User clicks on the Log in button
    Then User should see the shopify dashboard

    Examples: 
      | email                        | password  |
      | abhik.khandelwal01@gmail.com | Rippl@321 |
