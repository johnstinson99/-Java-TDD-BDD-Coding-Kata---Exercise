Feature: Roman Numerals

  Scenario Outline: Functional Tests For Roman Numerals
    When I generate roman numeral for <inputNo>
    Then the result is <romanNumeral>

    Examples:
    |inputNo |romanNumeral |
    |1       |I            |
