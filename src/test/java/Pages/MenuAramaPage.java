package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import util.ElementHelper;

public class MenuAramaPage {
    static WebDriver driver;
    util.ElementHelper elementHelper;
    By mutfakAletleri = By.xpath("//a[contains(.,'Elektrikli Mutfak Aletleri')]");
    By tostMakinesi = By.xpath("//ul[4]//a[contains(.,'Tost Makinesi')]");
    By markaArcelik = By.xpath("//section[@class='filter acc open clickedFilter']//a[.='Arçelik']");
    By siralama = By.xpath("//i[@class='iconSortBy']");
    By satisSiralama = By.xpath("//div[@class='item i3']");
    By ilkUrun = By.xpath("//h3[.='Arçelik TM 6046 CS Resital 2400 W Tost Makinesi']");
    By sepeteEkle = By.xpath("//button[@class='addBasketUnify']");
    By sepeteGit = By.xpath("//i[@class='iconsBasketWhite']");
    public MenuAramaPage(WebDriver driver) {
        MenuAramaPage.driver = driver;
        this.elementHelper=new ElementHelper(driver);
    }

    public void elektronikEvAletleri() {
        Actions actions = new Actions(driver);
        WebElement ustElektronik = driver.findElement(By.xpath("//span[.='Elektronik']"));
        actions.moveToElement(ustElektronik).build().perform();
        WebElement ustEvAletleri = driver.findElement(By.xpath("//span[.='Elektrikli Ev Aletleri']"));
        actions.click(ustEvAletleri).build().perform();
    }

    public void menuFiltre() throws InterruptedException {
        driver.findElement(mutfakAletleri).click();
        Thread.sleep(1000);
        driver.findElement(tostMakinesi).click();
    }

    public void markaArcelik() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,250)", " ");
        driver.findElement(markaArcelik).click();
    }

    public void satisSiralama() throws InterruptedException {
        driver.findElement(siralama).click();
        Thread.sleep(1000);
        driver.findElement(satisSiralama).click();
    }

    public void ilkUrun() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,250)", " ");
        driver.findElement(ilkUrun).click();
    }

    public void sepeteEkle() {
        driver.findElement(sepeteEkle).click();
    }

    public void sepetKontrol() {
        driver.findElement(sepeteGit).click();
    }
}
