Feature: Get test for bankproducts by id
  Background:
    * url baseUrl

  Scenario: Get existent bank product
    Given path 'bankproducts/1'
    And header Accept = 'application/json'
    When method GET
    Then status 200
    And match response == {"id":1,"title":"My product"}

  Scenario: Get non-existent bank product
    Given path 'bankproducts/2'
    And header Accept = 'application/json'
    When method GET
    Then status 404