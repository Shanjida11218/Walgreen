package StepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Login extends config {
    @And("customer clicks on Sign in button")
    public void customerClicksOnSignInButton() {
       driver.findElement(By.xpath("//*[@id=\"pf-dropdown-signin\"]")).sendKeys("click");
    }
    @And("customer enter their email")
    public void customerEnterTheirEmail() {
        driver.findElement(By.name("username")).sendKeys("xyz@gmail.com");
    }
    @And("customer enter their password")
    public void customerEnterTheirPassword() {
        driver.findElement(By.name("password")).sendKeys("Abcdefg@123");
    }

    @Then("customer click on sign in button")
    public void customerClickOnSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).sendKeys("click");
    }
}
