package stepdefinition.Settings;

import Pages.NavigationBar.NavigationMenuPageObject;
import cucumber.api.java.en.*;

public class SettingsNavigation {
    @When("^the user clicks on Settings  navigateMenutool SubMenu$")
    public void the_user_clicks_on_Settings_navigateMenutool_SubMenu() throws Throwable {
        NavigationMenuPageObject navigationMenuPageObject= new NavigationMenuPageObject();
        navigationMenuPageObject.clickOnSettingButton();
    }

    @Then("^The user redirected to settings List view \"([^\"]*)\"$")
    public void the_user_redirected_to_settings_List_view(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

}
