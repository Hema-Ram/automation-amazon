import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStepdefs extends Hooks {

    Homepage homepage;

       @Given("^User is on Homepage$")
       public void userIsOnHomepage() throws  Throwable{
       homepage = new Homepage(driver);
    }


    @When("^User types a valid product in Search bar$")
    public void userTypesAValidProductInSearchBar() throws Throwable {
        homepage.search();

    }


    @And("^User clicks on Search icon$")
    public void userClicksOnSearchIcon() throws Throwable {
           homepage.search_icon();

    }

    @Then("^appropriate result page should be displayed$")
    public void appropriateResultPageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("kindle"));
    }


    @When("^User Clicks on Your account Sign-In$")
    public void userClicksOnYourAccountSignIn() throws Throwable {
        Thread.sleep(1000);

                homepage.login();

       }

    @And("^enters valid username and password$")
    public void entersValidUsernameAndPassword() throws Throwable {
    homepage.entersignindetails();
       }

    @And("^Clicks on sign in submit button$")
    public void clicksOnSignInSubmitButton() throws Throwable {

       }

    @Then("^User logins successfully$")
    public void userLoginsSuccessfully() throws Throwable {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Hello, Hema"));
    }

    }
