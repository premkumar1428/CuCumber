#Author: your.email@your.domain.com
Feature: Validate GetQuote flow
 
  Scenario: Add Car quote details
    Given User launches Rac application
    And user click get a quote
    And user click car quote option
    When user need to fillup the fields
    And user click the continue button
    And user need to fill the fields
    Then user click the get quote button
    And user verify quote is generated

 