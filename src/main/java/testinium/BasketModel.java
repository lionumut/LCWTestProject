package testinium;

import org.openqa.selenium.By;

public class BasketModel extends BaseModel{

    public static By plusButton= By.id("Cart_AddQuantity_676090786");

    public static By deleteButton= By.id("Cart_ProductDelete_676090786");

    public void clickPlusBtn(){

        clickElement(plusButton);
    }

    public void clickDeleteBtn(){

        clickElement(deleteButton);
    }
}
