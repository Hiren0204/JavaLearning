package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("gender-male")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("FirstName")).sendKeys("Hiren");
        Thread.sleep(1000);
        driver.findElement((By.id("LastName"))).sendKeys("Gohil");

        driver.findElement(By.id("DateOfBirthMonth")).sendKeys("04");
        driver.findElement(By.id("DateOfBirthDay")).sendKeys("02");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1993");


//


    }
    public static void selectValueFromDropDown(WebElement element,String value){
        Select select= new  Select (element);
        select. selectByVisibleText(value);
    }
}
