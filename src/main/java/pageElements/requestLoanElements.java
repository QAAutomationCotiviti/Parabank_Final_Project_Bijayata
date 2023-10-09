
package pageElements;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

public class requestLoanElements {
    private final WebDriver driver;


    private final By loanAmount = By.xpath("//*[@id=\"amount\"]");

    private final By  downPayment = By.xpath("//*[@id=\"downPayment\"]");

    private final By  applyButton = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input");


    private final By requestLink = By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a");

    private final By congratulationsMessage = By.xpath("//*[@id=\"rightPanel\"]/div/div/div/p[1]");
    private final By newAccountNo = By.xpath("//*[@id=\"newAccountId\"]");

    private final By loanProvider = By.xpath("//*[@id=\"loanProviderName\"]");
    private final By loanDate = By.xpath("//*[@id=\"responseDate\"]");
    private final By loanStatus = By.xpath("//*[@id=\"responseDate\"]");

    public requestLoanElements(WebDriver driver) {
        this.driver = driver;
    }



        public void ApplyForLoan(){

            WebElement requestLoanLink = driver.findElement(requestLink);
             requestLoanLink.click();

             WebElement loanAmountWeb = driver.findElement(loanAmount);
             loanAmountWeb.clear();
             loanAmountWeb.sendKeys("400");

            WebElement downPaymentWeb = driver.findElement(downPayment);
            downPaymentWeb.clear();
            downPaymentWeb.sendKeys("200");

            WebElement applyNowButton = driver.findElement(applyButton);
            applyNowButton.click();

//            loanRequestMessage();

        }

        public void loanRequestMessage(){

            WebElement congratulationsMessageWeb = driver.findElement(congratulationsMessage);

            WebElement newAccountNoWeb = driver.findElement(newAccountNo);

            WebElement loanProviderWeb = driver.findElement(loanProvider);

            WebElement loanDateWeb = driver.findElement(loanDate);
            WebElement loanStatusWeb = driver.findElement(loanStatus);

            System.out.println("-------"+congratulationsMessageWeb.getText()+"---------");

            System.out.println("Your new account number is:"+newAccountNoWeb.getText());

            System.out.println("Loan Provider:"+loanProviderWeb.getText());
            System.out.println("Date:"+loanDateWeb.getText());
            System.out.println("Status:"+loanStatusWeb.getText());


        }

}
