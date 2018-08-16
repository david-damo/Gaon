Feature: Access ebay
  Use selenium java with cucumber-jvm and navigate to website
  @bvt
  Scenario: Print title, url
    When I open ebay website
    Then I validate title and URL
  @bvt
  Scenario: User will login
    When I check my link
    When I click My eBay
    Then I enter username and password
    Then I will uncheck Stay signed in
    Then I will click on Sign in button
