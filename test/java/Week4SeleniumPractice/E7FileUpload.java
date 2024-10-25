package Week4SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E7FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/upload-image.php");
       WebElement fileButton = driver.findElement(By.id("image-file"));
       fileButton.sendKeys("/Users/sora/IdeaProjects/SeleniumBasics/screenshot/image.png");










    }
}
