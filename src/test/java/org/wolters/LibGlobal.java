package org.wolters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	static WebDriver driver;
	public static void browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void open(String url) {	
		driver.get(url);
	}
	
	public static WebElement locatebyid(String id) {
		
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;	

	}
	
	public static WebElement loactebyname(String name) {
		
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;

	}
	
	public static WebElement data(WebElement element,String dat) {
		
		element.sendKeys(dat);
		return element;	
	}
	public static WebElement log(WebElement element) {
		
		element.click();
		return element;
	}
	
	public static String excelread(String path,String sheet,int row,int cell) throws IOException {
		
		File f = new File(path);
		FileInputStream strm = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(strm);
		Sheet s = b.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String s1 = null;
		int type = c.getCellType();
		if (type==1) {
			
			s1 = c.getStringCellValue();
			System.out.println(s1);
			
		}
		else if (type==0) {
			
			if (DateUtil.isCellDateFormatted(c)) {
				
				Date value = c.getDateCellValue();
				
				SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyy");
				s1 = sd.format(value);
				System.out.println(s1);
			}
			
			else {
				
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				s1 = String.valueOf(l); 
				System.out.println(s1);
			
		}	
		}
		return s1;
	}
	public static WebElement drop(WebElement element,String text) {
		
		Select s = new Select(element);
		s.selectByVisibleText(text);
		return element;	
	}
	public static String  excelwrite(String path,String sheet,int row,int cell,String range) throws IOException {
		
		File f = new File(path);
		FileInputStream strm = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(strm);
		Sheet s1 = b.createSheet(sheet);
		Row r = s1.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(range);
		FileOutputStream fout = new FileOutputStream(f);
		b.write(fout);
		System.out.println("done..");
		return range;
	
	}
	
	public static String data1(WebElement element) {
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
		
			
	}
	
	public static WebElement alert() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return null;
	}
	
	public static WebElement wait(By locator) {
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		return w.until(ExpectedConditions.visibilityOfElementLocated(locator));
	

	}
	public  static void close() {
		
		driver.close();

	}
}
