package stepdefinition.Notification;

import Pages.NavigationBar.NavigationMenuPageObject;
import cucumber.api.java.en.*;

public class NotificationNavigation {
    @When("^the user clicks on notification  navigateMenutool SubMenu$")
    public void the_user_clicks_on_notification_navigateMenutool_SubMenu() throws Throwable {
        NavigationMenuPageObject navigationMenuPageObject = new NavigationMenuPageObject();
        navigationMenuPageObject.clickOnNotificationButton();
    }

    @Then("^The user redirected to notification List view \"([^\"]*)\"$")
    public void the_user_redirected_to_notification_List_view(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
