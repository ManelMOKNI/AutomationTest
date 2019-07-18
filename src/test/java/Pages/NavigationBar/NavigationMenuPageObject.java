package Pages.NavigationBar;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utility.Hook;

import java.util.List;

public class NavigationMenuPageObject {
    private AppiumDriver driver;
    private String image ;
    private String  name;
    private String map ;
    private String asset;
    private String zone;
    private String placeMarket ;
    private String notification ;
    private String settings ;
    private String logout ;
    private String navigateUp ;
    private String navigationButton;
     public NavigationMenuPageObject(){
         this.driver = Hook.getDriver();
         this.navigationButton = "Navigate up";
         this.image= "com.machinestalk.fmsapplication:id/view_header_main_profile_image_view";
         this.name= "com.machinestalk.fmsapplication:id/view_header_main_user_name_text_view";
         // this.map ="com.machinestalk.fmsapplication:id/map_slide_menu_item";
         this.map ="com.machinestalk.fmsapplication:id/map_slide_menu_item";
         this.asset ="com.machinestalk.fmsapplication:id/assets_slide_menu_item";
         //  this.asset ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout";
         this.zone ="com.machinestalk.fmsapplication:id/zones_slide_menu_item";
         this.placeMarket ="com.machinestalk.fmsapplication:id/places_slide_menu_item";
         this.notification ="com.machinestalk.fmsapplication:id/notification_slide_menu_item";
         this.settings ="com.machinestalk.fmsapplication:id/settings_slide_menu_item";
         this.logout ="com.machinestalk.fmsapplication:id/logout_slide_menu_item";
     }
   public boolean userImageIsDisplay() {
       try{
           // driver.findElement(By.id(this.logout)).click();
           driver.findElement(By.id(this.image)).isDisplayed();
         //  System.out.println("findElementBy"+ driver.findElement(By.id(this.image)));
           return true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
   }
   public void clickOnNavigationButton(){
       MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId(this.navigationButton);
       el1.click();
   }
    public Boolean clickOnAssetsButton (){
        try{
            MobileElement el2 = (MobileElement) driver.findElementById(this.asset);
            el2.click();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public Boolean clickOnZonesButton (){
        try{
            MobileElement el2 = (MobileElement) driver.findElementById(this.zone);
            el2.click();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public Boolean clickOnNotificationButton (){
        try{
            MobileElement el2 = (MobileElement) driver.findElementById(this.notification);
            el2.click();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }public Boolean clickOnSettingButton (){
        try{
            MobileElement el2 = (MobileElement) driver.findElementById(this.notification);
            el2.click();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }public Boolean clickOnPlaceMarksButton (){
        try{
            MobileElement el2 = (MobileElement) driver.findElementById(this.placeMarket);
            el2.click();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
     public Boolean clickOnLodOutButton (){
        try{
            MobileElement el2 = (MobileElement) driver.findElementById(this.logout);
            el2.click();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
