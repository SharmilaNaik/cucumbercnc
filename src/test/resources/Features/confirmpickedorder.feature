Feature: This feature inculdes test of ConfirmPickedOrder tab when logged in as a manager

#Scenario1



#Scenario: To verify if user click on Picking tab  ConfirmPickedOrder tab page should be display

#Given user login as manager
#When user click on Picking tab
#Then ConfirmPickedOrder tab should be display

Scenario: To Verify if user click on picking tab then he should be able to click on From date and todate
Given user login as manager
When user click on Picking tab
Then user click on ConfirmPickedOrder tab
Then click on from date tab
Then select date from table

