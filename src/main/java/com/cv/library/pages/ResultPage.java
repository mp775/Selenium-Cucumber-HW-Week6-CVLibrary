package com.cv.library.pages;

import com.cv.library.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    public ResultPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(css = ".search-header__title")
    WebElement resultText;

    public String verifyTheResults(String expected){
        return getTextFromElement(resultText);

    }


}
