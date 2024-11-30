Feature: Blog Post Creation

  Scenario: Successful creation of a new post
    Given I have the following post details:
      | title   | content          |
      | My Post | This is a test.  |
    When I submit the post
    Then I should see a confirmation message
