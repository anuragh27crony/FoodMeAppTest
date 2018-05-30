package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEventUtil {

    private int click_Timeout = 10;

    public void clickOn(By locator, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, click_Timeout);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));
        driver.findElement(locator).click();
    }

    public void clickOn(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, click_Timeout);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
        element.click();
    }

}
