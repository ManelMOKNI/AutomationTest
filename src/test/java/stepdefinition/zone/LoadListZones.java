package stepdefinition.zone;

import Pages.LoginPageObject;
import Pages.Zones.ListZonePageObject;
import Pages.Zones.ZoneDetails;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;

public class LoadListZones {
    @When("^the user clicks on selected Zones to see the details$")
    public void the_user_clicks_on_selected_Zones_to_see_the_details() throws Throwable {
        ListZonePageObject listZonePageObject = new ListZonePageObject();
        listZonePageObject.buttonzoneDetails();

    }

    @Then("^The user redirected to details Zone in map view$")
    public void the_user_redirected_to_details_Zone_in_map_view() throws Throwable {
        ZoneDetails zoneDetails = new ZoneDetails();
        System.out.println("Zon name is "+zoneDetails.getzoneviewName());//zoneDetails.getzoneviewName();
      //  zoneDetails.clickOnNavigationButton();
    }


    @When("^the user clicks on the assets review button$")
    public void the_user_clicks_on_the_assets_review_button() throws Throwable {
     ZoneDetails zoneDetails = new ZoneDetails();
     zoneDetails.ButtonAssetsMap();
    }

    @Then("^The user has access to see all the assets in the  map view \"([^\"]*)\"$")
    public void the_user_has_access_to_see_all_the_assets_in_the_map_view(String arg1) throws Throwable {
        ZoneDetails zoneDetails = new ZoneDetails();
        /*  zoneDetails.verifyListAsetsAfterGetIt();*/
    }

    @Then("^The user can mask  all the assets in the  map view \"([^\"]*)\"$")
    public void the_user_can_mask_all_the_assets_in_the_map_view(String arg1) throws Throwable {
        ZoneDetails zoneDetails = new ZoneDetails();
        zoneDetails.ButtonAssetsMap();
        ListZonePageObject l = new ListZonePageObject();
        l.clickOnNavigationButton();
    }
    @Then("^The user can return list of assets$")
    public void the_user_can_return_list_of_assets() throws Throwable {
       ListZonePageObject l = new ListZonePageObject();
       l.returnSerch();
    }
    @Given("^the user has access to search button$")
    public void the_user_has_access_to_search_button() throws Throwable {
        // l.clickOnNavigationButton();
    }


    @Given("^the user clicks on search button$")
    public void the_user_clicks_on_search_button() throws Throwable {
        ListZonePageObject l = new ListZonePageObject();
        l.buttonzoneSearch();
    }

    @When("^the user set the text field \"([^\"]*)\"$")
    public void the_user_set_the_text_field(String arg1) throws Throwable {
        ListZonePageObject l = new ListZonePageObject();
        l.setZoneSearch(arg1);
        String usernameLog = l.getSearchFieldInput();
        System.out.println("le navigation zone "+usernameLog);
        Assert.assertEquals(usernameLog,arg1);
    }

    @Then("^the user : \"([^\"]*)\"$")
    public void the_user(String arg1) throws Throwable {
        ListZonePageObject l = new ListZonePageObject();

        if (arg1.contains("alert will not have any zone in the list")){
           /* String alert = l.getAlertTxt();
            org.junit.Assert.assertThat(arg1,containsString(alert));*/
            System.out.println(arg1);
            l.closeSearch();
            ListZonePageObject list = new ListZonePageObject();
            list.returnSerch();

        }else {

         if( l.getSearchFieldInput().equals("Muneerah")){
             System.out.println(arg1);
             l.closeSearch();
             ListZonePageObject list = new ListZonePageObject();
             list.returnSerch();
             l.clickOnNavigationButton();
         }


        }
    }


   /* @When("^the user clicks on search  button$")
    public void the_user_clicks_on_search_button() throws Throwable {
        ListZonePageObject listZonePageObject= new ListZonePageObject();
        System.out.println("You can "+listZonePageObject.getSearchTexeField());
    }

    @Then("^The user has access to textField search$")
    public void the_user_has_access_to_textField_search() throws Throwable {
        ListZonePageObject l = new ListZonePageObject();
       l.searchVerif();
        l.searchVerifVide();
        l.closeSearch();

    }*/
    /*@Then("^The user has access to textField search2$")
    public void the_user_has_access_to_textField_search2(String s ) throws Throwable {
        ListZonePageObject l = new ListZonePageObject();
        l.setZoneSearch(s);
        String usernameLog = l.getSearchFieldInput();
        Assert.assertEquals(usernameLog,s);
    }*/
    /*@Then("^the user will \"([^\"]*)\"$")
    public void the_user_will_get(String result) throws Throwable {

        ListZonePageObject l = new ListZonePageObject();

        if (result.contains("alert")){
            String alert = l.getAlertTxt();
            org.junit.Assert.assertThat(result,containsString(alert));
        }else{

            // System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
            //System.out.println( "   resukt button"+map.navigateUpIsDisplayed());
            //System.out.println(map.GetText());
            //System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
        }
    }*/




}
