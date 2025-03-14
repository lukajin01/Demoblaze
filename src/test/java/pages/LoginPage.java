package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By LOGIN_WINDOW_BUTTON = By.id("login2");
    private static final By USER_FIELD = By.id("loginusername");
    private static final By PASSWORD_FIELD = By.id("loginpassword");
    private static final By LOGIN_BUTTON = By.xpath("//button[@onclick='logIn()']");

    @Step("Открытие страницы LoginPage")
    public LoginPage open(){
        driver.get("https://www.demoblaze.com/index.html");
        return this;
    }

    @Step("Вход в систему с данными пользователя: логин - {user} и пароль - {password}")
    public LoginPage login(String user, String password){
        driver.findElement(LOGIN_WINDOW_BUTTON).click();
        driver.findElement(USER_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

    @Step("Выбор категории Мониторы")
    public ProductPage selectCategory(){
        driver.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"]")).click();
        driver.findElement(By.xpath("//a[text()='MacBook Pro']")).click();
        return new ProductPage(driver);
    }
}
