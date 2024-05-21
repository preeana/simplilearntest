package simplilearnjenkin;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;

@Test(priority=1)
public class LoginPg {

	public  void test1() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		   	driver.get("https://accounts.simplilearn.com/user/login?redirect_url=https%3A%2F%2Flms.simplilearn.com%2F");

	   WebElement UserName= driver.findElement(By.name("user_login"));
	   UserName.sendKeys("vpreethy@gmail.com");
	    WebElement Password= driver.findElement(By.id("password"));
	    Password.sendKeys("Selinium@1236");
	    //WebElement RememberMe = driver.findElement(By.className("rememberMe"));
	    WebElement LoginBtn = driver.findElement(By.name("btn_login"));
	    LoginBtn.click();
	    WebElement error_msg= driver.findElement(By.id("msg_box"));
	    String msg ="The email or password you have entered is invalid.";
	    if(error_msg.equals(msg))
	    {
	    System.out.println(error_msg);
	    }
	}

}
