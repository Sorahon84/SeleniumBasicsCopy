package Week2SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath.php");

        // Select using Attribute:
        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("SoraHon");

        // Select using Text:
        WebElement click = driver.findElement(By.xpath("//button[text()='Click Here']"));
        click.click();

        // Select using Contains Method:
        WebElement sequrity = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        sequrity.sendKeys("Where is your address");

        // Select using Text Contains:
        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'amet consectetur adipisicing elit')]"));
        String textString = text.getText();
        System.out.println(textString);

        // Select using Starts With:
        WebElement setting = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        setting.sendKeys(" Select using Starts With: hello");

        // Select using Indexing:
        WebElement email1 = driver.findElement(By.xpath("//div[6]//div[2]//div[1]//div[1]//form[1]//div[1]//input[1]"));
        email1.sendKeys(" Select using Indexing: hello i am email 1");

        WebElement email2 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
        email2.sendKeys(" Select using Indexing: hello i am email 2");

        WebElement email3 = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
        email3.sendKeys(" Select using Indexing: hello i am email 3");



        // Select using Multiple Attributes (& Operator):
        WebElement field1 = driver.findElement(By.xpath("(//input[@name='customField'])[1]"));
        field1.sendKeys("Select using Multiple Attributes (& Operator):  i am field 1");

        WebElement field2 = driver.findElement(By.xpath("(//input[@name='customField'])[2]"));
        field2.sendKeys(" Select using Multiple Attributes (& Operator): i am field 2");


        // Select using your choice of xpath:
        WebElement xpathField1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField1']"));
        xpathField1.sendKeys(" Select using your choice of xpath: hello i am field 1");

        WebElement xpathField2 = driver.findElement(By.xpath("(//input[@name='customField1'])[2]"));
        xpathField2.sendKeys(" Select using your choice of xpath: hello i am field 2");





    }
}
