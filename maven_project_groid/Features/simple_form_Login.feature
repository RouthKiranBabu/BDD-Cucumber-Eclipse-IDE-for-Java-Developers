Feature: Simple Form

Scenario: Single User providing Valid Credentials
  Given Launch the Chrome Browser
  And Opens URL "https://v1.training-support.net/selenium/simple-form"
  When Check valid URL
  And Check valid Title
  And Enter First Name as "Routh"
  And Enter Last Name as "Kiran Babu"
  And Enter	Email as "routhfamily123@gmail.com"
  And Enter Contact Number as "7077480329"
  And Enter Message as "Hello, World!"
  And Click button "submit"
  Then Alert Message Prints "Thank You for reaching out to us, Routh Kiran Babu"
  And Wait for "3 Seconds" then Clicks OK
  And Check First Name is Cleared
  And Wait for "3 Seconds" then Close the Chrome Browser

Scenario Outline: Multi Users providing Valid Credentials
  Given Launch the Chrome Browser
  And Opens URL "https://v1.training-support.net/selenium/simple-form"
  When Check valid URL
  And Check valid Title
  And Enter First Name as "<First_name>"
  And Enter Last Name as "<Last_name>"
  And Enter	Email as "<Email>"
  And Enter Contact Number as "<Contact_Number>"
  And Enter Message as "<Message>"
  And Click button "submit"
  Then Alert Message Prints "Thank You for reaching out to us, Routh Kiran Babu"
  And Wait for "3 Seconds" then Clicks OK
  And Check First Name is Cleared
  And Wait for "3 Seconds" then Close the Chrome Browser
  
  Examples:
  	| First_name | Last_name | Email | Contact_Number | Message |
  	|Routh|Kiran Babu|routhfamily123@gmail.com|7077480329|Hello, World!|
  	|newRouth|newKiran Babu|newrouthfamily123@gmail.com|8077480329|Hello!|
  	|1Routh|1Kiran Babu|1routhfamily123@gmail.com|1077480329|1Hello, World!|
  	
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
#  I want to use this template for my feature file
#
#  @tag1
#  Scenario: Title of your scenario
#    Given I want to write a step with precondition
#    And some other precondition
#    When I complete action
#    And some other action
#    And yet another action
#    Then I validate the outcomes
#    And check more outcomes

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
