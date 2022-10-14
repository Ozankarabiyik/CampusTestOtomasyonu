Feature: School Locations Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly


  @Regression
  Scenario: School locations create, edit and delete exam
    Given Navigate to School Locations
      | setupOne    |
      | schoolSetup |
      | locations   |
    And Click on the element in the Dialog
      | addButton |

    When User sending the keys in New Locations
      | nameInput | Kamil |
      | shortName | kal   |
      | capacity  | 100   |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click edit button
      | editButton |

    And Edit locations
      | nameInput | Sevket |
      | shortName | Sev    |
      | capacity  | 100    |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Delete Locations
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed

