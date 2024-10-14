package Week1SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsAmazonTagname {
    public static void main(String[] args) {
        //  Webdriver
        WebDriver driver= new ChromeDriver();
//  goto the url
        driver.get("https://www.amazon.com/");
//  maximize the screen
        driver.manage().window().maximize();

//        print all the links on the webpage
        driver.findElements(By.tagName("a"));
//to be continued
    }
}
