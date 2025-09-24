package stepdefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    public static WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @When("User clicks My Account and Login")
    public void user_clicks_my_account_and_login() {
        homePage.clickMyAccount();
        homePage.clickLogin();
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {
        loginPage.login("tvsvishu90355@gmail.com", "Testing");
        Thread.sleep(2000);
    }

    @Then("User should see homepage after login")
    public void user_should_see_homepage_after_login() {
        System.out.println("Homepage URL: " + driver.getCurrentUrl());
    }
}
