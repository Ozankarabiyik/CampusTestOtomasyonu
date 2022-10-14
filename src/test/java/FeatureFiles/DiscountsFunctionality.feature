Feature: Discounts Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression @SmokeTest
  Scenario: Add Discounts Parameters Setup
    And Navigate to Discounts Page
      | setupOne   |
      | parameters |
      | discounts  |

    And Click on the element in the Dialog
      | addButton |

    And Create a Discounts
      | description  | EnginUser11 |
      | codeInput    | 171717      |
      | priorityCode | 10          |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  @Regression @SmokeTest
  Scenario: Edit Discount Parameters Setup
    And Navigate to Discounts Page
      | setupOne   |
      | parameters |
      | discounts  |

    And Edit and Delete Discounts
      | descriptionText | EnginUser11 |

    And Click on the element in the Dialog
      | searchButton |

    And Click edit button
      | editButton |

    And Edit and Delete Discounts
      | description  | EnginEditli |
      | priorityCode | 20          |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  @Regression @SmokeTest
  Scenario: Delete Discount Parameters Setup
    And Navigate to Discounts Page
      | setupOne   |
      | parameters |
      | discounts  |

    And Edit and Delete Discounts
      | descriptionText | EnginEditli |

    When Delete Fields "EnginEditli"

    Then Success message should be displayed












