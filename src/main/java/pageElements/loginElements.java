package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginElements {
    private final WebDriver driver;

//    private final By signUpModal = By.xpath("//*[@id='signInModal']//div[@class='modal-content']");

    private final By  loginUsername = By.xpath("//*[@id='loginPanel']/form/div[1]/input");

    private final By  loginPassword = By.xpath("//*[@id='loginPanel']/form/div[2]/input");

    private final By loginButton = By.xpath("//*[@id='loginPanel']/form/div[3]/input");

    private final By forgotpassLink = By.xpath("//*[@id='loginPanel']/p[1]/a");
    private final By registerLink = By.xpath("//*[@id='loginPanel']/p[2]/a");

    public loginElements(WebDriver driver) {
        this.driver = driver;
    }

    public By clickForgot(){
        return forgotpassLink;
    }
    public By clickRegister(){
        return registerLink;
    }


    public By[] getLoginInput(){
        return new By[]{loginUsername,loginPassword};
    }


    public By[] getLoginButton(){
        return new By[]{loginButton};
    }


}
