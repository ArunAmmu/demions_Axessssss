package Stepdefinition_dominos;

import BaseClass_dominos.Dominos_base;
import PomClass_dominos.Beaverage;
import PomClass_dominos.Homepage;
import PomClass_dominos.Pizzapage;
import Runner_dominos.DominosRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Dominos_step extends Dominos_base {
    WebDriver driver = DominosRunner.driver;
    Homepage objhome = new Homepage();
    Pizzapage objpizza = new Pizzapage();
    Beaverage objbeverage = new Beaverage();


    @Given("login the url")
    public void login_the_url() {
        url(driver, "https://www.dominos.co.in/");
        max(driver);
    }

    @When("Click on Order Online")
    public void click_on_order_online() {
        driver.findElement(objhome.orderOnlineNow).click();
    }

    @When("Click on location button and enter the location details")
    public void click_on_location_button_and_enter_the_location_details() {
        driver.findElement(objhome.searchbtn).click();
        implicityWait(driver, 5);
        driver.findElement(objpizza.allowbtn).click();
        implicityWait(driver, 5);
        driver.findElement(objhome.localityEbtn).sendKeys("600086");
        implicityWait(driver, 5);
        driver.findElement(objhome.locationbtn).click();
        driver.findElement(objhome.suggession_location).click();

    }

    @When("To select the Veg pizzas and choose the items")
    public void to_select_the_veg_pizzas_and_choose_the_items() {
implicityWait(driver,5);
        javaScriptClick(driver, driver.findElement(objpizza.vegPizzas));
        implicityWait(driver, 5);
        javaScriptClick(driver, driver.findElement(objpizza.margherita));
        driver.findElement(objpizza.add).click();
        driver.findElement(objpizza.margheritaIncrease).click();

    }

    @When("To select the Veg Paneer pizzas")
    public void to_select_the_veg_paneer_pizzas() {

        javaScriptClick(driver, driver.findElement(objpizza.peppyPaneer));
        driver.findElement(objpizza.add).click();
        driver.findElement(objpizza.peppypaneerIncrease).click();

    }


    @When("To Select the bevarge and choose the pepasi 12Qty")
    public void to_select_the_bevarge_and_choose_the_pepasi_12qty() {

        driver.findElement(objbeverage.beverage).click();
        driver.findElement(objbeverage.pepsiadd).click();
        for (int i = 0; i < 11; i++) {
            driver.findElement(objbeverage.pepsiincrease).click();
        }
    }

    @When("Remove the two set of pizza")
    public void remove_the_two_set_of_pizza() throws IOException {

        javaScriptClick(driver,driver.findElement(objbeverage.marghertaDecrease));
        for (int j = 0; j < 6; j++) {
           javaScriptClick(driver,driver.findElement(objbeverage.pepsiDecrease));
        }

    }
    @Then("Checkout the order and close the window")
    public void checkout_the_order_and_close_the_window() throws IOException {



        driver.findElement(objbeverage.checkOut).click();
        screenshot(driver, "Checkoutpage");

        String sa = driver.findElement(objbeverage.subtotal).getText();
        Double number1 = Double.valueOf(sa);
        System.out.println(number1);

        String sb = driver.findElement(objbeverage.taxtotal).getText();
        Double number2 = Double.valueOf(sb);
        System.out.println(number2);

        double sum = number1 + number2;
        System.out.println(sum);


        String sc = driver.findElement(objbeverage.grandtotal).getText();
        Double number3 = Double.valueOf(sc);
        System.out.println(number3);

        assert sum == number3;

    }



}


//        btClick(objhome.getSearchbtn());
//        fastclick(driver, objpizza.getAllowbtn());

//        sendkey(objhome.getLocalityEbtn(), "600086");
//        fastclick(driver, objhome.getLocationbtn());
//        driver.findElement(objpizza.vegPizzas).click();
//        driver.findElement(objpizza.vegPizzas).click();

//        driver.findElement(objpizza.margherita).click();
//        javaScriptClick(driver,objpizza.margherita);

//        fastclick(driver, objpizza.getAllowbtn());
//        fastclick(driver, objpizza.getMargherita());
//        fastclick(driver, objpizza.getAdd());
//        fastclick(driver, objpizza.getMargheritaIncrease());

//        driver.findElement(objpizza.peppyPaneer).click();

//        fastclick(driver, objpizza.getPeppyPaneer());
//        fastclick(driver, objpizza.getAdd());
//        fastclick(driver, objpizza.getPeppypaneerIncrease());
//        fastclick(driver, objbeverage.getBeverage());
//        fastclick(driver, objbeverage.getPepsiadd());
//        fastclick(driver, objbeverage.getPepsiincrease());

//        fastclick(driver, objbeverage.getMarghertaDecrease());
//fastclick(driver,objbeverage.getPepsiDecrease());
//            fastclick(driver, objbeverage.getPepsiDecrease());
//        fastclick(driver, objbeverage.getCheckOut());