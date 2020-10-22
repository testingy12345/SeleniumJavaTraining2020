#Author:Vipin
Feature: My Second Feature File
Background: Chrome Browser Launched
Given Launching the Instagram website
#=================================================================
Scenario: Launch Instagram Social Media Page
Given User Launches Chrome Browser
And Verify the title
When User Enters UserName
And User Enters Password
Then User Click Submit Button
#===========================================================