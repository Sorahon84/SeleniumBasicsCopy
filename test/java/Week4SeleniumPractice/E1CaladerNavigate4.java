package Week4SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E1CaladerNavigate4 {
    public static void main(String[] args) throws Exception, ParseException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

        Calendar calender= Calendar.getInstance();
        String targetDate= "05-Feb-2032";
        SimpleDateFormat targetFormat= new SimpleDateFormat("dd-MMM-yyyy");
        Date formattedTargetDate;

        targetFormat.setLenient(false);
        formattedTargetDate=targetFormat.parse(targetDate);
        calender.setTime(formattedTargetDate);

        int targetDay=calender.get(Calendar.DAY_OF_MONTH);
        int targetMonth=calender.get(Calendar.MONTH);
        int targetYear = calender.get(Calendar.YEAR);
        driver.findElement(By.id("second_date_picker")).click();
        String actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
        calender.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

        int actualMonth=calender.get(Calendar.MONTH);
        int actualYear = calender.get(Calendar.YEAR);
        while (targetMonth > actualMonth || targetYear > actualYear){
            driver.findElement(By.className("ui-datepicker-next")).click();
            actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
            calender.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

            actualMonth=calender.get(Calendar.MONTH);
             actualYear = calender.get(Calendar.YEAR);
        }
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();

    }
}
//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()=30]// th
