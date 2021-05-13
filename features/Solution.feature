#Author: Rajesh Yarlagadda
Feature: Verify values and total balance functionality

  Scenario Outline: Verify count of given amounts
    Given user navigated to mockpage
    When amounts are present in mockpage 
    Then count of values should be "<count>"
	Examples: 
      | count |
      | 5     |
  Scenario: Verify amounts are greater than zero
    Given user navigated to mockpage
    When amounts are present in mockpage
    Then amounts should be greater than zero

  Scenario: Verify amounts are displayed as currencies
    Given user navigated to mockpage
    When amounts are present in mockpage
    Then amounts should be displayed as currencies "$"
    
  Scenario: Verify the total balance matches the sum of the values
    Given user navigated to mockpage
    When amounts are present in mockpage
    Then total balance must be equal to sum of the amounts
