import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class application {
    static String href = "";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://gomelschool11.by/");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("dt-btn-8"));

        href = element.getAttribute("href");
        driver.get(href);
        Thread.sleep(3000);
        WebElement name = driver.findElement(By.className("wpcf7-validates-as-required"));
        name.sendKeys("Emma");
        Thread.sleep(4000);
        element = driver.findElement(By.className("branding"));
        element.findElements(By.xpath("./child::*")).forEach(innerElem -> {
            if(innerElem.getAttribute("href") != null)
                href = innerElem.getAttribute("href");
        });
        driver.get(href);
        Thread.sleep(4000);
        element = driver.findElement(By.className("post-entry-content"));
        element.findElements(By.xpath("./child::*")).forEach(innerElem -> {
            if(innerElem.getAttribute("href") != null)
                href = innerElem.getAttribute("href");
        });
        driver.get(href);
    }
}
