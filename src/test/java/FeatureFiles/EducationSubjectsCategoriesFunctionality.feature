Feature: Education Subjects Categories Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly


  @Regression
  Scenario: Create,Edit and Delete a Subjects Categories
    And Navigate to Grade Levels
      | setupOne    |
      | parameters  |
      | gradeLevels |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content2
      | nameInput  | Ali      |
      | shortName  | Desidero |
      | orderInput | 1        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click edit grade level
      | editButton |

    And Edit Grade Level

      | nameInput    | Alican   |
      | shortName    | Desi |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Delete Locations
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed