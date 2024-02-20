package com.anlov.common;

public class MainPage extends BasePage {
    private static final String idDigLocator = "com.google.android.calculator:id/digit_";
    private static final String idCalculatLocator = "com.google.android.calculator:id/";

    public MainPage takeExpress(String expression) {
        String[] expres = expression.split(" ");
        for (int i = 0; i < expres.length; i++) {
            if (i % 2 == 0) driver.findElementById(idDigLocator + expres[i]).click();
            else takeOperation(expres[i]);
        }
        return this;
    }

    private void takeOperation(String operation) {
        switch (operation) {
            case "+":
                driver.findElementById(idCalculatLocator + "op_add").click();
                break;
            case "-":
                driver.findElementById(idCalculatLocator + "op_sub").click();
                break;
            case "*":
                driver.findElementById(idCalculatLocator + "op_mul").click();
                break;
            case "/":
                driver.findElementById(idCalculatLocator + "op_div").click();
                break;
        }
    }

    public String getResult() {
        driver.findElementById(idCalculatLocator + "eq").click();
        return driver.findElementById(idCalculatLocator + "result_final").getText();
    }
}
