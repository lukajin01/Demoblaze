package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By ADD_TO_CART = By.xpath("//a[text()='Add to cart']");
    private static final By CART_BUTTON = By.id("cartur");

    @Step("Добавление в корзину товара")
    public ProductPage addToCart(){
        driver.findElement(ADD_TO_CART).click();
        return this;
    }

    @Step("Нажатие на кнопку корзина")
    public CartPage clickToCart(){
        driver.findElement(CART_BUTTON).click();
        return new CartPage(driver);
    }

}
