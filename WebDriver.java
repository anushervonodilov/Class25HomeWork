package com.class25HomeWork;

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find Chrome Browser");
    }
}

class FirefoxDriver implements WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Firefox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find Firefox Browser");
    }
}
