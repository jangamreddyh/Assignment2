Feature: search samsung mobile and add product to cart

Scenario: search samsung product and add product to cart

Given the user is on Amazon home page
When the user enters product name "<ProductName>" in search field
And the user clicks on search button
And the user selects the product
And the user selects the quantity "<Quantity>"
And the user clicks on Add To Cart button
Then the product should be added in cart

Examples:
|ProductName|Quantity|
|Samsung|4|




