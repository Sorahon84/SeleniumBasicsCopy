package Week4SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class E1CaladerNavigate3 {
    public static void main(String[] args) throws Exception, ParseException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

        Calendar calender= Calendar.getInstance();
        String targetDate= "30-Oct-2024";
        SimpleDateFormat targetFormat= new SimpleDateFormat("dd-MMM-yyyy");
        Date formattedTargetDate;

        targetFormat.setLenient(false);
        formattedTargetDate=targetFormat.parse(targetDate);
        calender.setTime(formattedTargetDate);

        int targetDay=calender.get(Calendar.DAY_OF_MONTH);
        int targetMonth=calender.get(Calendar.MONTH);
        int targetYear = calender.get(Calendar.YEAR);
        driver.findElement(By.id("second_date_picker")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();

    }
}
//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()=30]// this for this month
