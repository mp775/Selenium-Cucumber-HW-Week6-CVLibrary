package com.cv.library;

import com.cv.library.propertyreader.PropertyReader;
import com.cv.library.utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
