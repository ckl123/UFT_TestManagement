package cthackathonscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cpsatexam 
{
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception 
	{
		
		cpsatexam();
	}
	public static void cpsatexam() throws Exception
	{
		
		//initiate browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		//Challenge 1 (One) – UI Testing ->Localization testing
		//Problem A Challenge 1
		//actual test:
		driver.get("https://cpsatexam.org/");
		driver.manage().window().maximize();
		WebElement menutoggle = driver.findElement(By.xpath(("//li[contains(@class,'slideout-toggle menu-item-align-right')]")));
		menutoggle.click();
		WebElement SelectOption = driver.findElement(By.xpath("//a[contains(text(),'Challenge 1')]"));
		SelectOption.click();
		WebElement HandlePopupAd =driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-298\"]/div[2]/i"));
		HandlePopupAd.click();
		WebElement Expand1 = driver.findElement(By.xpath("//div[@id='elementor-tab-title-2171']//i[@class='fas fa-plus fa-accordion-icon']"));
		Expand1.click();
		
		WebElement TamilExtract = driver.findElement(By.xpath("//*[@id=\"elementor-tab-content-2171\"]/p[2]"));
		TamilExtract.getText();
		System.out.println(TamilExtract.getText());
		Thread.sleep(10000);
			
		WebElement HindiExtract = driver.findElement(By.xpath("//*[@id=\"elementor-tab-content-2172\"]/p[2]"));
		HindiExtract.getText();
		System.out.println(HindiExtract.getText());
		Thread.sleep(10000);	
			
		WebElement KannadaExtract = driver.findElement(By.xpath("//*[@id=\"elementor-tab-content-2173\"]/p[2]"));
		KannadaExtract.getText();
		System.out.println(KannadaExtract.getText());
		Thread.sleep(10000);
		
		WebElement FrenchExtract = driver.findElement(By.xpath("//*[@id=\"elementor-tab-content-2174\"]/p[2]"));
		FrenchExtract.getText();
		System.out.println(FrenchExtract.getText());
		Thread.sleep(10000);
		
		driver.close();
		driver.quit();
	}
}
