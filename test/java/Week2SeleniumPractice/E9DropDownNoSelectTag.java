package Week2SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E9DropDownNoSelectTag {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");
        // click on the dropdown to display the option
        WebElement selectListDemo = driver.findElement(By.xpath("//div[@data-toggle=\"dropdown\"]"));
       selectListDemo.click();
        List<WebElement> option = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for(WebElement options : option ){
            String optionText = options.getText();
            if(optionText.equals("Peru")){
                options.click();
            }
        }


























    }
}
