package com.tel_ran;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoToGoogle {
    WebDriver wd;


    @Test
    public void goToGoogle() {

        wd = new ChromeDriver();
        wd.get("https://www.google.fi");
        wd.quit();

    }

}
