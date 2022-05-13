Feature: User can see homepage stockbit working properly

  Scenario: User can see menu displayed
    Given Open stockbit homepage
    Then I can verify all menu bar showed

  Scenario: User can verify menu label
    Given Open stockbit homepage
    Then I can verify menu title value correctly

  Scenario: User can go to sign up page
    Given Open stockbit homepage
    And Go to sign up page
    Then Verify going to "https://stockbit.com/#/register" url

  Scenario: User can go to login page
    Given Open stockbit homepage
    And Go to login page
    Then Verify going to "https://stockbit.com/#/login" url


