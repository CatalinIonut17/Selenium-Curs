package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DinamicDropDownExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        webDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        webDriver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(1000);
        webDriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();


    }
}
