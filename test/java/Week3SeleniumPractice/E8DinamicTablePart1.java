package Week3SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E8DinamicTablePart1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to this url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // login and click
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        // click on PIM option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        // get the column id
          List<WebElement> allId = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
          int count=1;
          for (WebElement id: allId){
               String idNo = id.getText();
               if(idNo.equals("109423A")){
                   System.out.println(count);
                   // find the checkbox and click
                  WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr["+count+"]/td[1]"));
                  checkBox.click();
               }
               count=count+1;
          }






























    }
}
