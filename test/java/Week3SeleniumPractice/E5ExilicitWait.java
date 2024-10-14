package Week3SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E5ExilicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        // click on the button to show the alert
        WebElement openAlert = driver.findElement(By.xpath("//button[@id='show_alert']"));
        openAlert.click();
        //wait until the alert appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        // handle alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement changeText1 = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeText1.click();
        // wait until the text is changed
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement changeText2 = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(changeText2.getText());

        WebElement displayButton = driver.findElement(By.xpath("//button[@id='display_button']"));
        displayButton.click();
        WebElement enableButton = driver.findElement(By.xpath("//button[normalize-space()='Enabled']"));
        wait.until(ExpectedConditions.visibilityOf(enableButton));
        enableButton.click();
        boolean enable = enableButton.isDisplayed();
        System.out.println("Enable Button is enable  " + enable);


        WebElement clickButton = driver.findElement(By.xpath("//button[@id='enable_button']"));
        clickButton.click();
        WebElement clickEnableButton = driver.findElement(By.xpath("//button[@id='enable_button']"));
        wait.until(ExpectedConditions.elementToBeClickable(clickEnableButton));
        clickEnableButton.click();
        boolean buttonClickble = clickButton.isEnabled();
        System.out.println("Button is display enable to click  " + buttonClickble);


        WebElement checkButton = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkButton.click();

        //wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        //WebElement cb = driver.findElement(By.xpath("//input[@id='checkbox']"));
        //System.out.println (cb.isSelected());

        WebElement checkBoxButton = driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxButton));
        checkBoxButton.click();
        boolean checkBox = checkBoxButton.isSelected();
        System.out.println(" Check box is checked " + checkBox);







    }
}

