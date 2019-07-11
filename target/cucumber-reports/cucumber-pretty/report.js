$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/AusPost/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "AustPost login feature",
  "description": "",
  "id": "austpost-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Austpost mypost login scenario",
  "description": "",
  "id": "austpost-login-feature;austpost-mypost-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user already on Personal page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on mypost link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in mypost home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on MyPost login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Mypost home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on logout button in mypost home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "austpost-login-feature;austpost-mypost-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "austpost-login-feature;austpost-mypost-login-scenario;;1"
    },
    {
      "cells": [
        "phmanuja@gmail.com",
        "Karunyam16#"
      ],
      "line": 14,
      "id": "austpost-login-feature;austpost-mypost-login-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Austpost mypost login scenario",
  "description": "",
  "id": "austpost-login-feature;austpost-mypost-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user already on Personal page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on mypost link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"phmanuja@gmail.com\" and \"Karunyam16#\" in mypost home page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on MyPost login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Mypost home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on logout button in mypost home page",
  "keyword": "Then "
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_already_on_Personal_page()"
});
formatter.result({
  "duration": 13660991619,
  "status": "passed"
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_click_on_mypost_link()"
});
formatter.result({
  "duration": 2002445654,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "phmanuja@gmail.com",
      "offset": 13
    },
    {
      "val": "Karunyam16#",
      "offset": 38
    }
  ],
  "location": "AusPostLoginStepDefinition.user_enters_login_details(String,String)"
});
formatter.result({
  "duration": 1259110759,
  "status": "passed"
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_click_on_MyPost_login_button()"
});
formatter.result({
  "duration": 377333868,
  "status": "passed"
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_is_on_Mypost_home_page()"
});
formatter.result({
  "duration": 84196,
  "status": "passed"
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_click_on_MyPost_logout_button()"
});
formatter.result({
  "duration": 9392883880,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Austpost mypostbusiness login scenario",
  "description": "",
  "id": "austpost-login-feature;austpost-mypostbusiness-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "user already on Personal page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user click on mypostbusiness link",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in mypostbusiness home page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user click on MyPostBusiness login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user is on MypostBusiness home page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user click on logout button in mypostbusiness home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "austpost-login-feature;austpost-mypostbusiness-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 26,
      "id": "austpost-login-feature;austpost-mypostbusiness-login-scenario;;1"
    },
    {
      "cells": [
        "phmanuja@gmail.com",
        "Karunyam16#"
      ],
      "line": 27,
      "id": "austpost-login-feature;austpost-mypostbusiness-login-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "Austpost mypostbusiness login scenario",
  "description": "",
  "id": "austpost-login-feature;austpost-mypostbusiness-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "user already on Personal page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user click on mypostbusiness link",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enters \"phmanuja@gmail.com\" and \"Karunyam16#\" in mypostbusiness home page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user click on MyPostBusiness login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user is on MypostBusiness home page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user click on logout button in mypostbusiness home page",
  "keyword": "Then "
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_already_on_Personal_page()"
});
formatter.result({
  "duration": 11809927341,
  "status": "passed"
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_click_on_mypostbusiness_link()"
});
formatter.result({
  "duration": 3115895216,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "phmanuja@gmail.com",
      "offset": 13
    },
    {
      "val": "Karunyam16#",
      "offset": 38
    }
  ],
  "location": "AusPostLoginStepDefinition.user_enters_mypostbusiness_login_details(String,String)"
});
formatter.result({
  "duration": 1002473529,
  "status": "passed"
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_click_mypostbusiness_login_button()"
});
formatter.result({
  "duration": 307634718,
  "status": "passed"
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_is_on_MyPostBusiness_home_page()"
});
formatter.result({
  "duration": 70542,
  "status": "passed"
});
formatter.match({
  "location": "AusPostLoginStepDefinition.user_click_on_mypostbusiness_logout_button()"
});
formatter.result({
  "duration": 11689891752,
  "status": "passed"
});
});