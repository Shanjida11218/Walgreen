package StepDef;

import Base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class Sign_up extends config {
    @And("customer enter their first name")
    public void customerEnterTheirFirstName() {
        driver.findElement(By.name("firstName")).sendKeys("xyz");

    }

    @And("customer enter their last name")
    public void customerEnterTheirLastName() {
        driver.findElement(By.name("lastName")).sendKeys("abc");

    }

    @And("customer enter their email")
    public void customerEnterTheirEmail() {
        driver.findElement(By.name("registerData")).sendKeys("xyz@gmail.com");

    }

    @And("customer enter their password")
    public void customerEnterTheirPassword() {
        driver.findElement(By.name("registerPassword")).sendKeys("Abcdefg@123");

    }

    @And("customer agrees with terms and conditions")
    public void customerAgreesWithTermsAndConditions() {
        driver.findElement (By.xpath("//*[@id=\"wag-terms-checkbox\"]")).click();

    }

    @And("customer click on continue")
    public void customerClickOnContinue() {
        driver.findElement (By.xpath("//*[@id=\"wag-rxuser-continue-btm\"]/span")).click();
    }

}

