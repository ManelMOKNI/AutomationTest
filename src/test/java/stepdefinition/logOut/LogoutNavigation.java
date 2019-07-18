package stepdefinition.logOut;

import cucumber.api.java.en.*;
import Pages.NavigationBar.NavigationMenuPageObject;
public class LogoutNavigation
{
    @When("^the user clicks on Logout  navigateMenutool SubMenu$")
    public void the_user_clicks_on_Logout_navigateMenutool_SubMenu() throws Throwable {
        NavigationMenuPageObject navigationMenuPageObject= new NavigationMenuPageObject();
        navigationMenuPageObject.clickOnLodOutButton();
    }

    @Then("^The user redirected to LogInPage$")
    public void the_user_redirected_to_LogInPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }
}
