import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class TesteSiteExemplo {
    public static void main(String[] args) {
        // Configuração correta do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/home/marlon/Documentos/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        assertEquals("Google: ", driver.getTitle());

        driver.quit();
    }
}