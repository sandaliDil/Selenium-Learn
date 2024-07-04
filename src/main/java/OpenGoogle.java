
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    // First step
//    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver","E:\\QA\\Driver\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//    }
    
    //Second Step
//    public static void main(String[] args){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//    }

    //Third Step Recamond

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
