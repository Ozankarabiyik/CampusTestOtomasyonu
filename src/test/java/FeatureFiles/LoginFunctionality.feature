Feature: Login Functionality

  @SmokeTest @RegressionTest
  Scenario: Login with valid username and password

    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly