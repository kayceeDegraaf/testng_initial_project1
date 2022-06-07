package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CarsHomePage;
import pages.CarsSignInPage;
import utilities.Driver;

public class Base {

    WebDriver driver;
    CarsHomePage carsHomePage;
    CarsSignInPage carsSignInPage;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        carsHomePage = new CarsHomePage(driver);
        carsSignInPage = new CarsSignInPage(driver);
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
