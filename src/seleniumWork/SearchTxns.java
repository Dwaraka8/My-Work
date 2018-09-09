package seleniumWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchTxns 
{
	public static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		String exepath = "C:\\Users\\Denis\\Desktop\\selinium downloads\\Browser Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		driver = new ChromeDriver();
		String URL="https://www.halifax-online.co.uk/personal/logon/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='ie']/span[@id='accept']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.id("frmLogin:strCustomerLogin_userID")).sendKeys("dennis@123");
		driver.findElement(By.id("frmLogin:strCustomerLogin_pwd")).sendKeys("!Sm!ran%");
		driver.findElement(By.id("frmLogin:btnLogin2")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String[] Pwd_Chr_Xpaths= new String[3];
		Pwd_Chr_Xpaths[0] = "//div[@class='formFieldInner']//div[1]/label[@for='frmentermemorableinformation1:strEnterMemorableInformation_memInfo1']";
		Pwd_Chr_Xpaths[1] = "//div[@class='formFieldInner']//div[2]/label[@for='frmentermemorableinformation1:strEnterMemorableInformation_memInfo2']";
		Pwd_Chr_Xpaths[2] = "//div[@class='formFieldInner']//div[3]/label[@for='frmentermemorableinformation1:strEnterMemorableInformation_memInfo3']";
		
		String[] Drop_Down_List_Xpath=new String[3];
		Drop_Down_List_Xpath[0] = "//div[@class='formFieldInner']//div[1]/select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo1']";
		Drop_Down_List_Xpath[1] = "//div[@class='formFieldInner']//div[2]/select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo2']";
		Drop_Down_List_Xpath[2] = "//div[@class='formFieldInner']//div[3]/select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo3']";
		
		for(int i=0; i<Pwd_Chr_Xpaths.length;i++)
		{	
			WebElement pwd_chr = driver.findElement(By.xpath(Pwd_Chr_Xpaths[i].toString()));
			String Pwd_Character = pwd_chr.getText().substring(10).trim();
			System.out.println(Pwd_Character);		
			for(int j=i; j<Drop_Down_List_Xpath.length;)
			{
				selectCharPwd(Pwd_Character,Drop_Down_List_Xpath[j].toString());
				break;
			}
		}
		driver.findElement(By.id("frmentermemorableinformation1:btnContinue")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='View the latest transactions on your Ultimate Reward Current Account']")).click();
		driver.findElement(By.xpath("//a[@id='statement-search-button']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String Search_String = "Month";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Search_String);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='action-button-undefined search-statements-search-button']")).click();
		WebElement lbl_count = driver.findElement(By.xpath("//div[@class='search-statements-breadcrumb']/span[@tabindex='100']"));
		String record_count_number = lbl_count.getText();
		System.out.println(record_count_number);
		driver.findElement(By.xpath("//a[@id='modal-close']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Sign out']")).click();
	}
	public static void selectCharPwd(String Password_Character, String Drp_Dwn_xpth) throws Exception
	{
		int Parwd = Integer.parseInt(Password_Character);
		Select drp_dwn;

	      switch(Parwd) 
	      {
	         case 1 :
	        	 drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	        	 drp_dwn.selectByIndex(1); 
	            break;
	         case 2 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(2);
	 			break;
	         case 3 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(3);
	 			break;
	         case 4 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(4);
	 			break;
	         case 5 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(5);
	            break;
	         case 6 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(6);
	 			break;
	         case 7 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(7);
	 			break;
	         case 8 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(8);   //"&nbsp;a"
	 			break;
	         case 9 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(9);
	 			break;
	         case 10 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(10);
	 			break;
	         case 11 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(11);
	 			break;
	         case 12 :
	        	drp_dwn = new Select(driver.findElement(By.xpath(Drp_Dwn_xpth)));
	 			drp_dwn.selectByIndex(12);
	 			break;
	         default :
	            System.out.println("Invalid Password");
				
	      }

	}
}
