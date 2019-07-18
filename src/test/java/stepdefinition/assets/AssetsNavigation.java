package stepdefinition.assets;

import Pages.Asset.Asset;
import Pages.NavigationBar.NavigationMenuPageObject;

import cucumber.api.java.en.*;
import org.testng.Assert;
import utility.Hook;


public class AssetsNavigation {
    @Given("^the user has access to side menu$")
    public void the_user_has_access_to_side_menu() throws Throwable {
        NavigationMenuPageObject navigateMenuPageObject =  new NavigationMenuPageObject();
        navigateMenuPageObject.clickOnNavigationButton();
       // System.out.println("assetButtonIsDisplayed"+navigateMenuPageObject.clickAssetsButtonIsDisplayed());
        boolean exist = navigateMenuPageObject.userImageIsDisplay();
       //System.out.println("exitttttttttttt"+exist);
       Assert.assertTrue(exist);
    }

    @When("^the user click on  assets button$")
    public void the_user_click_on_assets_button() throws Throwable {
        NavigationMenuPageObject navigationMenuPageObject = new NavigationMenuPageObject();
        System.out.println(navigationMenuPageObject.clickOnAssetsButton());
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the user redirected to  assets \"([^\"]*)\"$")
    public void the_user_redirected_to_assets(String arg1) throws Throwable {

        Asset asset = new Asset();
        System.out.println("2-"+asset.getViewName());
        System.out.println("*********ALLL*********");
        asset.testasset1();
        asset.testasset2();
        asset.clickAsset2();
        System.out.println("**********GREEN*********");
        asset.AssetGreen();
        asset.clickAsset3();
        System.out.println("********Yellow**********************");
        asset.AssetYellow();
        asset.clickAssetred();
        System.out.println("******************RED******************");
        asset.AssetRed();
        System.out.println("**********GRAY*************");
        asset.clickAssetGray();
        asset.AssetGray();

        System.out.println("********************BLACK***************");
        Hook hook= new Hook();
       // hook.ScrollWright();
        asset.getScroll();
        asset.clickAssetBlack();
        asset.testassetblack();
    }

    /*@Given("^the user has access to side menu$")
    public void the_user_has_access_to_side_menu() throws Throwable {
        NavigationMenuPageObject navigateMenuPageObject =  new NavigationMenuPageObject();
        boolean exist = navigateMenuPageObject.userImageIsDisplay();
        Assert.assertTrue(exist);
    }

    @When("^the user click on  assets button$")
    public void the_user_click_on_assets_button() throws Throwable {
        System.out.println("When");
    }

    @Then("^the user redirected to  assets \"([^\"]*)\"$")
    public void the_user_redirected_to_assets(String arg1) throws Throwable {
        System.out.println("then");
    }
*/
}


