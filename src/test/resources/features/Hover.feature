@hover @regression @smoke
Feature: Webdriver University Actions page - Hover

   Scenario: Validate content revealed by hovering over the first button
     Given I access the webdriver university actions page
     When I hover over the first hover button
     Then I should see the revealed hover content "Link 1"
