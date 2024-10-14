package Week3SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E7StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
//       print all the rows of table
        List<WebElement> tableAllElements = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for(WebElement row: tableAllElements){
            System.out.println(row.getText());
        }
//      print just the column no 3
        List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        for(WebElement data: columnData){
            System.out.println(data.getText());
        }
//       print the row in which the status is "in progress"
        List<WebElement> statuses = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count = 1;
        for(WebElement status : statuses){
            String statusValue = status.getText();
            if(statusValue.equals("in progress")){
                // print this particular row
                System.out.println(count);
                WebElement row =driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(row.getText());
            }
            count=count+1;
        }





















    }
}
