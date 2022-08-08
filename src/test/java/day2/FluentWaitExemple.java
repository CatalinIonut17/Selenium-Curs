package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExemple {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();

        WebElement helloText = getWebElement(driver);


        System.out.println(helloText.isDisplayed());
        System.out.println(helloText.getText());


    }

    private static WebElement getWebElement(WebDriver driver) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement helloText = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver1) {
                if (driver1.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
                    return driver1.findElement(By.xpath("//div[@id='finish']/h4"));
                } else {
                    return null;
                }
            }
        });
        return helloText;
    }
}
