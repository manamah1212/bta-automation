Feature: Selenide Test
  Scenario: Open Google Website
    Given I open the BTA website
    And Accept cookies
    And I click to the travel insurance
    And I change the country to India
    Then I Validate that the travel point was changed
    And I change the activity
    Then I validate that activity is Sports
    And I go to the second step
    And I check what is covered in Optimal+
    And I validate that the form is open
    And I close the form and go to the next step
    Then I validate that the traveler form is displayed and empty