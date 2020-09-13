Feature: Login Functionality

Background: user is successfully logged in
When user open the "chrome" and exe "E:\\Cucumber.Flipkart\\Flipkart\\src\\test\\resources\\DRIVER\\chromedriver.exe"
When user enter the url "https://www.flipkart.com/"

Scenario: Login functionality for Invalid username and password
When user enters "9890719775" as username
When user enters "indra@1234" as password
When user click on Login button
Then user show your "username and password is incorect"