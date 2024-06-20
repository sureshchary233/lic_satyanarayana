Feature: click ebay logo

  @P10
  Scenario: clicking ebay logo
    Given i navigated to home page
    When i click on ebay log 
    When finally on ebay clicks
    Then iam sending keys

  @P11
  Scenario: clicking on advanced page
    Given i navigated to home page
    When i click on advanced link page
    Then i advanced search on items
      | keywords | exclude | min | max |
      | iphone12 | new     | 300 | 400 |

  @P12
  Scenario Outline: Home page links
    Given i navigated to home page
    When i click on '<link>'
    Then i valiodates that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link    | url                                                  | title      |
      | Fashion | https://www.ebay.com/b/Fashion/bn_7000259856         | Fashion    |
      | Sports  | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031 | Sporting   |
      | Deals   | https://www.ebay.com/globaldeals                     | Best deals |
