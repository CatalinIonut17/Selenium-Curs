package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExempleName {

    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver.findElement(By.id("inputUsername")).sendKeys("catalin-ionut.dinescu@endava.com");
        //webDriver.findElement(By.name("inputPassword")).sendKeys("asdfga");
        webDriver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("qaswdefrgthy");


        //webDriver.findElement(By.className("signInBtn")).click();
        webDriver.findElement(By.xpath("//button[contains(@class, 'signInBtn')]")).click();

        try {
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //System.out.println(webDriver.findElement(By.cssSelector("p.error")).getText());
        System.out.println(webDriver.findElement(By.cssSelector("p[class='error']")).getText());

        //tagname#id -> cand avem id-uri
        //tagname.clasname -> cand avem classname

        webDriver.findElement(By.linkText("Forgot your password?")).click();

        //xPath
        webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("asdadsddasdd");
        webDriver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("asdadsddasdd@gmail.com");
        //webDriver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("0786633122");
        webDriver.findElement(By.xpath("//form/input[3]")).sendKeys("0786633122");


    }
}
