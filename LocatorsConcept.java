package SeleniumSession;
import org.openqa. selenium.By;
import org. openqa. selenium. WebDriver;
import org. openqa. selenium.chrome.ChromeDriver;


public class LocatorsConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\Software\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver. get("https://demo.nopcommerce.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Digital")).click();
        driver.quit();

    }
}
