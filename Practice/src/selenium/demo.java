package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
    public static void main(String[] args) {
        launch_browser();
    }
    public static void launch_browser(){

       System.setProperty("webdriver.chrome.driver","C:\\Personal\\Java practice\\PracticeJava\\Practice\\Resource\\chromedriver.exe");
        WebDriver d = new ChromeDriver();


        /*System.setProperty("webdriver.edge.driver","C:\\Personal\\Java practice\\PracticeJava\\Practice\\Resource\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();*/
    }

}
