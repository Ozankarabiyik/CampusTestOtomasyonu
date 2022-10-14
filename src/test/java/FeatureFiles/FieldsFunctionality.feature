Feature: Create fields Functionality


  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression
  Scenario:Add Fields
    Given Navigate to Fields Page
    When Create a Fields
    Then Success message should be displayed

  @Regression
  Scenario: Edit Fields
    Given Navigate to Fields Page
    When Edit Fields
    Then Success message should be displayed

  @Regression
  Scenario: Delete Fields
    Given Navigate to Fields Page
    When Delete Fields "EditUser4"
    Then Success message should be displayed