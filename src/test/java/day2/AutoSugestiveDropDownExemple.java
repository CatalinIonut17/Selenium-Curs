package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AutoSugestiveDropDownExemple {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        webDriver.findElement(By.id("autosuggest")).sendKeys("Ca");



        Thread.sleep(3000l);
        List<WebElement> options = webDriver.findElements(By.xpath("//li[@class='ui-menu-item']"));

        System.out.println(webDriver.findElements(By.xpath("//li[@class='ui-menu-item']")).size());

        for (int i = 0 ; i<options.size(); i++){
            System.out.println(options.get(i).getText());
            if(options.get(i).getText().equalsIgnoreCase("Canada")){
              options.get(i).click();
              break;
            }
        }
    }
}
