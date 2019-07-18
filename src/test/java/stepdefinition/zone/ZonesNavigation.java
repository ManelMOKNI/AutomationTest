package stepdefinition.zone;

import Pages.NavigationBar.NavigationMenuPageObject;
import Pages.Zones.ListZonePageObject;
import Pages.Zones.ZoneDetails;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import javax.print.attribute.standard.MediaSize;

public class ZonesNavigation {
    @Given("^the user has access to Zones navigateMenu SubMenu$")
    public void the_user_has_access_to_Zones_navigateMenu_SubMenu() throws Throwable {
        NavigationMenuPageObject navigateMenuPageObject = new NavigationMenuPageObject();
        boolean exist = navigateMenuPageObject.userImageIsDisplay();
        Assert.assertTrue(exist);
    }

    @When("^the user clicks on Zones navigateMenutool SubMenu$")
    public void the_user_clicks_on_Zones_navigateMenu_SubMenu() throws Throwable {
        NavigationMenuPageObject navigationMenuPageObject = new NavigationMenuPageObject();
        System.out.println("Navigation "+navigationMenuPageObject.clickOnZonesButton());
    }

    @Then("^The user redirected to Zone List view \"([^\"]*)\"$")
    public void the_user_redirected_to_Zone_List_view(String arg1) throws Throwable {
        ListZonePageObject listZonePageObject = new ListZonePageObject();
       System.out.println("in in "+ listZonePageObject.getViewName());
       /*System.out.println("verif zone "+ listZonePageObject.verifyListAfterGetIt());*/
       // listZonePageObject.verifyListAfterGetIt();


    }

}
