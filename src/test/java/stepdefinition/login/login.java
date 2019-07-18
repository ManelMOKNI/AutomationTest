package stepdefinition.login;

import Pages.LoginPageObject;
import Pages.Map;
import Pages.NavigationBar.NavigationMenuPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;

public class login {
    @Given("^the user load sign in page$")
    public void the_user_load_sign_in_page() throws Throwable {
        LoginPageObject loginPage = new LoginPageObject();
        boolean logoexist = loginPage.signInButtonIsEenable();
        Assert.assertTrue(logoexist);

    }

    @Given("^the user set username \"([^\"]*)\"$")
    public void the_user_set_username(String username) throws Throwable {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.setUserNameInput(username);
        String usernameLog = loginPage.getUserNameInput();
        Assert.assertEquals(usernameLog,username);
    }

    @Given("^the user set password inpyt \"([^\"]*)\"$")
    public void the_user_set_password_inpyt(String password) throws Throwable {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.setPasswordInput(password);
    }

    @When("^the user click in sign in button$")
    public void the_user_click_in_sign_in_button() throws Throwable {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.clickOnSignInButton();
    }

    @Then("^the user will \"([^\"]*)\"$")
    public void the_user_will_get(String result) throws Throwable {

        LoginPageObject loginPage = new LoginPageObject();

        if (result.contains("alert")){
            String alert = loginPage.getAlertTxt();
            org.junit.Assert.assertThat(result,containsString(alert));
        }else{
            Map map = new Map();
           // System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
            //System.out.println( "   resukt button"+map.navigateUpIsDisplayed());
            //System.out.println(map.GetText());
            //System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
        }
    }

}
