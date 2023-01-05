Feature: Add sale using sales rep login

#Scenario1
Scenario: user should add sale using sales rep login to cart
Given user logs into the system as sales rep
When user clickon add sales Tab
Then customer details should be display
