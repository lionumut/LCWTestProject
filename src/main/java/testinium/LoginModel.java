package testinium;

import org.openqa.selenium.By;

public class LoginModel extends BaseModel {

    public static By txtMail = By.id("LoginEmail");

    public static By txtPassword = By.id("Password");

    public static By btnLogin = By.className("button bc-blue login-button-link bold");

    public static By checkLogged = By.className("col-sm-4 col-xs-4 header-user-search-switch padding-r-0");

    public void setUserMail(String mail) {
        sendKeys(txtMail, mail);
    }

    public void setPassword(String password) {
        sendKeys(txtPassword, password);
    }

    public void clickLoginUser(){
        clickElement(btnLogin);
    }

    public boolean checkIfLogin(){
        return displayed(checkLogged);
    }

}