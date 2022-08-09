package day3.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshootExample {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver =new ChromeDriver();

        webDriver.get("https://www.google.ro/");

        File src = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src , new File("src/test/resources/google.png"));


    }
}
