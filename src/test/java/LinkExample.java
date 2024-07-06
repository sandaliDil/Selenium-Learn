import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;


public class LinkExample {

    WebDriver driver;

    @Test
    public void linkTest(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");

        //01). Take me to dashboard
        //driver.findElement(By.linkText("Go to Dashboard")).click();
        WebElement  go_to_dashboard = driver.findElement(By.linkText("Go to Dashboard"));
        go_to_dashboard.click();
        driver.navigate().back();

        //02).Find my destination without clicked link
        WebElement element = driver.findElement(By.partialLinkText("Find the URL without clicking me."));
        String path = element.getAttribute("href");
        System.out.println("This link is going to to :" + path);

        //03) am I broken link (title has 404 error)
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();
        String title = driver.getTitle();
        if(title.contains("404")){
            System.out.println("The link is broken");
        }else {
            System.out.println("The link is not broken");
        }
        driver.navigate().back();

        //04) Duplicate link
        WebElement duplicate= driver.findElement(By.linkText("Go to Dashboard"));
        duplicate.click();
        driver.navigate().back();

        //05) count full pages links
        List<WebElement> countPageLink = driver.findElements(By.tagName("a"));
        int pageLinkCount = countPageLink.size();
        System.out.println("Count of full page link: "+ pageLinkCount);

        //06) Count layout link
        WebElement getLayout = driver.findElement(By.className("layout-main-content"));
        List<WebElement> countLayoutLink =getLayout.findElements(By.tagName("a"));
        int fullCount = countLayoutLink.size();
        System.out.println("Layout link count : " + fullCount);
    }
}
