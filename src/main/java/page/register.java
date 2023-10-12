    package page;

    import org.openqa.selenium.*;
    import org.openqa.selenium.support.ui.Wait;
    import pageElements.billpayElements;
    import pageElements.findTransactionsElements    ;
    import pageElements.loginElements;
    import pageElements.registerElement;
    import pageElements.requestLoanElements;
    import pageElements.logoutElement;
    import utilities.utility;

    public class register {
        static utility util = new utility();
        static WebDriver driver = util.initializeDriver("chrome");
//        static Wait<WebDriver> wait = util.genericWait(5,driver);
        static loginElements loginElements = new loginElements(driver);
        static registerElement registerElements = new registerElement(driver);
        static billpayElements billPayElement = new billpayElements(driver);
        static requestLoanElements requestLoanElements = new requestLoanElements(driver);

        static findTransactionsElements findTransactionsElements = new findTransactionsElements(driver);

        static logoutElement logoutElements = new logoutElement(driver);

        public static void main(String[] args) {
            try {
                util.getSiteUrl();

               getLoginInput("bijj123", "123");



           //getRegisterInput("bijayata","shrestha", "ktm", "bagmati", "KTm", "44600", "123", "9843671841", "bijj123", "123","123");
//                getRequestLoan();
           // getRegisterInput("","", "", "", "", "", "", "", "", "","");

//                getBillPayInput();

                getRequestLoan();

//                getLogout();

    //            getLoginInput("bijj", "123");

    //            getLoginInput("bijj123","123");

    //            getRegisterInput("","", "", "", "", "", "", "", "", "","");
    //


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

        public static void getRegisterInput(String firstName,String lastName,String Address,String state,String City,String ZipCode,String SSN,String phone,String Username,String Password,String confirm) {

            By[] getRegLink = registerElements.getRegisterLink();
            WebElement reLink = driver.findElement(getRegLink[0]);
            reLink.click();

            By[] getRegInput = registerElements.getRegisterInput();

            By [] getregisterButton = registerElements.registerButton();

            By[] getLoginButton = loginElements.getLoginButton();

            WebElement fname = driver.findElement(getRegInput[0]);
            fname.clear();
            fname.sendKeys(firstName);

            WebElement lname = driver.findElement(getRegInput[1]);
            lname.clear();
            lname.sendKeys(lastName);

            WebElement address = driver.findElement(getRegInput[2]);
            address.clear();
            address.sendKeys(Address);

            WebElement city = driver.findElement(getRegInput[3]);
            city.clear();
            city.sendKeys(City);

            WebElement State = driver.findElement(getRegInput[4]);
            State.clear();
            State.sendKeys(state);



            WebElement zipcode = driver.findElement(getRegInput[5]);
            zipcode.clear();
            zipcode.sendKeys(ZipCode);

            WebElement Phone = driver.findElement(getRegInput[6]);
            Phone.clear();
            Phone.sendKeys(phone);

            WebElement ssn = driver.findElement(getRegInput[7]);
            ssn.clear();
            ssn.sendKeys(SSN);



            WebElement uname = driver.findElement(getRegInput[8]);
            uname.clear();
            uname.sendKeys(Username);

            WebElement pass = driver.findElement(getRegInput[9]);
            pass.clear();
            pass.sendKeys(Password);

            WebElement cpass = driver.findElement(getRegInput[10]);
            cpass.clear();
            cpass.sendKeys(confirm);

            WebElement button = driver.findElement(getregisterButton[0]);
            button.click();
//            getValidationError();
        }

        public static void getValidationError(){

            System.out.println("----------------Registration form error--------------");

            if(registerElements.getRegisterFnameVal() !=null){
                By[] fnameValidation = registerElements.getRegisterFnameVal();

                String fnametext = driver.findElement(fnameValidation[0]).getText();
                System.out.println(fnametext);
            }  if(registerElements.getRegisterLnameVal() != null){
                By[] lnameValidation = registerElements.getRegisterLnameVal();

                String lnametext = driver.findElement(lnameValidation[0]).getText();
                System.out.println(lnametext);
            }  if (registerElements.getRegisterAddressVal() != null){
                By[] addressValidation = registerElements.getRegisterAddressVal();

                String addressvaltext = driver.findElement(addressValidation[0]).getText();
                System.out.println(addressvaltext);



            } if (registerElements.getRegisterstateVal() != null){
                By[] stateValidation = registerElements.getRegisterstateVal();

                String statevaltext = driver.findElement(stateValidation[0]).getText();
                System.out.println(statevaltext);

            } if (registerElements.getRegisterCityVal() != null){
                By[] cityValidation = registerElements.getRegisterCityVal();

                String cityvaltetxt = driver.findElement(cityValidation[0]).getText();
                System.out.println(cityvaltetxt);

            } if (registerElements.getRegisterZipCodeVal() != null){
                By[] zipcodeValidation = registerElements.getRegisterZipCodeVal();

                String zipvaltext = driver.findElement(zipcodeValidation[0]).getText();
                System.out.println(zipvaltext);

            } if (registerElements.getRegisterSSNVal() != null){
                By[] ssnValidation = registerElements.getRegisterSSNVal();

                String snnvaltext = driver.findElement(ssnValidation[0]).getText();
                System.out.println(snnvaltext);

            }

             if (registerElements.getRegisterUsernameVal() != null){
                By[] usernameValidation = registerElements.getRegisterUsernameVal();

                String uservaltext = driver.findElement(usernameValidation[0]).getText();
                System.out.println(uservaltext);

            } if (registerElements.getRegisterPasswordVal() != null){
                By[] passValidation = registerElements.getRegisterPasswordVal();

                String passvaltext = driver.findElement(passValidation[0]).getText();
                System.out.println(passvaltext);

            } if (registerElements.getRegisterconfirmVal() != null){
                By[] conpassValidation = registerElements.getRegisterconfirmVal();

                String conpassvaltext = driver.findElement(conpassValidation[0]).getText();
                System.out.println(conpassvaltext);

            }





        }


        public static void getBillPayInput(){
            billPayElement.getBillPayInput();
        }

        public static void getFindTransactionInput(){
//            Wait<WebDriver> wait  = util.genericWait(20,driver);
            findTransactionsElements.getFindTransaction("14476","10-9-2023","1200");
        }

        public static void getRequestLoan(){
            requestLoanElements.ApplyForLoan();
        }

        public static void getLogout(){
            logoutElements.getLogoutButton();
        }

        public static void quitDriver(){
            driver.quit();
        }

    }
