Feature: Register and login
  I want to use this template for my feature file

  @register_login
  Scenario: Register to system and login
 
    Given Get login page Url
    When Open Register page
    When Input to email textbox
    And Click to Submit
    Then Get user and password info
    When Back to login page
    And Submit valid info to login form
    And Click to login button
    Then Home page displayed

 

  