Feature: AustPost login feature

Scenario Outline: Austpost mypost login scenario

Given user already on Personal page
When user click on mypost link
Then user enters "<username>" and "<password>" in mypost home page
Then user click on MyPost login button
Then user is on Mypost home page
Then user click on logout button in mypost home page

Examples:
| username | password |
| phmanuja@gmail.com | Karunyam16# |

Scenario Outline: Austpost mypostbusiness login scenario

Given user already on Personal page
When user click on mypostbusiness link
Then user enters "<username>" and "<password>" in mypostbusiness home page
Then user click on MyPostBusiness login button
Then user is on MypostBusiness home page
Then user click on logout button in mypostbusiness home page

Examples:
| username | password |
| phmanuja@gmail.com | Karunyam16# |
