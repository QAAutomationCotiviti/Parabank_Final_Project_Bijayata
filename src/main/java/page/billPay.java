package page;

import org.openqa.selenium.*;
import pageElements.billpayElements;
import utilities.utility;

public class billPay {


//    static login objLogin = new login();



//    static  utility util = new utility();
//    static WebDriver driver = utility.initializeDriver("chrome");
//    static billpayElements billpayElements = new billpayElements(driver);

//    public billPay(WebDriver driver) {
//        this.driver = driver;
//    }

    public static void main(String[] args) {

        try {
//            util.getSiteUrl();
//            objLogin.getLoginInput("bijj123","123");


//            login objLogin = new login();
//            objLogin.getLoginInput("bijj123","123");


        }
        catch (ElementNotInteractableException | NoAlertPresentException e){
            System.out.println("Error: " +e);

        }

    }


//    public static void getBillPayLink(){
//        By[] getbillLink = billpayElements.billPayLink();
//
//
//        WebElement billLink = driver.findElement(getbillLink[0]);
//        billLink.click();
//    }



}
