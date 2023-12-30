package Pages;
import org.openqa.selenium.*;
import org.testng.Assert;
import util.ElementHelper;
import java.util.HashMap;

public class LoginPage {
    static WebDriver driver;
    util.ElementHelper elementHelper;
    String baseUrl = "https://www.n11.com";
    By girisYapAnasayfa = By.cssSelector(".btnSignIn");
    By kullaniciAdi = By.cssSelector("#email");
    By sifre = By.cssSelector("#password");
    By girisYap = By.cssSelector("#loginButton");



    public LoginPage(WebDriver driver) {
        LoginPage.driver = driver;
        this.elementHelper=new ElementHelper(driver);
    }

    public void anasayfa() {
        driver.get(baseUrl);
        String equalsUrl = "https://www.n11.com";
        Assert.assertEquals(baseUrl, equalsUrl);
    }

    public void cookieTumuKabul() {
        WebElement cookieKabul = driver.findElement(By.xpath("//efilli-layout-dynamic[1]"));
        SearchContext shadowCookie = cookieKabul.getShadowRoot();
        WebElement shadowCookieKabul = shadowCookie.findElement(By.id("480698fc-e6ac-41bc-a722-51059b783200"));
        shadowCookieKabul.click();
    }

    public void girisYapAnasayfa() {
        driver.findElement(girisYapAnasayfa).click();

    }

    public void kullaniciAdiSifre() {
        HashMap<String, String> kullaniciBilgileri = new HashMap<String, String>();
        kullaniciBilgileri.put("True", "dogrugiris@deneme.com:12345678");
        kullaniciBilgileri.put("False1", "deneme@deneme.com:16561asdf");
        kullaniciBilgileri.put("False2", "deneme2@deneme.com:78565qwer");
        System.out.println(kullaniciBilgileri.get("True"));

        String arr[] = kullaniciBilgileri.get("False1").split(":");
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        driver.findElement(kullaniciAdi).sendKeys(arr[0]);
        driver.findElement(sifre).sendKeys(arr[1]);
    }

    public void girisYap() {
        driver.findElement(girisYap).click();

    }
}
