package testinium;

import org.openqa.selenium.By;

public class ProductModel extends BaseModel {

    public static By searchBox = By.className("search search-activated");

    public static By searchButton = By.xpath("/html/body/div[6]/div[2]/div[2]/div[3]/div/div[1]/div/div/div/div[1]/a");

    public static By moreProduct = By.className("lazy-load-button");

    public static By selectProduct = By.xpath("/html/body/div[5]/div[3]/div[2]/div[7]/div/div[1]/div[87]/a/div[1]/img[2]");

    public void clickSearchBox() {

        clickElement(searchBox);
    }

    public void setTextSearchBox(String productName) {

        sendKeys(searchBox, productName);
    }

    public void clickSearchBtn(){

        clickElement(searchButton);
    }

    public void clickMoreProduct(){

        clickElement(moreProduct);
    }

    public void clickProduct(){

        clickElement(selectProduct);
    }
}
