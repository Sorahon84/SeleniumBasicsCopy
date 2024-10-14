package Week3SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class E4WindowHandlesAssignment {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/window-popup-modal-demo.php");

        // get window handle of the main page and print it out on the console
        String mainPageWH = driver.getWindowHandle();
        System.out.println("the window handle of the main page is " + mainPageWH);
        // click on the button facebook and instagram
        WebElement instagramPage = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        WebElement facebookPage = driver.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));
        // click them
        instagramPage.click();
        Thread.sleep(2000);
        facebookPage.click();
        // get all the window handle
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles){
            driver.switchTo().window(handle);
            String url=driver.getCurrentUrl();
            if(url.equals("https://www.facebook.com/syntaxtechs/")){
                // find text box send some keys
            WebElement inputBox1 = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
            inputBox1.sendKeys("Hello");
            break;
            }
        }

        System.out.println("the current focus of driver is on window " + driver.getCurrentUrl());
        driver.switchTo().window(mainPageWH);
        System.out.println("the current focus of driver is on window " + driver.getCurrentUrl());























    }
}
