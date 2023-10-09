package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerElement {

    private final WebDriver driver;

    private final By firstName = By.xpath("//*[@id=\"customer.firstName\"]");

    private final By  lastName = By.xpath("//*[@id=\"customer.lastName\"]");

    private final By Address = By.xpath("//*[@id=\"customer.address.street\"]");

    private final By  City = By.xpath("//*[@id=\"customer.address.city\"]");

    private final By  state = By.xpath("//*[@id=\"customer.address.state\"]");
    private final By  ZipCode = By.xpath("//*[@id=\"customer.address.zipCode\"]");
    private final By phone = By.xpath("//*[@id=\"customer.phoneNumber\"]");


    private final By  SSN = By.xpath("//*[@id=\"customer.ssn\"]");

    private final By  Username = By.xpath("//*[@id=\"customer.username\"]");

    private final By Password = By.xpath("//*[@id=\"customer.password\"]");
    private final By  confirm = By.xpath("//*[@id=\"repeatedPassword\"]");

    private final By  registerButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    private final By  registerLink = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");


    private final By  fnameVal = By.id("customer.firstName.errors");
    private final By  lnameVal = By.id("customer.lastName.errors");
    private final By  addressVal = By.id("customer.address.street.errors");
    private final By  cityVal = By.id("customer.address.city.errors");
    private final By  stateVal = By.id("customer.address.state.errors");
    private final By  zipVal = By.id("customer.address.zipCode.errors");

    private final By  ssnVal = By.id("customer.ssn.errors");
    private final By  usernameVal = By.id("customer.username.errors");
    private final By  passVal = By.id("customer.password.errors");
    private final By  conpassVal = By.id("repeatedPassword.errors");

    public By[] getRegisterLink(){
        return new By[] {registerLink};
    }
    public By[] registerButton (){
        return new By[]{registerButton};
    }

    public registerElement(WebDriver driver) {
        this.driver = driver;
    }


public By[] getRegisterInput(){
    return new By[]{firstName, lastName, Address, state, City, ZipCode,SSN, phone, Username, Password, confirm  };
}
//


//    public By[] getRegisterInputValidation(){
//        return new By[]{fnameVal, lnameVal, addressVal, cityVal, stateVal, zipVal, ssnVal, usernameVal, passVal, conpassVal  };
//    }

    public By[] getRegisterFnameVal(){
        if(fnameVal!= null){
            return new By[]{fnameVal};
        }
        else{
            return null;
        }

    }
    public By[] getRegisterLnameVal(){
        if(lnameVal != null){
            return new By[]{lnameVal};
        }else{
            return null;
        }

    }
    public By[] getRegisterAddressVal(){
        if(addressVal!=null){
            return new By[]{addressVal};
        }else{
            return null;
        }

    }
    public By[] getRegisterstateVal(){
        if(stateVal!= null){
            return new By[]{stateVal};
        }else{
            return null;
        }

    }

    public By[] getRegisterCityVal(){
        if(cityVal!=null){
            return new By[]{cityVal};
        }
        else{
            return null;
        }

    }
    public By[] getRegisterZipCodeVal(){
        if(zipVal!=null){
            return new By[]{zipVal};
        }else{
            return null;
        }

    }
    public By[] getRegisterSSNVal(){
        if(ssnVal != null){
            return new By[]{ssnVal};
        }
        else {
            return null;
        }

    }


    public By[] getRegisterUsernameVal(){
        if(usernameVal!= null){
            return new By[]{usernameVal};
        }
        else{
            return null;

        }

    }
    public By[] getRegisterPasswordVal(){
        if(passVal!=null){
            return new By[]{passVal};
        }
        else{
            return null;
        }

    }

    public By[] getRegisterconfirmVal(){
        if(conpassVal!= null){
            return new By[]{conpassVal};
        }
        else{
            return null;
        }

    }



}
