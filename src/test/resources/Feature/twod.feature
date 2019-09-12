@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given open web page
    And click add customer
    When provide details.
      | ram  | kumar | ram@gmail.com  | trichy  | 898765678 |
      | prem | kumar | prem@gmail.com | chennai | 645678987 |
      | sam  | kumar | sam@gmail.com  | covai   | 345654456 |
      | ravi | kumar | ravi@gmail.com | madurai | 876567844 |
    And click submit
    Then verify id was genrate
