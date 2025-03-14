package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By PLACE_ORDER_BUTTON = By.xpath("//button[text()='Place Order']");
    private static final By NAME_FIELD = By.id("name");
    private static final By COUNTRY_FIELD = By.id("country");
    private static final By CITY_FIELD = By.id("city");
    private static final By CARD_FIELD = By.id("card");
    private static final By MONTH_FIELD = By.id("month");
    private static final By YEAR_FIELD = By.id("year");
    private static final By PURCHASE_BUTTON = By.xpath("//button[@onclick='purchaseOrder()']");
    private static final By COMPLETE_MESSAGE = By.xpath("//h2[text()='Thank you for your purchase!']");

    @Step("Нажатие на кнопку place order")
    public CartPage clickToPlaceOrder(){
        driver.findElement(PLACE_ORDER_BUTTON).click();
        return this;
    }

    @Step("Заполнение формы данными")
    public CartPage fillingForm(String name, String country, String city, String card, String month, String year){
        driver.findElement(NAME_FIELD).sendKeys(name);
        driver.findElement(COUNTRY_FIELD).sendKeys(country);
        driver.findElement(CITY_FIELD).sendKeys(city);
        driver.findElement(CARD_FIELD).sendKeys(card);
        driver.findElement(MONTH_FIELD).sendKeys(month);
        driver.findElement(YEAR_FIELD).sendKeys(year);
        return this;
    }

    @Step("Нажатие на кнопку purchase")
    public CartPage clickToPurchase(){
        driver.findElement(PURCHASE_BUTTON).click();
        return this;
    }

    public String getCompleteMessage(){
        return driver.findElement(COMPLETE_MESSAGE).getText();
    }
}