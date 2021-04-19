package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url;            // Endere�o do site alvo
    WebDriver driver;      // Objeto do Selenium Webdriver

    @Before                // O que ocorre antes do teste
    public void iniciar(){
        url = "https://pt.wikipedia.org/";
        // Indicar onde est� o Chrome Driver
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/89/chromedriver.exe");
        // Instanciar o Selenium com o Chrome Driver
        driver = new ChromeDriver();
        // Maximizar a janela do navegador
        driver.manage().window().maximize();
        // Define uma espera implicita de 1 min., verificando o carregamento a cada milissegundo
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MICROSECONDS);
    }

    @Test                  // O que ocorre durante o teste
    public void consultarArtigo(){
        // Abrir o site
        driver.get(url);

        // Pesquisar por "Ovo de P�scoa"
        driver.findElement(By.name("search")).sendKeys("Ovos de P�scoa");
        //driver.findElement(By.className("wvui-button.wvui-typeahead-search__submit.wvui-button--default.wvui-button--framed")).click(); //clica na lupa
        //driver.findElement(By.cssSelector("button.wvui-button.wvui-typeahead-search__submit.wvui-button--default.wvui-button--framed")).sendKeys("Ovo de Pascoa" + Keys.ENTER);
        driver.findElement(By.xpath("button[contains(text(),'Busca')]"));

        // Validar o t�tulo da p�gina de retorno
        //assertEquals("Ovo da P�scoa - Wikip�dia, a enciclop�dia livre", driver.getTitle());
        assertTrue(driver.getTitle().contains("Ovo de P�scoa"));
    }

    @After                 // O que ocorre ap�s o teste
    public void finalizar(){
        driver.quit();
    }
}
