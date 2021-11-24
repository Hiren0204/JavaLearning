package SeleniumSession;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class OperaNavigationConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver","C:\\Users\\Owner\\Downloads\\Software\\operadriver.exe");

        WebDriver driver= new OperaDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();

        Thread.sleep(4000);
        driver.findElement(By.className("ico-login")).click();
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
