import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Links {

    WebDriver driver;

    @BeforeMethod

    public void TestAutomationPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
    }
    @Test

    public void LinksTest() throws InterruptedException {

        // get tabs count
        List<WebElement> listOfTabs = driver.findElements(By.xpath("//div[@id='crosscol']//ul/li/a"));
        int count = listOfTabs.size();
        System.out.println("size is: " + count);

        // chek for all tabs are working
        for (int i=0; i<count; i++) {
            List<WebElement> allTabs = driver.findElements(By.xpath("//div[@id='crosscol']//ul/li/a"));
            WebElement tab = allTabs.get(i);
            tab.click();
            String title = driver.getTitle();
            System.out.println("page title is: " + title);

            driver.navigate().back();
            Thread.sleep(2000);
        }












    }
}
