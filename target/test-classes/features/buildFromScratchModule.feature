@checkBuildFromScratchModule @Regression
Feature: Verify build from scratch Module

  Background: 
    Given User is on homepage
    When User clicks on login link
    Then Login page is displayed

  @buildFromScratch
  Scenario Outline: Verify build from scratch functionality
    When User enters valid <email> into email field
    And User clicks on Continue with email button
    And User enters the valid <password>
    And User clicks on the Log in button
    Then User should see the shopify dashboard
    And User selects the Store from the right corner as "Staging May 2 Test Store 1"
    Then Store is switched to "Staging May 2 Test Store 1" in dashboard
    And User clicks on "Rippl Rewards Staging" on the left panel
    And User Navigate to the Points from the sub-menu inside Rippl App
    Then Points page is displayed
    And User clicks on "Add Ways to Earn" link
    And User clicks on "Build From Scratch" module
    And User fills <name>,<shortDescription>,<actionDescription>,<startDate> and <endDate> the parameters
    And User sets <actionRepeatable>, <status>, <trackingType>,<imageTrackingType>,<filterByTags> and <iconType>
    And User uploads banner image
    And User enters <optionalMail>,<content>,<corelatedTask>,<points>,<gallonsOfWater>,<kgsOfPlastic> and <treesPlanted>
    And User clicks on publish button
    Then Verify all the details are updated accordingly

    Examples: 
      | email                        | password  | name                    | shortDescription                          | actionDescription                                                                                                                                                                                                                                                                                                                                                              | startDate  | endDate    | actionRepeatable | status | trackingType | imageTrackingType  | filterByTags | iconType | optionalMail                 | content | corelatedTask          | points | gallonsOfWater | kgsOfPlastic | treesPlanted |
      | abhik.khandelwal01@gmail.com | Rippl@321 | Fitness Bingo Challenge | Engage in a variety of fitness activities | Participants will receive a bingo card with various fitness-related activities in each square, such as jogging for 30 minutes, completing a yoga session, or doing 50 push-ups. They must complete these activities to mark off the corresponding squares on their card. The goal is to achieve a bingo pattern (horizontal, vertical, or diagonal) within the given timeframe | 20-05-2024 | 28-05-2024 | No               | Active | Image        | Live image capture | base_tier    | Default  | abhik.khandelwal01@gmail.com | test    | Drink a glass of water |      1 |              1 |            1 |            1 |
