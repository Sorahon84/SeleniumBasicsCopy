package Week4SeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class E4ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // cast the driver to take screenshot
        TakesScreenshot ss= (TakesScreenshot) driver;
        // take screenshot
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
        // save the ss to a place in ur project
        FileUtils.copyFile(screenshot,new File("screenshot/image.png"));











    }
}
