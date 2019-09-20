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

public class BlueskyformSteps {

        WebDriver driver;

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String arg0) throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:\\BlueskycitadelP\\Firefox1\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.blueskycitadel.com/test-form-for-bluesky-automation-training/");
        driver.manage().window().maximize();
    }

    @When("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String arg0) throws Throwable {
        driver.findElement(By.id("nf-field-26")).sendKeys("Rhema");
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String arg0) throws Throwable {
        driver.findElement(By.id("nf-field-27")).sendKeys("Mensi");
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) throws Throwable {
        driver.findElement(By.xpath("//input[@id='nf-field-28']")).sendKeys("gif@myautomation.33mail.com");
    }

    @And("^I enter confirm email \"([^\"]*)\"$")
    public void iEnterConfirmEmail(String arg0) throws Throwable {
        driver.findElement(By.xpath("//input[@id='nf-field-29']")).sendKeys("gif@myautomation.33mail.com");
    }

    @And("^I enter gender \"([^\"]*)\"$")
    public void iEnterGender(String arg0) throws Throwable {
        driver.findElement(By.cssSelector("#nf-field-30")).sendKeys("Female");
    }

    @And("^I select age (\\d+)-(\\d+)$")
    public void iSelectAge(int arg0, int arg1) {
        driver.findElement(By.xpath("//input[@id='nf-field-31-0']")).click();
    }

    @And("^I select single checkbox$")
    public void iSelectSingleCheckbox() {
        driver.findElement(By.cssSelector("#nf-field-39")).click();

    }

    @And("^I select two under checkbox list$")
    public void iSelectTwoUnderCheckboxList() {
       // #nf-field-40-1
        driver.findElement(By.cssSelector("#nf-field-40-1")).click();
    }

    @And("^I select three under multi-select$")
    public void iSelectThreeUnderMultiSelect() {
        driver.findElement(By.xpath("//select[@id='nf-field-41']//option[contains(text(),'Three')]")).click();
    }

    @And("^I click one under select$")
    public void iClickOneUnderSelect() {
        driver.findElement(By.xpath("//input[@id='nf-field-42-0']")).click();
    }

    @And("^I enter a message under single line text \"([^\"]*)\"$")
    public void iEnterAMessageUnderSingleLineText(String arg0) throws Throwable {
        //#nf-field-45
        driver.findElement(By.cssSelector("#nf-field-45")).sendKeys("I want to fill this form");
    }

    @And("^I enter a paragraph \"([^\"]*)\"$")
    public void iEnterAParagraph(String arg0) throws Throwable {
        driver.findElement(By.xpath("//textarea[@id='nf-field-44']")).sendKeys("Amazing job BlueskyCitadel is doing in the community");
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String arg0) throws Throwable {
        driver.findElement(By.cssSelector("#nf-field-46")).sendKeys("29 rhema road se10 4de");
    }

    @And("^I enter date \"([^\"]*)\"$")
    public void iEnterDate(String arg0) throws Throwable {
        ////input[@class='pikaday__display pikaday__display--pikaday ninja-forms-field nf-element datepicker']
        driver.findElement(By.xpath("//input[@class='pikaday__display pikaday__display--pikaday ninja-forms-field nf-element datepicker']")).sendKeys("09/25/2019");
    }

    @And("^I click submit$")
    public void iClickSubmit() {
        ////input[@id='nf-field-37']
        driver.findElement(By.xpath("//input[@id='nf-field-37']")).click();
    }

    @Then("^I am registered$")
    public void iAmRegistered() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'Your form has been successfully submitted.')]")).getText(),"Your form has been successfully submitted.");
    }
}
