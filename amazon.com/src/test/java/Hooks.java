import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

public static WebDriver driver;

    @BeforeClass
    public static void openBrowser()
    {
if (Automationconstants.Browser.equalsIgnoreCase("chrome"))
{
    System.out.println("Starting Browser");
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    driver = new ChromeDriver();
    System.out.println("Afterdriverget");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();

}
    else if (Automationconstants.Browser.equalsIgnoreCase("Firefox"))
{
    System.setProperty("webdriver.gecko.driver","geckodriver.exe");
    driver = new FirefoxDriver();
}

else
{
    System.out.println("sorry");
}
    driver.get(Automationconstants.URL);
    }


    @AfterClass
    public static void closeBrowser()
    {
        driver.quit();
    }

}
