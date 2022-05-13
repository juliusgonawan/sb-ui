Feature: User can see stockbit login page working properly

  Scenario: User get error when input wrong username / password
    Given Open stockbit login url
    And Input username "lalala@gmail.com" and password "lalala"
    And Click login
    Then User still on page login

  Scenario: User can see password when click eye button
    Given Open stockbit login url
    And Input username "lalala@gmail.com" and password "lalala"
    And Click eye button
    Then Show password unmasking "lalala"

  Scenario: User can go to forget password page
    Given Open stockbit login url
    And Click forget password
    Then Go to forget password url "https://stockbit.com/#/forgot-password"