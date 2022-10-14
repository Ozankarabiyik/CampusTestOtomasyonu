Feature: Bank Accounts Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression @SmokeTest
  Scenario: Add a new Bank Account
    And Click on the element in the user
      | setupOne    |
      | parameters  |
      | bankAccount |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | okan                     |
      | iban            | TR6655556666222244448844 |
      | integrationCode | 181                      |


    And select currency type
      | currency    |
      | turkishlira |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  @Regression @SmokeTest
  Scenario:Edit Bank Account
    And Click on the element in the user
      | setupOne    |
      | parameters  |
      | bankAccount |

    And Search Area
      | okan |

    And Edit item Name in the user
      | nameInput | Levent                   |
      | iban      | TR8888444466662222444484 |
      | integrationCode   | 936                      |

    And Change Currency Type
      | currency |
      | euro     |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  @Regression @SmokeTest
  Scenario:Delete Bank Account
    And Click on the element in the user
      | setupOne    |
      | parameters  |
      | bankAccount |

    And Search to delete Account
      | Levent |

    Then Success message should be displayed
