package mainPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ItemSearch extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.id("gh-ac")).sendKeys("books", Keys.ENTER);
        Thread.sleep(2000);
    }

}
