package com.example.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FormFilingPage {
    private SelenideElement regionSelection = $("#regionalSelectorRegion-open");
    private SelenideElement choseCountry = $("#regionalSelectorCountry");
    private SelenideElement addCountry = $("#regionalSelectorCountry-addCountry");
    private SelenideElement countryField = $("#regionalSelectorCountry-typedValue");
    private SelenideElement IndijaCountry = $("[data-value=\"Indija\"]");
    private SelenideElement confirmCountryChangeButton = $("#regionalSelectorCountry-applyButton");
    private SelenideElement travelCountry = $x("//button[@id='regionalSelectorRegion-open' and .//span[text()='Visa pasaule']]");
    private SelenideElement activitySelector = $("#travelActivities-open");
    private SelenideElement sportActivitySelector = $("#travelActivities-popup-select-option-3");
    private SelenideElement sportActivityCheck = $x("//button[@id='travelActivities-open' and .//span[text()='Sports']]");
    private SelenideElement receiveOfferButton = $x("//button[@data-type='travelSubmit']");
    private SelenideElement choseProgramValidationSelector = $x("//h2[@class='title' and contains(text(), 'Izvēlies programmu')]");


    public void selectCorrectRegion(){
        new BaseActions().clickOnElement(regionSelection);
        new BaseActions().clickOnElement(choseCountry);
        new BaseActions().clickOnElement(addCountry);
        new BaseActions().isElementDisplayed(countryField);
        new BaseActions().enterText(countryField,"Indija");
        new BaseActions().clickOnElement(IndijaCountry);
        new BaseActions().clickOnElement(confirmCountryChangeButton);
    }
    public void regionChangesVerify(){
        new BaseActions().isElementDisplayed(travelCountry);
    }
    public void changeActivity() {
        new BaseActions().scrollToElement(activitySelector);
        new BaseActions().clickOnElement(activitySelector);
        new BaseActions().clickOnElement(sportActivitySelector);
    }
    public void validateActivity(){
        new BaseActions().isElementDisplayed(sportActivityCheck);
    }

    public void clickToReceiveOfferButton(){
        new BaseActions().clickOnElement(receiveOfferButton);
        new BaseActions().isElementDisplayed(choseProgramValidationSelector);
    }
}
