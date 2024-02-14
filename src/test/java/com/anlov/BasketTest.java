package com.anlov;

import org.junit.jupiter.api.*;
import static com.anlov.constants.Constants.UrlPage.WILDBERRIES_HOME;

public class BasketTest extends BaseTest {
    @Test
    @DisplayName("Проверка соответствия товаров в корзине")
    public void checkBasket() {
        final int COUNT = 3;
        basePage.openPage(WILDBERRIES_HOME);
        homePage.addToBasket(COUNT);
        baseElement.clickBasket();
        basketPage.wait(1500).nameOfGoods();

        Assertions.assertEquals(basketPage.getCountOfGoods(),homePage.getCountOfGoods(),"It's the difference goods");
        for (int i = 0; i < COUNT; i++) {
            Assertions.assertEquals(basketPage.getGoodsName(COUNT - i - 1),
                    homePage.getSelectedGoodsName(i), "It's the difference names");
            Assertions.assertEquals(Math.round(basketPage.getGoodsPrice(COUNT - i - 1)),
                    Math.ceil(homePage.getSelectedGoodsPrice(i)), "It's the difference prices");
        }
        Assertions.assertEquals(basketPage.getSum(),
                (homePage.getSumOfGoods()), "It's the difference sums");
    }
}
