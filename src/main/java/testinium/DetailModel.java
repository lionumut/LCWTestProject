package testinium;

import org.openqa.selenium.By;

public class DetailModel extends BaseModel{

    public static By addBasket= By.id("pd_add_to_cart");

    public static By myBasket= By.className("header-bag-icon bndl-shopping-bag bndl-shopping-bag-dims");

    public void clickAddBasket(){

        clickElement(addBasket);
    }

    public void clickMyBasket(){

        clickElement(myBasket);
    }
}
