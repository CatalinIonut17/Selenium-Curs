package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExempleID{
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver.findElement(By.id("inputUsername")).sendKeys("catalin-ionut.dinescu@endava.com");

    }
}

