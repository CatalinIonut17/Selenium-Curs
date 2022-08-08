package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownExemple {
    public static void main(String[] args) {
         WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropDown = webDriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropDown);
        dropdown.selectByValue("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());




    }
}
