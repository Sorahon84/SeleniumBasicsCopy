package Week1SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // go to facebook.com
        driver.get("https://fb.com");
// navigate to syntaxprojects website
        driver.navigate().to("https://syntaxprojects.com/");

        // go back to fb
        driver.navigate().back();
        // go to forward to syntax
        driver.navigate().forward();
        // slow down code just for the purpose of observation
        Thread.sleep(2000);
// refresh
        driver.navigate().refresh();
// closing the browser
        driver.close();


//"https://syntaxprojects.com/"


    }
}
