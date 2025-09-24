package stepdefinations;

import pages.HomePage;
import pages.ProductPage;
import pages.CheckoutPage;
//import stepdefinitions.LoginSteps;
import io.cucumber.java.en.*;

public class ProductSteps {
    HomePage homePage;
    ProductPage productPage;
    CheckoutPage checkoutPage;

    public ProductSteps(){
        homePage = new HomePage(LoginSteps.driver);
        productPage = new ProductPage(LoginSteps.driver);
        checkoutPage = new CheckoutPage(LoginSteps.driver);
    }

    @When("User searches for {string} and clicks search")
    public void user_searches_for_and_clicks_search(String productName) {
        homePage.searchProduct(productName);
    }

    @When("User adds product to cart and goes to shopping cart")
    public void user_adds_product_to_cart_and_goes_to_shopping_cart() {
        productPage.addToCart();
        productPage.goToShoppingCart();
    }

    @When("User clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        checkoutPage.proceedToCheckout();
    }

    @Then("User should reach checkout page")
    public void user_should_reach_checkout_page() {
        System.out.println("Checkout page URL: " + LoginSteps.driver.getCurrentUrl());
        LoginSteps.driver.quit();
    }
}