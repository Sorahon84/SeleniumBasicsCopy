package Week3SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E6ImplicitWaitGlobalWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // click on the button to show text
        WebElement synchronizationWaits1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        synchronizationWaits1.click();
        WebElement textMsg= driver.findElement(By.xpath("//p[contains(text(),'Hello, this message appeared after you clicked the')]"));
        System.out.println(textMsg.getText());


        WebElement synchronizationWaits2 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        synchronizationWaits2.click();
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='Male']"));
        radioButton.click();


        WebElement synchronizationWaits3 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']"));
       synchronizationWaits3.click();
       WebElement optionButton = driver.findElement(By.xpath("//input[@value='Option-1']"));
       optionButton.click();















    }
}
