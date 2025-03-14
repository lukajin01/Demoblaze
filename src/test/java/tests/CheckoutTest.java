package tests;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CartPage;

import static org.testng.Assert.assertEquals;

public class CheckoutTest extends BaseTest {

    @Test
    @Link("https://www.demoblaze.com/index.html")
    @Flaky
    @Severity(SeverityLevel.CRITICAL)
    @Description("Сквозное тестирование приложения")
    @Epic("HSE-03")
    @Feature("HSE-03-01")
    @Story("HSE-03-01-01")
    @Owner("Джинчарадзе Лука")
    public void checkout() {
        loginPage.open()
                .login("1", "1")
                .selectCategory();
                //.addToCart();
        //assertEquals(cartPage.getCompleteMessage(),
                //"Thank you for your purchase!",
                //"Сообщение о покупке не отобразилось");
    }
}
