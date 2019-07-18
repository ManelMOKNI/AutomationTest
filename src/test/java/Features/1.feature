 Feature: [STORY on JIRA]  Log in feature
      Scenario Outline: the user can load sign in page in phone
        Given the user load sign in page
        And the user set username "<username>"
        And the user set password inpyt "<password>"
        When the user click in sign in button
        Then the user will "<result>"
    Examples: :
    | username | password   | result                                                 |
    |ons       |123         | alert Invalid Username or Password , please try again      |
    |chaker    |Nomd@12345  | redirected to Map Screen                                    |

