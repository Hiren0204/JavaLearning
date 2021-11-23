package SeleniumSession;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLoginPage {
    public static void main(String[] args) throws InterruptedException {

// Setup chromeDriver's path

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\Software\\chromedriver.exe");

        //Create an instance of webdriver

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(4000);//1000 milliseconds= 1 second.

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login");

        Thread.sleep(4000);


    }
}
