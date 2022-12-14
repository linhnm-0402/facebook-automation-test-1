package vn.sunasterisk.facebookautomationtest.pagetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageTest  {
    public void loginFacebook(String email, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.facebook.com");
        WebElement emailElement = webdriver.findElement(By.xpath("//*[@id='email']"));
        emailElement.sendKeys(email);
        WebElement passElement = webdriver.findElement(By.xpath("//*[@id='pass']"));
        passElement.sendKeys(password);
        WebElement loginButton = webdriver.findElement(By.xpath("//*[@name='login']"));
        loginButton.click();
//        String nameButton = loginButton.getText();
//        System.out.println(nameButton);a.
        Thread.sleep(10000);
        String a = "Facebook";
        String t = webdriver.getTitle();
        if (a.equals(t)){
            System.out.println("[" + email + "] - [" + password + "] : Login thành công");
        }else {
            WebElement messageElement = webdriver.findElement(By.xpath("//*[@class='_9ay7']"));
            System.out.println("[" + email + "] - [" + password + "] : [" + messageElement.getText() +"]");
        }
        webdriver.close();
        webdriver.quit();
    }
}
