Feature: Searching for jobs using XPath

  @SmokeTest
  Scenario: Searching for jobs and applying to them using XPath
    Given Open browser with Alchemy Jobs site and navigate to Jobs page
    When Find the Keywords search input field
    Then Type in keywords to search for jobs and change the Job type
    And Find the filter using XPath and filter job type to show only “Full Time” jobs.
    And Find a job listing using XPath and it to see job details.
    And Find and Click on the “Apply for job” button.
    And Close the browser2
