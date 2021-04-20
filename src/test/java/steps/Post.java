package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {
    private Base base;

    public Post(Base base) {
        this.base = base;
    }
/*
    @Dado("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url); // Abre o navegador do site alvo (extendendo da Base)
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String arg0) throws InterruptedException {
        //Thread.sleep(15000);
        //base.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys( arg0 + Keys.ENTER);
        base.driver.findElement(By.name("search")).sendKeys(arg0 + Keys.ENTER);
    }

    @Entao("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String arg0){

    }
*/

    @Given("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url); // Abre o navegador do site alvo (extendendo da Base)
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String arg0) throws InterruptedException {
        //Thread.sleep(15000);
        //base.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys( arg0 + Keys.ENTER);
        base.driver.findElement(By.name("search")).sendKeys(arg0 + Keys.ENTER);
    }

    @Then("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String arg0){

    }
}
