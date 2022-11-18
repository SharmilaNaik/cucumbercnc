#Author: Sandesh

Feature: This feature includes tests of Add Sale Page when logged in as a Sales Representative

#Scenario1
Scenario: To Verify if the Table name matches the information displayed

#Given: User opens D&D Snack foods QA Environment
Given User Logs in as a Sales Representative
Then User Searches for a Customer and clicks on the First Result
Given Clicks on the "view" option under Order History Column
Then Observe if Table displayed to User has name similar to Column name

