import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Homepage {
WebDriver driver;
public Homepage (WebDriver driver)
{
    this.driver = driver;
}

    public void search()
    {

     driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("kindle");

 }

   public void search_icon() {

     driver.findElement (By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
   }

    public void login(){
        driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[1]")).click();
    }


    public void entersignindetails() {


        driver.findElement(By.id("ap_email")).sendKeys("hema20ram@yahoo.co.in");

        boolean isTextPresent = driver.getPageSource().contains("password");
        boolean status = true;
        if (status) {

            driver.findElement(By.id("ap_password")).sendKeys("hema20");
            driver.findElement(By.id("signInSubmit")).click();
        } else

        {
            driver.getPageSource().contains("continue");
            //driver.findElement(By.tagName("body")).getText().contains("continue");

            WebElement element = new WebElement() {
                public void click() {

                }

                public void submit() {

                }

                public void sendKeys(CharSequence... charSequences) {

                }

                public void clear() {

                }

                public String getTagName() {
                    return null;
                }

                public String getAttribute(String s) {
                    return null;
                }

                public boolean isSelected() {
                    return false;
                }

                public boolean isEnabled() {
                    return false;
                }

                public String getText() {
                    return null;
                }

                public List<WebElement> findElements(By by) {
                    return null;
                }

                public WebElement findElement(By by) {
                    return null;
                }

                public boolean isDisplayed() {
                    return false;
                }

                public Point getLocation() {
                    return null;
                }

                public Dimension getSize() {
                    return null;
                }

                public Rectangle getRect() {
                    return null;
                }

                public String getCssValue(String s) {
                    return null;
                }

                public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
                    return null;
                }
            };
            element.click();
            driver.findElement(By.id("ap_password")).sendKeys("hema20");
            driver.findElement(By.id("signInSubmit")).click();
        }
    }}
