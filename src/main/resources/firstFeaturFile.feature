Feature: End to end testing for ToolsQA book Api
  Description: Tools QA website API has been listed and currently we are using this one.

  Background: User generates token from Authorization
    Given I am an authorized user

    @Regression @Smoke
    Scenario: Authorized user is able to add and remove books.
      Given A list of books are available
      When I add a book to my reading list
      Then The book is added
      When I remove a book from my reading list
      Then The books is removed from the list



