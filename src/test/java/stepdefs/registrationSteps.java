package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class registrationSteps {

    WebDriver driver;

    @When("^I click on register button$")
    public void iClickOnRegisterButton() {
        System.setProperty("webdriver.gecko.driver", "C:\\BlueskycitadelP\\Firefox1\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://propertyrete.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='black bw0 f6-ns f7 fw3 bg-white-90 br1 pv2-5-ns pv2-5 ph3 ttu tracked outline-0 bw0 link']")).click();
    }

    @And("^I complete the\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" field$")
    public void iCompleteTheField(String firstName, String lastName, String email, String Mobile, String Password, String ConfirmPaswd) throws Throwable {
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstName);

        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastName);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);

        driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
        driver.findElement(By.xpath("//section[contains(@class,'nav-header-sec w-100 flex flex-column')]//section[contains(@class,'')]//li[2]//span[1]")).click();
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(Mobile);

        driver.findElement(By.cssSelector("#password")).sendKeys(Password);

        driver.findElement(By.cssSelector("#confirm_password")).sendKeys(ConfirmPaswd);

    }

    @And("^I check the checkbox$")
    public void iCheckTheCheckbox() {
        WebElement captcha = driver.findElement(By.xpath("//label[contains(text(),'Captcha')]"));
        Assert.assertTrue(captcha.isDisplayed());
        Assert.assertTrue(captcha.getText().contains("Captcha"));

    }

    @And("^click on create account$")
    public void clickOnCreateAccount() {
        driver.findElement(By.xpath("//input[@id='btn_register']")).click();
    }

    @Then("^I am prompted on activate account$")
    public void iAmPromptedOnActivateAccount() {
      Assert.assertEquals(driver.findElement(By.xpath("//input[@id='btn_activate_code']")).getText(),"Activation Code(Sent via SMS and email)*");
    }

    @And("^the message \"([^\"]*)\"$")
    public void theMessage(String message) throws Throwable {
        driver.findElement(By.xpath("//label[@class='form__label form__label--2']")).getText();
    }

}
