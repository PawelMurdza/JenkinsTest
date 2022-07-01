Feature: testing site
  Background: Given user is navigated to app
    @Test2222
  Scenario: Submitting user information
      #Given user is navigated to app
      When user provides "TestingData" sheet and submits
      Then user successfully submitted data

@datatable @Test2222
      Scenario:Entering first and last name in DOM table
      #Given user is navigated to app
      When user sends Pawel and Testing
  |name |lastName|
  |Pawel|Testing|
        Then it is done
