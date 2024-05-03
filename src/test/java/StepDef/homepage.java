package StepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class homepage extends config {
    @Given("customer at Walgreen Homepage")
    public void customerAtWalgreenHomepage() {
        driver = new ChromeDriver();
        driver.get("https://www.walgreens.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
    }

    @And("customer clicks on Account button")
    public void customerClicksOnAccountButton() {
        driver.findElement (By.xpath("//*[@id=\"wag-header-account-container\"]/div/a/span[2]/div/strong")).click();
        
    }

    @And("customer clicks on Create new account button")
    public void customerClicksOnCreateNewAccountButton() {
        driver.findElement (By.xpath("//*[@id=\"pf-dropdown-register\"]")).click();
    }
}
