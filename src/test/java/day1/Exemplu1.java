package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exemplu1 {

    public static void main(String[] args) {
        /*System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.endava.com/"); */

        /*System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe" );
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.endava.com/");*/

        /*System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe" );
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.endava.com/");*/

        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.endava.com/");


    }
}
