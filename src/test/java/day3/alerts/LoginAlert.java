package day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class LoginAlert {

    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver webDriver=new ChromeDriver();

        String username = "admin";
        String password = "admin";

        webDriver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");


    }
}
