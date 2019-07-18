package CucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        format = {"pretty","json:target/CucumberResut/cucumberLogin.json"},//report json
        features ={"src/test/java/Features/"}
        ,glue={"stepdefinition","utility"}
        //,tags = {"@First","@Second"}
)
public class RunTest extends AbstractTestNGCucumberTests {

   /* private static String devicename ="";
    @Parameters({"ForDevice"})
    @BeforeClass
    public void  getDevice (String ForDevice ){
        devicename = ForDevice;
    }
    public static String getDevicename(){
        return  devicename;
    }*/
}
