package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class loginSteps {

    WebDriver driver;

    @Given("^I navigate to the site \"([^\"]*)\"$")
    public void iNavigateToTheSite(String arg0) throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:\\BlueskycitadelP\\Firefox1\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://propertyrete.com");
        driver.manage().window().maximize();
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() {

        driver.findElement(By.xpath("//a[@class=\"white ml2 bw0 f6-ns f7 fw3 bg-sec br1 pv2-5-ns pv2-5 ph3 ttu tracked outline-0 bw0 link\"]")).click();
    }

    @And("^I enter my email address \"([^\"]*)\"$")
    public void iEnterMyEmailAddress(String arg0) throws Throwable {
        driver.findElement(By.id("user_email")).sendKeys("blessings4u10@gmail.com");
    }


    @And("^I enter my Password \"([^\"]*)\"$")
    public void iEnterMyPassword(String arg0) throws Throwable {
        driver.findElement(By.id("user_password")).sendKeys("12345hs");
    }

    @And("^I click on Sign In$")
    public void iClickOnSignIn() {
        driver.findElement(By.id("btn_signin")).click();
    }

    @Then("^I am signed In$")
    public void iAmSignedIn() {
        Assert.assertEquals(driver.findElement(By.xpath("//a[@class='black bw0 f6-ns f7 fw3 bg-white-90 br1 pv2-5-ns pv2-5 ph3 ttu tracked outline-0 bw0 link'] ")).getText(),"WELCOME: MENSI ANNE");
    }

    @And("^I enter an invalid email address \"([^\"]*)\"$")
    public void iEnterAnInvalidEmailAddress(String arg0) throws Throwable {
        driver.findElement(By.id("user_email")).sendKeys("blessings4u10mail.com");

    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String arg0) throws Throwable {
        driver.findElement(By.id("user_password")).sendKeys("12345hs");
    }

    @And("^I click sign In$")
    public void iClickSignIn() {
        driver.findElement(By.id("btn_signin")).click();
    }

    @And("^I enter valid email address \"([^\"]*)\"$")
    public void iEnterValidEmailAddress(String arg0) throws Throwable {
        driver.findElement(By.id("user_email")).sendKeys("blessings4u10@gmail.com");
    }

    @And("^I enter invalid Password \"([^\"]*)\"$")
    public void iEnterInvalidPassword(String arg0) throws Throwable {
        driver.findElement(By.id("user_password")).sendKeys("1122222222222222222222");
    }

    @And("^I click signin$")
    public void iClickSignin() {
        driver.findElement(By.id("btn_signin")).click();
    }


    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String arg0) throws Throwable {
        driver.findElement(By.id("user_email")).sendKeys("");
    }

    @And("^I enter no Password \"([^\"]*)\"$")
    public void iEnterNoPassword(String arg0) throws Throwable {
        driver.findElement(By.id("user_password")).sendKeys("");
    }

    @Then("^I am not signed In$")
    public void iAmNotSignedIn() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='btn_signin']")).isDisplayed() );
    }

}
