package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutElement {
    private final WebDriver driver;

    private final By logoutLink = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");


    public logoutElement(WebDriver driver) {
        this.driver = driver;
    }

    public void getLogoutButton(){
        WebElement logoutLinkWeb = driver.findElement(logoutLink);
        logoutLinkWeb.click();
    }
}
