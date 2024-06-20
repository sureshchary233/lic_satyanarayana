Feature: we are checking ebay home page

  @P1
  Scenario: advanced link
    Given i am navigated to home page
    When i click on advanced link
    And i navigated advanced page

  @P3
  Scenario: searching for iphone 11
    Given i am navigated to home page
    When search for i phone11
    Then validating the item count

  @P4
  Scenario: searching for i phone12
    Given i am navigated to home page
    When i search for 'iphone12'
    Then i validate atleast 1000 search count

  @P5
  Scenario: i search on item in category
    Given i am navigated to home page
    When i search for 'soap' in 'Baby' category
