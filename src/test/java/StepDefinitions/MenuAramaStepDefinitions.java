package StepDefinitions;

import Pages.MenuAramaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class MenuAramaStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    MenuAramaPage menuAramaPage = new MenuAramaPage(driver);
    @Given("Elektronik menusunden Elektrikli Ev Aletleri secilir")
    public void elektronikMenusundenElektrikliEvAletleriSecilir() {
        menuAramaPage.elektronikEvAletleri();
    }

    @When("Elektrikli Mutfak Aletleri, ardindan Tost makinesi secilir")
    public void elektrikliMutfakAletleriArdindanTostMakinesiSecilir() throws InterruptedException {
        menuAramaPage.menuFiltre();
    }

    @When("Marka Arcelik secilir")
    public void markaArcelikSecilir() {
        menuAramaPage.markaArcelik();
    }

    @When("Satis miktarina gore siralanir")
    public void satisMiktarinaGoreSiralanir() throws InterruptedException {
        menuAramaPage.satisSiralama();
    }

    @Then("Ilk urune tiklanir")
    public void ilkUruneTiklanir() {
        menuAramaPage.ilkUrun();
    }

    @Then("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        menuAramaPage.sepeteEkle();
    }

    @Then("Sepet kontrol edilir")
    public void sepetKontrolEdilir() {
        menuAramaPage.sepetKontrol();
    }
}