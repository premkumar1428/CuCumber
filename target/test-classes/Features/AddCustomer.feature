#Author: your.email@your.domain.com
Feature: Validating add customer flow

  Scenario: Add customer validation
    Given User launches telecom application
    And user click on add customer button
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add customer validation in oneDim list concept
    Given User launches telecom application
    And user click on add customer button
    When user need to fill up the fields in oneDim list
      | kumar | prem | premjan19@gmail.com | thiruvallur | 7389877888 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add customer validation in oneDim map concept
    Given User launches telecom application
    And user click on add customer button
    When user need to fill up the fields in oneDim map
      | fname    | kumar               |
      | lname    | prem                |
      | email    | premjan19@gmail.com |
      | Address  | thiruvallur         |
      | phone no |          7389877888 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add customer validation in twoDim list concept
    Given User launches telecom application
    And user click on add customer button
    When user need to fill up the fields in twoDim list
      | cucumber | prem | cucu@gmail.com     | thiruvallur | 7389877888 |
      | kumar    | prem | kumar@gmail.com    | chennai     | 8328328789 |
      | karthick | prem | karthick@gmail.com | kerala      |   87487787 |
      | java     | prem | java@gmail.com     | korattur    |  726372266 |
      | selenium | prem | selenium@gmail.com | madras      |  827738278 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add customer validation in twoDim map concept
    Given User launches telecom application
    And user click on add customer button
    When user need to fill up the fields in twoDim map
      | f name   | l name | mail               | address  | phone no   |
      | kumar    | prem   | kumar@gmail.com    | chennai  | 8328328789 |
      | karthick | prem   | karthick@gmail.com | kerala   |   87487787 |
      | java     | prem   | java@gmail.com     | korattur |  726372266 |
      | selenium | prem   | selenium@gmail.com | madras   |  827738278 |
    And user click on submit button
    Then user verify customer id is generated
