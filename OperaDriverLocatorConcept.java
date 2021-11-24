package SeleniumSession;

import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaDriverLocatorConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "C:\\Users\\Owner\\Downloads\\Software\\operadriver.exe");

        WebDriver driver = new OperaDriver();
        driver. get("https://demo.nopcommerce.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Digital")).click();
        driver.quit();


        }
    }


