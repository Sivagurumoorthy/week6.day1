Feature: Leaftaps Login functionality

Scenario Outline: TC001_Login to application - Positive

Given Enter username as Demosalesmanager
And Enter the password as crmsfa
When Click on Login button
Then Homepage should be displayed
When Click on Crmsfa
When Click CreateLead
Given Enter Company name
And Enter FirstName
And Enter LastName
And Enter Mailid
When Click submitlead button
Then View Lead should be displayed

