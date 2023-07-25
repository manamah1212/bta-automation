package com.example.pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PolicePlanPage {
    private SelenideElement optimalPlanSelector = $x("//div[@data-type='policyItemOPP']//button[contains(@class, 'button-covered-popup')]");
    private SelenideElement formTitleValidationSelector = $x("//h2[@class='title' and contains(text(), 'Kas ir apdrošināts')]");
    private SelenideElement closeFormButtonSelector = $x("//button[@class='popup-close close']");
    private SelenideElement optimalPlusPlanButtonSelector = $x("//button[contains(@data-param,'OPP') and contains(@datatype,'selectPolicyPlanOPP')  and contains(@class,'button')]");
    private SelenideElement nameFieldSelector = $("#travelerFirstName0-text");
    private SelenideElement surnameFieldSelector = $("#travelerLastName0-text");
    private SelenideElement personalIdFieldSelector = $("#travelerIdentityNumber0-text");

    public void checkOptimalPlan(){
        new BaseActions().clickOnElement(optimalPlanSelector);
    }
    public void verifyThatFormIsOpen(){
        new BaseActions().isElementDisplayed(formTitleValidationSelector);
    }
    public void closeTheFormAndGoToTheNextStep(){
        new BaseActions().clickOnElement(closeFormButtonSelector);
        new BaseActions().clickOnElement(optimalPlusPlanButtonSelector);
    }
    public void travelerDataVerifying(){
        new BaseActions().fieldHasExpectedValue(nameFieldSelector,"");
        new BaseActions().fieldHasExpectedValue(surnameFieldSelector,"");
        new BaseActions().fieldHasExpectedValue(personalIdFieldSelector,"");
    }
}