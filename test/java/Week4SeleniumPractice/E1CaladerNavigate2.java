package Week4SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

public class E1CaladerNavigate2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to the webpage
            driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");

            // Select "From" Date
            selectDate(driver, "from_date", LocalDate.of(2024, 10, 6));

            // Select "To" Date
            selectDate(driver, "to_date", LocalDate.of(2024, 11, 15));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }

    // Method to select a date dynamically from the date picker
    public static void selectDate(WebDriver driver, String dateInputId, LocalDate targetDate) {
        // Open the date picker by clicking on the input field
        WebElement dateInput = driver.findElement(By.id(dateInputId));
        dateInput.click();

        // Extract the target month and year
        String targetMonth = targetDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int targetYear = targetDate.getYear();
        int targetDay = targetDate.getDayOfMonth();

        while (true) {
            // Get the current month and year displayed in the date picker
            String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
            String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

            // Check if the current month and year match the target month and year
            if (currentMonth.equals(targetMonth) && currentYear.equals(String.valueOf(targetYear))) {
                // Select the target day from the calendar
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
                for (WebElement day : days) {
                    if (day.getText().equals(String.valueOf(targetDay))) {
                        day.click();
                        return;
                    }
                }
            } else {
                // Navigate to the next month
                WebElement nextButton = driver.findElement(By.className("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
                nextButton.click();
            }
        }


    }
}
