package com.nopcommerce.demo.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/register.feature",
        glue = "com/nopcommerce/demo/cucumber",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class RegisterTestRunner {

}
