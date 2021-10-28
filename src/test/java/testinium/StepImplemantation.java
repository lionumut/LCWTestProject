package testinium;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class StepImplemantation {

    BasketModel basketModel = new BasketModel();

    DetailModel detailModel = new DetailModel();

    HomeModel homeModel = new HomeModel();

    LoginModel loginModel = new LoginModel();

    ProductModel productModel = new ProductModel();

    @Step("Ana sayfanın açıldığı kontrol edilir.")

    public void openPage() {

        Assert.assertTrue(homeModel.checkMainPage());
        homeModel.checkLogin();
    }

    @Step("Siteye login olunur, login işlemi kontrol edilir.")

    public void userLogin() {

        loginModel.setUserMail("ahmet@becerik.com");
        loginModel.setPassword("1374234891");
        loginModel.clickLoginUser();
        Assert.assertTrue(loginModel.checkIfLogin());
    }

    @Step("Arama kutucuğuna “pantolan”kelimesi girilir.")

    public void checkSearchBox(){

        productModel.clickSearchBox();
        productModel.setTextSearchBox("pantolon");
        productModel.clickSearchBtn();
    }

    @Step("Daha fazla ürün gör “butonuna tıklanır.")

    public void moreProduct(){

        productModel.clickMoreProduct();
    }

    @Step("Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.")

    public void selectProduct(){

        productModel.clickProduct();
    }

    @Step("Seçilen ürün sepete eklenir.")

    public void addBasket(){

        detailModel.clickAddBasket();
    }

    @Step("Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.")

    public void myBasket(){

        detailModel.clickMyBasket();
        basketModel.clickPlusBtn();
    }

    @Step("Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.")

    public void deleteProduct(){

        basketModel.clickDeleteBtn();
    }
}
