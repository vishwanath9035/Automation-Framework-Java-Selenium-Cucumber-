package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickMyAccount(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']"))).click();
    }

    public void clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Login']"))).click();
    }

    public void searchProduct(String productName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search"))).sendKeys(productName);
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
    }
}