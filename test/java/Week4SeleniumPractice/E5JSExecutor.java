package Week4SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E5JSExecutor {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the screen
        driver.manage().window().maximize();
        // navigate to syntax project
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        // button highlight
        WebElement button = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'",button);
        // scroll down
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        // scroll up
        js.executeScript("window.scrollBy(0,-1000)");
       WebElement fileUploadTab= driver.findElement(By.xpath("//a[text()='File Upload']"));
       // click operation But this time im using javascript
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",fileUploadTab);



















    }
}
