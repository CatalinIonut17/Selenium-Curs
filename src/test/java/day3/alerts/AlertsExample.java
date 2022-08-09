package day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver =new ChromeDriver();

        webDriver.get("https://demo.guru99.com/test/delete_customer.php");

        webDriver.switchTo().frame(webDriver.findElement(By.id("gdpr-consent-notice")));

        webDriver.findElement(By.id("save")).click();

        webDriver.switchTo().defaultContent();

        Thread.sleep(3000l);

        webDriver.findElement(By.xpath("//input[@name = 'cusid']")).sendKeys("123456");

        webDriver.findElement(By.name("submit")).click();

        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        alert.accept();

    }
}
