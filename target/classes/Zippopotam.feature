Feature: In this we will test Zippo API

  @Regression
  Scenario: User will hit US API and get response
    When User hit US postal code API and gets response
    Then User hit PAK API
    Then User hit Turkey API