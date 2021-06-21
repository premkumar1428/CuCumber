#Author: your.email@your.domain.com
Feature: Validating add customer flow


  Scenario: Add customer validation
    Given User launches telecom application
    And user click on add customer button
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated
    

 
    