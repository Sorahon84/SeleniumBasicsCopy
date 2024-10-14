package Week2SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E6CheckBox {
    public static void main(String[] args) {

        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // go to facebook.com
        driver.get("https://www.syntaxprojects.com/basic-checkbox-demo.php");
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean stateOfcheckBox = checkBox1.isSelected();
       if(!stateOfcheckBox){
           checkBox1.click();
       }
List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
for(WebElement checkBox : checkBoxes){
    //if(checkBox.getAttribute("value").equals("Option-3")){ // if you want check all boxes you don't need if condition
        checkBox.click();
    }
}


















}
