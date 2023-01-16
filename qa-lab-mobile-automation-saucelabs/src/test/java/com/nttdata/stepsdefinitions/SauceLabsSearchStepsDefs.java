package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SauceLabsSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SauceLabsSearchStepsDefs {
    @Steps
    SauceLabsSearchSteps sauceLabsSteps;

    @Given("que me encuentro en el login de la apk Swags Labs")
    public void que_me_encuentro_en_el_login_de_la_apk_swags_labs() {
        sauceLabsSteps.esperarApp();
    }
    @When("me logueo con las credenciales de usuario: {string} y contraseña: {string}")
    public void me_logueo_con_las_credenciales_de_usuario_y_contraseña(String usuario, String contra) {
        sauceLabsSteps.loguerse(usuario, contra);
    }
    @Then("valido que debe aparecer el título de {string}")
    public void valido_que_debe_aparecer_el_titulo_de(String product) {
        Assert.assertEquals(sauceLabsSteps.getProductText(),product);
    }
    @And("también valido que exista al menos un item")
    public void tambien_valido_que_exista_al_menos_un_item() {
        int itemsListSize = sauceLabsSteps.getItems();
        Assert.assertTrue(itemsListSize>0);
    }

}
