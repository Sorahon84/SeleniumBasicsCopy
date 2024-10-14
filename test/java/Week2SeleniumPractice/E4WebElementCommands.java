package Week2SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4WebElementCommands {
    public static void main(String[] args) {
        //declare the instance
        WebDriver driver = new ChromeDriver();


        // maximize the window
        driver.manage().window().maximize();


        // go to syntaxprojects.com
        driver.get("https://www.syntaxprojects.com/selenium_commands_selector.php");


        // clear text box send some keys
        WebElement textBox = driver.findElement(By.xpath("//input[@id='textInput']"));
        textBox.clear();
        textBox.sendKeys("Hello Students !!");


        // find the radio button and check of it is selected or not
        WebElement selectRadio1 = driver.findElement(By.xpath("//input[@value='option1']"));
        boolean firstButton1 = selectRadio1.isSelected();
        System.out.println("The state of radio button selection in " + firstButton1); // false
        //// find the radio button and check of it is clicked and selected
        selectRadio1.click();
        firstButton1 = selectRadio1.isSelected();
        System.out.println("The state of radio button selection in " + firstButton1); // true

        // check if radio button is displayed
        WebElement selectRadio2 = driver.findElement(By.xpath("//input[@value='option2']"));
        boolean firstButton2 = selectRadio2.isEnabled();
        System.out.println("The state of radio button2 is enable " + firstButton2); // false


        // check weather the  radio button 3 is displayed or not
        WebElement selectRadio3 = driver.findElement(By.xpath("//input[@value='option3']"));
        boolean displayFirstButton3 = selectRadio3.isDisplayed();
        if (displayFirstButton3) {
            System.out.println("Radio button 3 is displayed");
        } else {
            System.out.println("Radio 3 button is not displayed");
        }

        // click on the toggle visiblity button to display the radio button 3
        WebElement radioButtonVisiblityToggle = driver.findElement(By.xpath("//button[text()='Toggle Visibility of Option 3']"));
        radioButtonVisiblityToggle.click();
        displayFirstButton3 = selectRadio3.isDisplayed();
        System.out.println("The radio button 3 is displayed " + displayFirstButton3);


        // check the text present in the webelement and print in on the console
        WebElement textElement = driver.findElement(By.xpath("//div[@id='textElement']"));
        String text = textElement.getText();
        System.out.println("The text in thr Webelement is >>> " + text);

        // get the value of the attribute data  of the element
        WebElement attributeElement = driver.findElement(By.xpath("//div[@id='attributeElement']"));
        String attributeValue = attributeElement.getAttribute("data-custom-attribute");
        //you can get attribute with "id"
        // String attributeValue = attributeElement.getAttribute("id");
        // output show you >> attributeElement <<
        System.out.println("The value of the data attribute is .... " + attributeValue);


    }
}

