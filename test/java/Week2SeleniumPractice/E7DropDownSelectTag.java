package Week2SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E7DropDownSelectTag {
    public static void main(String[] args) throws InterruptedException {


        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // go to facebook.com
        driver.get("https://www.syntaxprojects.com/basic-select-dropdown-demo.php");
        // find dropdown
        // make sure that you're writing down the xpath to find the select tag
        WebElement selectListDemo = driver.findElement(By.xpath("//select[@id='select-demo']"));


        // as the dropdown has select tag, so we can use select class from selenium
        // declare the instance of the select class
        Select sel = new Select(selectListDemo);
        // select the option Monday
        sel.selectByIndex(2);


        // for observation
        Thread.sleep(2000);
        //select another option Wednesday
        sel.selectByValue("Wednesday");


        // for observation
        Thread.sleep(2000);
        // select by visible text Friday
        sel.selectByVisibleText("Friday");


        // get all the options in the dropdown and print them on the console
        List<WebElement> allOption = sel.getOptions();
        for(WebElement option : allOption){
            System.out.println(option.getText());
        }




        //driver.quit();






























    }
}
