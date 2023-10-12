package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class findTransactionsElements {

    //    16030
    private final WebDriver driver;





    private final By txnLink = By.xpath("//*[@id=\"leftPanel\"]/ul/li[5]/a");
    private final By findByTransactionId = By.xpath("//*[@id='criteria.transactionId']");

    private final By findByDate = By.xpath("//*[@id='criteria.onDate']");
    private final By findByDateRange1 = By.xpath("//*[@id=\"criteria.fromDate\"]");
    private final By findByDateRange2 = By.xpath("//*[@id=\"criteria.toDate\"]");
    private final By findByAmount = By.xpath("//*[@id=\"criteria.amount\"]");
    private final By findByTranIdButton = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[3]/button");
    private final By findByDateButton = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[5]/button");
    private final By findByRangeButton = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[7]/button");

    private final By findByAmountButton = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[9]/button");

    public findTransactionsElements(WebDriver driver) {
        this.driver = driver;
    }

    public void getFindTransaction(String txnId, String Date, String Amount) {




        clickTxnLink();
        getFindTransactionById(txnId);



        clickTxnLink();
        getFindTransactionByDate(Date);



        clickTxnLink();
        getFindTransactionByDateRange(Date, Date);


        clickTxnLink();
        getFindTransactionByAmount(Amount);




    }

    public void clickTxnLink() {
        try {
            Thread.sleep(3000); // 10,000 milliseconds = 10 seconds
        } catch (InterruptedException e) {
            // Handle the InterruptedException, for example, by logging it
            e.printStackTrace();
        }
        WebElement findTxnLink = driver.findElement(txnLink);
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(findTxnLink));

        findTxnLink.click();
    }

    public void getFindTransactionById(String tnx_id) {
        WebElement findByTnxId = driver.findElement(findByTransactionId);
        findByTnxId.sendKeys(tnx_id);

        WebElement findByTnxIdButton = driver.findElement(findByTranIdButton);
        findByTnxIdButton.click();




    }

    public void getFindTransactionByDate(String Date) {


        WebElement findByDateWeb = driver.findElement(findByDate);
        findByDateWeb.sendKeys(Date);

        WebElement findByDateButtonWeb = driver.findElement(findByDateButton);
        findByDateButtonWeb.click();


    }

    public void getFindTransactionByDateRange(String Date1, String Date2) {
        WebElement findByDateWeb1 = driver.findElement(findByDateRange1);
        findByDateWeb1.sendKeys(Date1);

        WebElement findByDateWeb2 = driver.findElement(findByDateRange2);
        findByDateWeb2.sendKeys(Date2);

        WebElement findByDateRangeButtonWeb = driver.findElement(findByRangeButton);
        findByDateRangeButtonWeb.click();


    }

    public void getFindTransactionByAmount(String amount) {
        WebElement findByAmountWeb = driver.findElement(findByAmount);
        findByAmountWeb.sendKeys(amount);


        WebElement findByAmountButtonWeb = driver.findElement(findByAmountButton);
        findByAmountButtonWeb.click();


    }


}
