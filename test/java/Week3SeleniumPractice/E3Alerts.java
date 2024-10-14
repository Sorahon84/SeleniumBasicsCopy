package Week3SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        WebElement Hobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        Hobbies.sendKeys("Boxing");

        WebElement clickHereButton = driver.findElement(By.xpath("//*[@id='display_text']"));
        clickHereButton.click();

        // 02 Validate the message "Button clicked:" is displayed on the screen
        WebElement buttonClickedMessage = driver.findElement(By.xpath("//p[normalize-space()='Button Clicked']"));
        if (buttonClickedMessage.isDisplayed()) {
            System.out.println("Button clicked message is displayed.");
        } else {
            System.out.println("Button clicked message is not displayed.");
        }
// 04. Use contains() method in XPath to locate a specific text element and print it to the console
        WebElement specificText = driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor sit amet consectetur adipisicing')]"));
        System.out.println("Found text: " + specificText.getText());


        //WebElement button=driver.findElement(By.xpath("//input[@id='display_text']"));
//button.click();
        //System.out.println("Button clicked");
        //System.out.println(driver.getPageSource());
        Thread.sleep(4000);

        WebElement favoriteMovies=driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        favoriteMovies.sendKeys("Forest Gump");
        WebElement paragraph=driver.findElement(By.xpath(" //label[contains(text(),'Lorem ')]"));
        String textOfString=paragraph.getText();
        System.out.println(textOfString);

        WebElement yourCity=driver.findElement(By.xpath("//input[@id='yourCity']"));
        yourCity.sendKeys("Tarpon Springs");////input[@id="yourCity"]

        WebElement pEmail=driver.findElement(By.xpath("(//input[@id='private_email_id'])[1]"));
        pEmail.sendKeys("dkucfccs@gmail.com");

        WebElement oEmail=driver.findElement(By.xpath(" (//input[@name='OfficeEmail'])[1]"));
        oEmail.sendKeys("dkucfssc@gmail.com");

        WebElement proEmail=driver.findElement(By.xpath("(//input[@id='professional_email_id'])[1]"));
        proEmail.sendKeys("pro@gmail.com");

        WebElement clientName=driver.findElement(By.xpath("//input[@data-detail='one' and @class='form-control']"));
        clientName.sendKeys("JoeSmith");

        WebElement clientId=driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId']"));
        clientId.sendKeys("JohnSmith123");

        WebElement streetNumber=driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNumber.sendKeys(" Bowery");

        WebElement houseNumber=driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumber.sendKeys("241");


















    }
}
