package page;

import org.openqa.selenium.*;
import pageElements.loginElements;
import pageElements.registerElement;
import utilities.utility;

public class login {
    static utility util = new utility();
    static WebDriver driver = util.initializeDriver("chrome");
    static loginElements loginElements = new loginElements(driver);

//    static billPay billPay = new billPay(driver);


    static registerElement registerElements = new registerElement(driver);



    public static void main(String[] args) {
        try {
            util.getSiteUrl();


            getLoginInput("bijj123","123" );


//            billPay.getBillPayLink();


        }
        catch (ElementNotInteractableException | NoAlertPresentException e){
            System.out.println("Error: " +e);

        }
    }

    public static void getLoginInput(String username, String password) {
//        driver.findElement(loginElements.clickRegister()).click();
        By[] getLoginInput = loginElements.getLoginInput();

        By[] getLoginButton = loginElements.getLoginButton();

        WebElement uname = util.waitForElementTObeLocated(driver,20,getLoginInput[0]);
        uname.clear();
        uname.sendKeys(username);
        WebElement pword = util.waitForElementTObeLocated(driver,20,getLoginInput[1]);
        pword.clear();
        pword.sendKeys(password);
        WebElement button = util.waitForElementTObeLocated(driver,20,getLoginButton[0]);
        button.click();


    }


}
