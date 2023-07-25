package com.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Condition.*;

public class BaseActions {
    public void open(String website){
        Configuration.startMaximized = true;
        Selenide.open(website);
    }
    public void clickOnElement(SelenideElement element) {
        element.shouldBe(visible, enabled).click();
    }
    public void enterText(SelenideElement element, String text) {
        element.shouldBe(visible, enabled).clear();
        element.shouldBe(visible, enabled).val(text);
    }
    public boolean isElementDisplayed(SelenideElement element) {
        return element.isDisplayed();
    }
    public void fieldHasExpectedValue(SelenideElement element,String expectedValue){
        element.shouldHave(Condition.value(expectedValue));
    }
    public String getElementText(SelenideElement element) {
        return element.shouldBe(visible).getText();
    }
    public void scrollToElement(SelenideElement element){
        executeJavaScript("arguments[0].scrollIntoView(true);",element);
    }
}
