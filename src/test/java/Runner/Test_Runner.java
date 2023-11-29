package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Sign_on/sign-on.feature"},glue = {"definition"},plugin = {"html:report/myreport.html"})
public class Test_Runner extends AbstractTestNGCucumberTests {

}
