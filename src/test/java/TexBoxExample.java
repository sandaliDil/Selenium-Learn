import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TexBoxExample {

    WebDriver driver;

    @BeforeMethod
    public void connectDriver() throws InterruptedException {

        //convert browser version
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setBrowserVersion("123");
//        driver = new ChromeDriver(chromeOptions);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");
       // Thread.sleep(3000);
    }

    @Test
    public void TextBoxChecked() {

        //01) Type your name
        driver.findElement(By.id("j_idt88:name")).sendKeys("sandali dilrukshi");

        //02) Append Country to this City
        WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.clear();
        appendText.sendKeys("India");

        //03) Verify if text box is disabled
        boolean  verify = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("If text box is Enabled: "+ verify);

        //04) Clear the typed text.
       //driver.findElement(By.id("j_idt88:j_idt95")).clear();
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]")).clear();

        //05)Retrieve the typed text.
        WebElement retrievedText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
        String getText = retrievedText.getAttribute("value");
        System.out.println("Retrieve the typed text : " + getText);

        //06) Type email and Tab. Confirm control moved to next element.
        WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
        email.sendKeys("sandali@gmail.com" +Keys.TAB + "Confirm control moved to next element");


    }

}
