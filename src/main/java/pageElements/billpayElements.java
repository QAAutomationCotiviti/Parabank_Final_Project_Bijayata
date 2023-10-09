package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class billpayElements {

    private final WebDriver driver;

    public final By billpayLink =By.xpath("//*[@id=\"leftPanel\"]//ul//li[4]//a");
    public final By PayeeName =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input");

    public final By Address =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[2]/td[2]/input");
    public final By City =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[3]/td[2]/input");
    public final By State =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input");
    public final By zipcode =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[5]/td[2]/input");
    public final By phoneNumber =By.xpath("//*[@name='payee.phoneNumber']");
    public final By account =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[8]/td[2]/input");
    public final By verifyAccount =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[9]/td[2]/input");
    public final By amount =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[11]/td[2]/input");
    public final By fromAccount =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select");

    public final By paymentButton =By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input");

    public final By billPayMess1 =By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/p[1]");
    public final By billPayMess2 =By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/p[2]");


    public billpayElements(WebDriver driver) {
        this.driver = driver;
    }


    public  void getBillPayInput(){

        WebElement billLink = driver.findElement(billpayLink);
        billLink.click();


        WebElement payeenameVal = driver.findElement(PayeeName);
        payeenameVal.clear();
        payeenameVal.sendKeys("test123");

        WebElement AddressVal = driver.findElement(Address);
        AddressVal.clear();
        AddressVal.sendKeys("Baluwatar");

        WebElement CityVal = driver.findElement(City);
        CityVal.clear();
        CityVal.sendKeys("KTM");

        WebElement stateVal = driver.findElement(State);
        stateVal.clear();
        stateVal.sendKeys("Bagmati");

        WebElement zipcodeVal = driver.findElement(zipcode);
        zipcodeVal.clear();
        zipcodeVal.sendKeys("44600");

        WebElement phoneNumberVal = driver.findElement(phoneNumber);
        phoneNumberVal.clear();
        phoneNumberVal.sendKeys("9843671841");

//        WebElement phoneVal = driver.findElement(phone);
//        phoneVal.clear();
//        phoneVal.sendKeys("9843671841");

        WebElement accountVal = driver.findElement(account);
        accountVal.clear();
        accountVal.sendKeys("12345");

        WebElement verifyAccountVal = driver.findElement(verifyAccount);
        verifyAccountVal.clear();
        verifyAccountVal.sendKeys("12345");

        WebElement amountVal = driver.findElement(amount);
        amountVal.clear();
        amountVal.sendKeys("1200");

        WebElement sendPayButton = driver.findElement(paymentButton);
        sendPayButton.click();

        billPaySuccessMessage();




    }


    public void billPaySuccessMessage(){

        WebElement billPayMessage1 = driver.findElement(billPayMess1);
        WebElement billPayMessage2 = driver.findElement(billPayMess2);
        if(billPayMessage2!=null){
            System.out.println(billPayMessage1.getText());
            System.out.println(billPayMessage2.getText());
        }
        else{
            System.out.println("-----error-----");
        }


    }

//    public By[] getRegisterFnameVal(){
//        if(fnameVal!= null){
//            return new By[]{fnameVal};
//        }
//        else{
//            return null;
//        }
//
//    }
//    public By[] getRegisterLnameVal(){
//        if(lnameVal != null){
//            return new By[]{lnameVal};
//        }else{
//            return null;
//        }
//
//    }
//    public By[] getRegisterAddressVal(){
//        if(addressVal!=null){
//            return new By[]{addressVal};
//        }else{
//            return null;
//        }
//
//    }
//    public By[] getRegisterstateVal(){
//        if(stateVal!= null){
//            return new By[]{stateVal};
//        }else{
//            return null;
//        }
//
//    }
//
//    public By[] getRegisterCityVal(){
//        if(cityVal!=null){
//            return new By[]{cityVal};
//        }
//        else{
//            return null;
//        }
//
//    }
//    public By[] getRegisterZipCodeVal(){
//        if(zipVal!=null){
//            return new By[]{zipVal};
//        }else{
//            return null;
//        }
//
//    }
//    public By[] getRegisterSSNVal(){
//        if(ssnVal != null){
//            return new By[]{ssnVal};
//        }
//        else {
//            return null;
//        }
//
//    }
//
//
//    public By[] getRegisterUsernameVal(){
//        if(usernameVal!= null){
//            return new By[]{usernameVal};
//        }
//        else{
//            return null;
//
//        }
//
//    }
//    public By[] getRegisterPasswordVal(){
//        if(passVal!=null){
//            return new By[]{passVal};
//        }
//        else{
//            return null;
//        }
//
//    }
//
//    public By[] getRegisterconfirmVal(){
//        if(conpassVal!= null){
//            return new By[]{conpassVal};
//        }
//        else{
//            return null;
//        }
//
//    }

}
