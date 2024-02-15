package com.anlov;


import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.anlov.constants.Constants.UrlPage.WILDBERRIES_HOME;

public class BasketTest extends BaseTest {
    @Test
    @Description("Проверка соответствия товаров в корзине")
    public void checkBasket() {
        final int COUNT = 3;
        basePage.openPage(WILDBERRIES_HOME);
        homePage.addToBasket(COUNT);
        baseElement.clickBasket();
        basketPage.wait(1500).nameOfGoods();

        Assert.assertEquals(basketPage.getCountOfGoods(),
                homePage.getCountOfGoods(),"It's the difference goods");
        for (int i = 0; i < COUNT; i++) {
            softAssert.assertEquals(basketPage.getGoodsName(COUNT - i - 1),
                    homePage.getSelectedGoodsName(i), "It's the difference names");
            softAssert.assertEquals((basketPage.getGoodsPrice(COUNT - i - 1)),
                    homePage.getSelectedGoodsPrice(i), "It's the difference prices");
        }
        softAssert.assertEquals(basketPage.getSum(),
                homePage.getSumOfGoods(), "It's the difference sums");
    }
}
