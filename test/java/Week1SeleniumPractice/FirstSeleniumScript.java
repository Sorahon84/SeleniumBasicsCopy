package Week1SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
    public static void main(String[] args) {
        // create an object of the webdriver interface
        WebDriver driver = new ChromeDriver();


        //navigate the browser to syntax project website
        driver.get("https://syntaxprojects.com/");


        //get the current url and print it on the console
        String url = driver.getCurrentUrl();
        System.out.println("the current url is: " + url);


        // close the browser
       // driver.quit();
    }
}
