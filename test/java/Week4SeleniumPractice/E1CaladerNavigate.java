package Week4SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E1CaladerNavigate {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");
        //click on the calendar
        driver.findElement(By.xpath("//input[@id='start_date']")).click();

        //get the month
        WebElement month = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
        String currentMonth = month.getText();
        //finding the next button
        WebElement nextButton = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
        boolean notMonth = true;
        while (notMonth) {
            if (currentMonth.equals("November 2024")) {
                //selection of the date
                List<WebElement> dates=driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for(WebElement date:dates){
                    String currentDate=date.getText();
                    if(currentDate.equals("6")){
                        date.click();
                        break;
                    }
                }
                notMonth = false;
            }
            //click on the next button
            else {
                nextButton.click();
                currentMonth=month.getText();

            }
        }
    }
}
