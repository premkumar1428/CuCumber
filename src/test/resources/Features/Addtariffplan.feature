#Author: your.email@your.domain.com
Feature: Validate add tariff button

  Scenario Outline: Add tariff validation
    Given User launch telecom application
    And User click on add tariff button
    When user need to fill up the plan details  "<MR>","<FLM>","<FIM>","<FSP>","<LPMC>","<IPMC>","<SPC>"
    And user clicked on submit button
    Then user verify congratulation message

    Examples: 
      | MR  | FLM | FIM | FSP | LPMC | IPMC | SPC |
      | 100 | 200 | 300 | 400 |    3 |    2 |   1 |
      | 100 | 200 | 400 | 400 |    3 |    2 |   1 |
      | 100 | 200 | 300 | 400 |    3 |    2 |   1 |
      | 100 | 200 | 300 | 400 |    3 |    2 |   1 |
