package Week2SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E8DropDownMultiSelect {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // go to facebook.com
        driver.get("https://www.syntaxprojects.com/basic-select-dropdown-demo.php");
        // find dropdown
        // make sure that you're writing down the xpath to find the select tag
        WebElement selectListDemo = driver.findElement(By.xpath("//select[@id='multi-select']"));
        //c check if the dropdown is multiselect
        Select sel = new Select(selectListDemo);
        boolean multiSel = sel.isMultiple();
        System.out.println("The drop down is multiselect " + multiSel);
        sel.selectByIndex(0);
        sel.selectByVisibleText("New Jersey");
        sel.selectByValue("Texas");
        // for observation
        Thread.sleep(2000);
        sel.deselectByIndex(0);


    }
}
