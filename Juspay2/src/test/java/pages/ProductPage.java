package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void addToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add to Cart']"))).click();
    }

    public void goToShoppingCart(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Shopping Cart']"))).click();
    }
}