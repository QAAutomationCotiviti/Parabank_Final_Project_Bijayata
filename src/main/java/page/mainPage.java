package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageElements.billpayElements;
import pageElements.loginElements;
import utilities.utility;

public class mainPage {
    register reg = new register();
    utility utility = new utility();

    private static final Logger log = LogManager.getLogger(mainPage.class);


    @BeforeTest
    public void getUrl(){
        utility.getSiteUrl();
        log.info("siteOpen");
        log.error("Errors");
    }

//    @Test(priority = 1)
//    public void logiIn(){
//        reg.getRegisterInput("bijayata","shrestha", "ktm", "bagmati", "KTm", "44600", "123", "9843671841", "bijj123", "123","123");
//    }
    @Test(priority = 1)
    public void registerUser(){
        reg.getRegisterInput("bijayata","shrestha", "ktm", "bagmati", "KTm", "44600", "123", "9843671841", "bijd", "12aa","12aa");
    }

    @Test(priority = 2)
    public void BillPay(){
        reg.getBillPayInput();
    }

    @Test(priority = 3)
    public void findTransaction(){
        reg.getFindTransactionInput();
    }

    @Test(priority = 4)
    public void RequestLoan(){
        reg.getRequestLoan();
    }

    @Test(priority = 5)
    public void logOut(){
        reg.getLogout();
    }

    @AfterTest

    public void QuitDriver(){
        reg.quitDriver();
    }




}
