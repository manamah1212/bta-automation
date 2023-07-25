package com.example.pages;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
public class OpenTheTestPageAndAcceptCookies extends BaseActions {
    private SelenideElement acceptCookies = $("button[class='button outside dark']:last-child");
    private SelenideElement celojumiButton = $x("//a[@class='item']//h4[@class='title' and contains(text(),'Ceļojumi')]");
    public void openPage(){
        new BaseActions().open("https://www.bta.lv");
    }
    public void acceptCookies(){
        new BaseActions().clickOnElement(acceptCookies);
    }
    public void clickToTravelInsurance(){
        new BaseActions().clickOnElement(celojumiButton);
    }
}