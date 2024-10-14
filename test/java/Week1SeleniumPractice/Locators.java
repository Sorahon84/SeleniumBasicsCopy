package Week1SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
//declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the screen
        driver.manage().window().maximize();
        // navigate to syntax projects
        driver.get("https://syntaxprojects.com/input-form-locator.php");
//send the firstname to the text box
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("John");
// send the lastname
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Doe");
//send email
           WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("john@doe.com");
//press the button submit
        WebElement submitPress = driver.findElement(By.tagName("button"));
        submitPress.click();
WebElement link1 = driver.findElement(By.linkText("Click Here."));
link1.click();

// click on the second link
        WebElement link2 = driver.findElement(By.partialLinkText("ink"));
        link2.click();













    }
}
