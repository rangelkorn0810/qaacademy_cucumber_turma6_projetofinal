package submarino;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmarinoPage {
    WebDriver driver;
    public SubmarinoPage(WebDriver driverParametro){
        driver = driverParametro;
    }
    private String digitaProduto = "//*[@id=\"rsyswpsdk\"]/div/header/div[1]/div[1]/div/div[1]/form/input";

    public void preencherUrl(String url) {
        driver.get(url);
    }
    public void digitarProduto(String produto) {
        driver.findElement(By.xpath(digitaProduto)).sendKeys("violão");
    }
}
