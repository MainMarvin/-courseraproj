package selenium_ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.lang.Thread;


public class Main {
    public static void main(String[] args) {
        EdgeDriverService service = new EdgeDriverService.Builder().usingDriverExecutable(
            new java.io.File("C:/WebDriver/edgedriver_win64/msedgedriver.exe")).build();

        WebDriver driver = new EdgeDriver(service);
        
        driver.get("https://www.google.com");

        try{

            System.out.println(driver.getTitle());

            Thread.sleep(3000);

            driver.manage().window().maximize();
            
            Thread.sleep(3000);

            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://the-internet.herokuapp.com/login");

            Thread.sleep(2000);

            WebElement user = driver.findElement(By.id("username"));
            user.sendKeys("tomsmith");

            WebElement pass = driver.findElement(By.id("password"));
            pass.sendKeys("SuperSecretPassword!");

            WebElement formButton = driver.findElement(By.className("radius"));
            formButton.click();
            
            Thread.sleep(3000);
            

        }catch(Exception e){
            System.out.println(e);
        }

        
        driver.quit();
    }
}