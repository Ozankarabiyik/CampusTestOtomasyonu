Feature: Education Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression
  Scenario: Create a Subjects Categories
    And Click on the element in the Dialog1
      | education         |
      | setupThree        |
      | subjectCategories |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content1
      | nameInput | Omer22 |
      | codeInput | 1234   |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

  @Regression
  Scenario: Edit a Subjects Categories
    And Click on the element in the Dialog1
      | education         |
      | setupThree        |
      | subjectCategories |

    And search Area
      | Omer22 |

    And Edit item Name in the user
      | nameInput | Ali111 |
      | codeInput | 1111   |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  @Regression
  Scenario:Delete a Subjects Categories
    And Click on the element in the Dialog1
      | education         |
      | setupThree        |
      | subjectCategories |


    And Use Search to delete Account
      | Ali111 |

    Then Success message should be displayed