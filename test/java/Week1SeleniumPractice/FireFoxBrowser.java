package Week1SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        String url = driver.getCurrentUrl();
String title = driver.getTitle();
        System.out.println("the title of the webpage is " + title);

        System.out.println("the url of the webpage is " + url);
//driver.quit();









    }
}
