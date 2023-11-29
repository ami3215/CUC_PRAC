Feature: Testing Guru99 #Goal
Scenario: To test the login functionality and register page
Given I should be on the login page
And Enter the UserName 
And Enter the Password 
When Click on Submit button
Then I should see the title as "Login: Mercury Tours"
And I should click on register button
When I should see the page title as "Register: Mercury Tours"
And Enter the FirstName
And Enter the LastName
And Enter the PhoneNumber
And Enter the Email
And Enter the Address
And Enter the City
And Enter the State/Province
And Enter the PostalCode
And Select the Country
And Enter the UserName of RegisterPage
And Enter the Password of RegisterPage
And Enter the ConfirmPassword
When Click on Submit button for RegisterPage
Then I should see the title for successfully registered as "Register: Mercury Tours"
Given I should click on Sign-off button
When  Click on Sign-on button
Then I should see the page whose title as "Sign-on: Mercury Tours"