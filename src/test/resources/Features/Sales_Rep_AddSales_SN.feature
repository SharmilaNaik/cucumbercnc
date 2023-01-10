Feature: Add sale using sales rep login

#Scenario1
Scenario: user should add sale using sales rep login to cart
Given user logs into the system as sales rep
When user clickon add customer tab
Then user select customer jig
Then customer details should be display
Then click on view
Then click on orderId
Then click on printbtn