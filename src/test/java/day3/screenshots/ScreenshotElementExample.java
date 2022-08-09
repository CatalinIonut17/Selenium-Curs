package day3.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotElementExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver =new ChromeDriver();

        webDriver.get("https://www.google.ro/");

        webDriver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();

        Thread.sleep(5000l);

        WebElement searchBar = webDriver.findElement(By.className("SDkEP"));

        File src = searchBar.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src , new File("src/test/resources/searchbar.png"));

        WebElement googleImage = webDriver.findElement(By.cssSelector("img[alt='Google']"));

        File srcImg = googleImage.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(srcImg , new File("src/test/resources/googlelogo.png"));



    }
}
