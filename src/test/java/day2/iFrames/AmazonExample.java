package day2.iFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonExample {

    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.amazon.com/");

        Actions a = new Actions(webDriver);

        webDriver.findElement(By.id("twotabsearchtextbox"));

        WebElement element = webDriver.findElement(By.id("nav-link-accountList"));

        a.moveToElement(element).build().perform();

        a.contextClick(element).build().perform();

        WebElement searchBox = webDriver.findElement(By.id("twotabsearchtextbox"));
        a.moveToElement(searchBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .doubleClick()
                .build()
                .perform();



    }


}
