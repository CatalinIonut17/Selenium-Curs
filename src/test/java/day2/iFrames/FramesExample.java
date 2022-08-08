package day2.iFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://jqueryui.com/droppable/");

        System.out.println(webDriver.findElements(By.tagName("iframe")).size());  //cauta cate eelemente de iframe avem.

        webDriver.switchTo().frame(webDriver.findElement(By.className("demo-frame")));
        //webDriver.switchTo().frame(0);
        webDriver.findElement(By.id("draggable")).click();

        Actions a = new Actions(webDriver);

        WebElement draggable = webDriver.findElement(By.id("draggable"));
        WebElement droppable = webDriver.findElement(By.id("droppable"));

        a.dragAndDrop(draggable, droppable).build().perform();

        Thread.sleep(3000l);

        //System.out.println(webDriver.findElements(By.tagName("iframe")).size());  //cauta cate eelemente de iframe avem.

        webDriver.switchTo().defaultContent(); // schimbi la default din iframe
        System.out.println(webDriver.findElement(By.className("entry-title")).getText());


    }
}
