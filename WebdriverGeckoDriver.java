package SeleniumSession;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class WebdriverGeckoDriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\Downloads\\Software\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(4000);//1000 milliseconds= 1 second.
        driver.manage().window().maximize();
        //4. Get page title(Tab Name)

        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals("nopCommerce demo store")) {
            System.out.println("The title is correct");
        } else {
            System.out.println("The title is incorrect");
        }
        // closing webpage
        // driver.close(); // closes the current session
        driver.quit();// closes everything

    }
}
