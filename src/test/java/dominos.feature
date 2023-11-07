Feature: To launch the domino's and order the items
Scenario: Login the webpage order the beverages and pizzas

  Given login the url
  When Click on Order Online
  And Click on location button and enter the location details
  And To select the Veg pizzas and choose the items
  And To select the Veg Paneer pizzas
  And To Select the bevarge and choose the pepasi 12Qty
  And Remove the two set of pizza
  Then Checkout the order and close the window
