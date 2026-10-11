@scrolling @regression @smoke
Feature: Webdriver University Scrolling page

   Scenario: Validate scrolling to the last zone makes it visible
     Given I access the webdriver university scrolling page
     And the last zone should initially be outside the viewport
     When I scroll to the last zone
     Then the last zone should be visible in the viewport
