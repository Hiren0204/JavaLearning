package SeleniumSession;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverbasics {

    public static void main(String[] args) throws InterruptedException {

// Setup chromeDriver's path

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\Software\\chromedriver.exe");

        //Create an instance of webdriver

        WebDriver driver = new ChromeDriver();// Topcasting- Child class object referred by parentinterface reference variable.

        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(4000);//1000 milliseconds= 1 second.

        driver.manage().window().maximize();
       //4. Get page title(Tab Name)

                String title = driver.getTitle();
                System.out.println(title);

                // Expected vs Actual- Validation
        if (title.equals("nopcommerce demo store")) {
            System.out.println("The title is correct");
        }
        else {
            System.out.println("The title is incorrect");
        }
        // closing webpage
        // driver.close(); // closes the current session
        driver.quit();// closes everything
        }

    }

