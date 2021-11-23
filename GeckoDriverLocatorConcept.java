package SeleniumSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverLocatorConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\Downloads\\Software\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver. get("https://demo.nopcommerce.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Digital")).click();
        driver.quit();

    }
}
