Feature: Leaftaps Login functionality

Scenario Outline: TC001_Login to application - Positive

Given Enter username as Demosalesmanager
And Enter the password as crmsfa
When Click on Login button
When Click on Crmsfa
When Click Leads link
When Click Find leads
When Enter first name
When  Click Find leads button
When Click on first resulting lead
Then Verify title of the page
When Click Edit
Given Change the company name
When Click Update
Then Confirm the changed name appears
			 			
				
			
