package Week4SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class E6Action {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the screen
        driver.manage().window().maximize();
        // navigate to syntax project
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        // hover the button
        WebElement hoverButton = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action = new Actions(driver);
        action.moveToElement(hoverButton).perform();
        // Right click
        WebElement rightClick=driver.findElement(By.id("show_context_menu"));
        action.contextClick(rightClick).perform();
        // the draggable
        WebElement draggable= driver.findElement(By.id("draggable"));
        // drop location
        WebElement dropLocation = driver.findElement(By.id("droppable"));
       // action.dragAndDrop(draggable,dropLocation).perform();
        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();


















    }
}
