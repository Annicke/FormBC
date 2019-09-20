Feature: BlueskyCitadelForm
  As a user
  I want to fill the blueskycitadel form
  so that I can submit

  
  Scenario: Valid BlueskyCitadelForm
    Given I navigate to "http://www.blueskycitadel.com/test-form-for-bluesky-automation-training/"
   When I enter first name "Rhema"
    And I enter last name "Mensi"
    And I enter email "gif@myautomation.33mail.com"
    And I enter confirm email "gif@myautomation.33mail.com"
    And I enter gender "female"
    And I select age 18-30
    And I select single checkbox
    And I select two under checkbox list
    And I select three under multi-select
    And I click one under select
    And I enter a message under single line text "I want to fill this form"
    And I enter a paragraph "Amazing job BlueskyCitadel is doing in the community"
    And I enter address "29 rhema road se10 4de"
    And I enter date "09/25/2019"
    And I click submit
    Then I am registered