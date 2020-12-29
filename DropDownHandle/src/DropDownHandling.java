import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arunachalam\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		/*Select daySelect = new Select(day);
		daySelect.selectByVisibleText("15");
		
		Select monthSelect = new Select(month);
		monthSelect.selectByVisibleText("May");
		
		Select yearSelect = new Select(year);
		yearSelect.selectByValue("1992");*/
		
		String dob = "15-Jan-1992";
		String dobArr[] = dob.split("-");
		
		selectValueFromDropDown(day,dobArr[0]);
		selectValueFromDropDown(month,dobArr[1]);
		selectValueFromDropDown(year,dobArr[2]);
	}
	
	public static void selectValueFromDropDown(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
}