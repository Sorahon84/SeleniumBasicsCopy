package Week1SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFacebokLoginPage {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
//        goto facebook
        driver.get("https://www.facebook.com");
//        enter email address
        WebElement emailAddress = driver.findElement(By.id("email"));
//        send the text
        emailAddress.sendKeys("moazzamsadiq94@gmail.com");
//        enter the password
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("rutherfordking123@13456hopkings");
// click on create new account\
        WebElement createNewAccountBtn = driver.findElement(By.linkText("Create new account"));
        createNewAccountBtn.click();
        Thread.sleep(2000);
//        enter the name
        WebElement newName = driver.findElement(By.name("firstname"));
        newName.sendKeys("abracadabra");






















    }
}
