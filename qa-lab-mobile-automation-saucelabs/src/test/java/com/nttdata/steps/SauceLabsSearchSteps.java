package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class SauceLabsSearchSteps {
    LoginScreen loginScreen;
    SearchScreen searchScreen;

    @Step("Esperar a que carge la app")
    public void esperarApp(){
        loginScreen.ingresarApp();
    }
    @Step("Loguearse")
    public void loguerse(String user, String password){
        loginScreen.inputUser(user);
        loginScreen.inputPassword(password);
        loginScreen.clickLogin();
    }
    @Step("Obtener el texto del título")
    public String getProductText(){
        return searchScreen.getProductText();
    }
    @Step("Obtener la cantidad de items")
    public int getItems(){
        return searchScreen.getItems();
    }

}
