package day2.windowshandles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandleExmaple {

    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://rahulshettyacademy.com/loginpagePractise/");

        webDriver.findElement(By.className("blinkingText")).click();

        Set<String> windows = webDriver.getWindowHandles(); /// [parentId, childId, etc]

        Iterator<String> iterator =  windows.iterator();

        String parentId = iterator.next();
        String childId = iterator.next();

       webDriver.switchTo().window(childId).getTitle();

        String email = webDriver.findElement(By.xpath("//p[@class='im-para red']"))
                .getText()
                .split("at")[1].trim().split(" ")[0];

        System.out.println(email);

        webDriver.switchTo().window(parentId);

        webDriver.findElement(By.id("username")).sendKeys(email);


    }
}
