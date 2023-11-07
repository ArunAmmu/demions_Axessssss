package Runner_dominos;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\dominos.feature", glue = "", dryRun = false,
        plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"}, monochrome = true, publish = true)


public class DominosRunner {

    public static WebDriver driver;

    @BeforeClass

    public static void start() {

        driver = new ChromeDriver();
    }

    @AfterClass
    public static void close() {
       driver.close();
    }

}
