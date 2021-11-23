package SeleniumSession;

import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NavigationConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\Software\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
// Navigation
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();

        Thread.sleep(4000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("Email")).sendKeys("hirenveljigohil@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Hiren@0204");
        Thread.sleep(5000);
        driver.findElement(By.className("login-button")).click();

        Thread.sleep(4000);
        driver.navigate().back();

        Thread.sleep(4000);
        driver.navigate().forward();

        Thread.sleep(4000);
        driver.navigate().back();

        Thread.sleep(4000);
        driver.navigate().refresh();



        String url= driver.getTitle();
        System.out.println(url);


    }
}
