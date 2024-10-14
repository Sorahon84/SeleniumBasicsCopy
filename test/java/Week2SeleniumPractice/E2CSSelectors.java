package Week2SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2CSSelectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        WebElement profileId = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileId.sendKeys("sora102");

        WebElement profile = driver.findElement(By.cssSelector("#profileBox"));
        profile.sendKeys(" John Doe");

        WebElement feedBack = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedBack.sendKeys("Great feedback from Jenny.");

        WebElement feedbackFromRaj = driver.findElement(By.cssSelector("input[class='form-control feedbackBox2']"));
        feedbackFromRaj.sendKeys("Great feedback from Ray!");
//
        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
       email.sendKeys("sora1234@gmail.com");

       WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys(" Selectors");

        WebElement introCSS = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introCSS.sendKeys("john12doe@example.com");

        WebElement conclusionCss = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusionCss.sendKeys("10191817");











    }
}
