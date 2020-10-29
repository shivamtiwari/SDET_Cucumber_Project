$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProjectTC1.feature");
formatter.feature({
  "line": 2,
  "name": "Create a new user",
  "description": "",
  "id": "create-a-new-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@activity1_1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Visit the sites backend and create a new user",
  "description": "",
  "id": "create-a-new-user;visit-the-sites-backend-and-create-a-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Admin Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on User and navigate Add New",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill in the necessary details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click the Add New User button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify that the user was created",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefActions.user_is_on_Admin_Home_Page()"
});
formatter.result({
  "duration": 20576283500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions.click_on_User_and_navigate_Add_New()"
});
formatter.result({
  "duration": 3251443600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions.fill_in_the_necessary_details()"
});
formatter.result({
  "duration": 2031094000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions.click_the_Add_New_User_button()"
});
formatter.result({
  "duration": 3593959500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions.verify_that_the_user_was_created()"
});
formatter.result({
  "duration": 2262684400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions.close_the_browser()"
});
formatter.result({
  "duration": 550897300,
  "status": "passed"
});
formatter.uri("ProjectTC2.feature");
formatter.feature({
  "line": 2,
  "name": "Searching for jobs using XPath",
  "description": "",
  "id": "searching-for-jobs-using-xpath",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@activity1_1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Searching for jobs and applying to them using XPath",
  "description": "",
  "id": "searching-for-jobs-using-xpath;searching-for-jobs-and-applying-to-them-using-xpath",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open browser with Alchemy Jobs site and navigate to Jobs page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Find the Keywords search input field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Type in keywords to search for jobs and change the Job type",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Find the filter using XPath and filter job type to show only “Full Time” jobs.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Find a job listing using XPath and it to see job details.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Find and Click on the “Apply for job” button.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Close the browser2",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefActions2.user_is_on_Admin_Home_Page()"
});
formatter.result({
  "duration": 9121341800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions2.find_the_Keywords_search_input_field()"
});
formatter.result({
  "duration": 1329743200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions2.type_in_keywords_to_search_for_jobs_and_change_the_Job_type()"
});
formatter.result({
  "duration": 676433900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions2.find_the_filter_using_XPath_and_filter_job_type_to_show_only_Full_Time_jobs()"
});
formatter.result({
  "duration": 1058596600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions2.find_a_job_listing_using_XPath_and_it_to_see_job_details()"
});
formatter.result({
  "duration": 1997925600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions2.find_and_Click_on_the_Apply_for_job_button()"
});
formatter.result({
  "duration": 555973800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions2.close_browser()"
});
formatter.result({
  "duration": 498124700,
  "status": "passed"
});
formatter.uri("ProjectTC3.feature");
formatter.feature({
  "line": 2,
  "name": "Posting a job using parameterization",
  "description": "",
  "id": "posting-a-job-using-parameterization",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@activity1_1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Post a job using details passed from the Feature file",
  "description": "",
  "id": "posting-a-job-using-parameterization;post-a-job-using-details-passed-from-the-feature-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open browser with Alchemy Jobs site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Go to Post a Job page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Read job information from the Feature file table and fill in the details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click submit.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Go to the Jobs page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Confirm job listing is shown on page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Close the browser1",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefActions3.open_browser_with_Alchemy_Jobs_site()"
});
formatter.result({
  "duration": 8716627100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions3.go_to_Post_a_Job_page()"
});
formatter.result({
  "duration": 3448143100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions3.read_job_information_from_the_Feature_file_table_and_fill_in_the_details()"
});
formatter.result({
  "duration": 3809452400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions3.click_submit()"
});
formatter.result({
  "duration": 1485546500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions3.go_to_the_Jobs_page()"
});
formatter.result({
  "duration": 935570200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions3.confirm_job_listing_is_shown_on_page()"
});
formatter.result({
  "duration": 85513162200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefActions3.browserClose()"
});
formatter.result({
  "duration": 504875200,
  "status": "passed"
});
});