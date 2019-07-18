package stepdefinition.PlaceMarket;

import Pages.NavigationBar.NavigationMenuPageObject;
import cucumber.api.java.en.*;

public class PlaceMarketsNavigation {
    @When("^the user clicks on place market navigateMenutool SubMenu$")
    public void the_user_clicks_on_place_market_navigateMenutool_SubMenu() throws Throwable {
        NavigationMenuPageObject navigationMenuPageObject = new NavigationMenuPageObject();
        System.out.println(navigationMenuPageObject.clickOnPlaceMarksButton());
    }

    @Then("^The user redirected to place market List view \"([^\"]*)\"$")
    public void the_user_redirected_to_place_market_List_view(String arg1) throws Throwable {

    }

}
