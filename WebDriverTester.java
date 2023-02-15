package com.class25HomeWork;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver[] array = {new ChromeDriver(), new FirefoxDriver()};

        for (WebDriver arr : array) {
            arr.openBrowser();
            arr.closeBrowser();
            arr.maximizeWindow();
            arr.findElement();
        }

    }
}
