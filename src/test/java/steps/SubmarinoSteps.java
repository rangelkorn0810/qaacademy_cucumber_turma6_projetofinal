package steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import submarino.SubmarinoPage;

import java.time.Duration;

public class SubmarinoSteps {
    WebDriver driver;
    SubmarinoPage submarinoPage;
    @Before("@submarino")
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://www.submarino.com.br/");
    }
}
