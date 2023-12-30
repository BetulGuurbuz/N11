package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("Kullanici anasayfadadir")
    public void kullaniciAnasayfadadir() {
        loginPage.anasayfa();
    }

    @Given("Cookie kabul edilir")
    public void cookieKabulEdilir() {
        loginPage.cookieTumuKabul();
    }

    @Given("Giris yap butonuna tiklar")
    public void girisYapButonunaTiklar() {
        loginPage.girisYapAnasayfa();
    }

    @When("Kullanici adi ve sifresini girer")
    public void kullaniciAdiVeSifresiniGirer() {
        loginPage.kullaniciAdiSifre();
    }

    @Then("Tekrar giris yap butonuna tiklar")
    public void tekrarGirisYapButonunaTiklar() {
        loginPage.girisYap();
    }

}
