package Week2SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E5RadioButtons {
    public static void main(String[] args) throws InterruptedException {

        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // go to facebook.com
        driver.get("https://www.syntaxprojects.com/basic-radiobutton-demo.php");
       // find and select the radio button male if it is not selected
        WebElement maleRB = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
// check if radio button is selected
        boolean stateofRb = maleRB.isSelected();
        if(!stateofRb){
            maleRB.click();
        }
// male sure that the selection is done
    boolean selectionOfmaleRb = maleRB.isSelected();
        System.out.println("The male radio button is selected " + selectionOfmaleRb);


        List<WebElement>ageOpt=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement age:ageOpt){
            if(age.getAttribute("value").equals("15 - 50"));
            age.click();
            //Thread.sleep(2000);
        }



































    }
}
