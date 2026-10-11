@dropdown @regression @smoke
Feature: Webdriver University Dropdown page

   Scenario Outline: Validate selecting an option from a dropdown
     Given I access the webdriver university dropdown page
     When I select "<option>" from the dropdown "<dropdownId>"
     Then the dropdown "<dropdownId>" should have the value "<expectedValue>" selected

     Examples:
       | dropdownId      | option | expectedValue |
       | dropdowm-menu-1 | Python | python        |
       | dropdowm-menu-2 | TestNG | testng        |
