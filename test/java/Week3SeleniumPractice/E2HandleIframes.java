package Week3SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2HandleIframes {
    public static void main(String[] args) {



        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe.php");
        // switch focus to the iframe
        driver.switchTo().frame(0);
        // send the topic in the box
        WebElement iFrame1 = driver.findElement(By.xpath("//input[@placeholder='Topic']"));
       iFrame1.sendKeys("hello");
        driver.switchTo().defaultContent();
        // switch the focus of driver to iframe 2 having dropdown
        driver.switchTo().frame("dropdownIframe");
        // find dropdown
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        // select the option
        sel.selectByVisibleText("Big Baby Cat");
        // switch to main page
        driver.switchTo().defaultContent();
        // switch the focus to the first iframe
        driver.switchTo().frame(0);
        // find the nested iframe as webElement
        WebElement nestedIframe = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        // switch the focus to the nested iframe
        driver.switchTo().frame(nestedIframe);
        // find the checkbox and click on it
        WebElement nestedIframe1 = driver.findElement(By.xpath("//input[@value='Option-1']"));
        nestedIframe1.click();
















    }
}
