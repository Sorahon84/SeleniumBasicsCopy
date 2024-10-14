package Week3SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1HandleAlert {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement alertClickButton = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertClickButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement alertClickSecond = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertClickSecond.click();
        Thread.sleep(2000);
        alert.dismiss();
        //driver.switchTo().alert().dismiss();
        WebElement alertClickThird = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertClickThird.click();
        Thread.sleep(2000);
        alert.sendKeys("abracadabra");
        alert.accept();





//button[@onclick='myPromptFunction()']
//button[@onclick='myConfirmFunction()']
//button[@onclick='myAlertFunction()']








    }
}
