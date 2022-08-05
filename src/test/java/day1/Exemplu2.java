package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exemplu2 {

    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        //mareste fereastra browserului
        webDriver.manage().window().maximize();

        //se deschide site endava
        webDriver.get("https://www.endava.com/");

        //se preia titlul
        System.out.println(webDriver.getTitle());

        //System.out.println(webDriver.getPageSource());

        //se deschide site-ul selenium, se da refresh si se preia titlu
        webDriver.get("https://www.selenium.dev/");
        //webDriver.navigate().to("https://www.selenium.dev/");
        webDriver.navigate().refresh();
        System.out.println(webDriver.getTitle());

        //se inchide doar fereastra curenta
        webDriver.close();

        //se inchid toate ferestrele
        //webDriver.quit();
    }

}
