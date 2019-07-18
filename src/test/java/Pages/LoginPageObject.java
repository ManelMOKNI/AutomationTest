package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Hook;

public class LoginPageObject {
    private AppiumDriver driver;
    private String pageTitle ;
    private String userNameInput;
    private String passwordInput;
    private String signInButton ;
   // private String invalidPopUp ;
    public LoginPageObject (){
        this.driver = Hook.getDriver();
        this.pageTitle= "com.machinestalk.fmsapplication:id/action_bar_root";
        this.userNameInput ="com.machinestalk.fmsapplication:id/view_login_user_name_edit_text";
        this.passwordInput = "com.machinestalk.fmsapplication:id/view_login_password_edit_text";
        this.signInButton = "com.machinestalk.fmsapplication:id/view_login_sign_in_button";
        //this.invalidPopUp = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]";
    }

    public boolean DisabledElement () {
        return driver.findElement(By.id(this.pageTitle)).isDisplayed();
    }

    public void setUserNameInput(String username){
        driver.findElement(By.id(this.userNameInput)).clear();
        driver.findElement(By.id(this.userNameInput)).sendKeys(username);
       // driver.navigate().back();
    }

    public boolean signInButtonIsEenable(){
       return driver.findElement(By.id(this.signInButton)).isEnabled();
    }
    public void setPasswordInput(String password){
        driver.findElement(By.id(this.passwordInput)).clear();
        driver.findElement(By.id(this.passwordInput)).sendKeys(password);
       // driver.navigate().back();
    }
    public String getUserNameInput(){
        return driver.findElement(By.id(this.userNameInput)).getText();
    }
    public void clickOnSignInButton (){
        driver.findElement(By.id(this.signInButton)).click();
    }

    public void login(String username,String password){
        this.setUserNameInput(username);
        this.setPasswordInput(password);
        this.clickOnSignInButton();
    }
    /*public boolean invalidPopUpDisable (){
        return  driver.findElement(By.xpath(this.invalidPopUp)).isDisplayed();
    }*/
    public String getAlertTxt() {

        //System.out.println(driver.findElementById("android:id/message").getText());
            WebElement toastView = driver.findElement(By.xpath("//android.widget.Toast[1]"));
            String text = toastView.getAttribute("name");
            return text ;

    }

}
