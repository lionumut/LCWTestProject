package testinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {

    WebElement driver;

    public static By checkMainPage= By.className("change-padding-top");

    public void checkLogin(){

        driver.findElement(By.className("btn-group header-user dropdown open")).click();
    }

    public boolean checkMainPage() {
        return displayed(checkMainPage);
    }
}
