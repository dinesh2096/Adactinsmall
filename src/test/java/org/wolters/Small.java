package org.wolters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WdmAgent;

public  class Small extends LibGlobal {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		browser();
		open("http://adactinhotelapp.com/");
		Login l = new Login();
		data(l.getUser(), l.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 0, 1));	
		data(l.getPass(), l.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 1, 1));
		log(l.getLogin());
		Search s = new Search();
		drop(s.getLocation(), s.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 2, 1));
		drop(s.getHotels(), s.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 3, 1));
		drop(s.getRoom(), s.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 4, 1));
		drop(s.getNos(), s.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 5, 1));
		data(s.getIn(), s.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 6, 1));
		data(s.getOut(), s.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 7, 1));
		drop(s.getAdult(), s.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 8, 1));
		drop(s.getChild(), s.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 9, 1));
		log(s.getSubmit());
		SelectHotel sh = new SelectHotel();
		log(sh.getRadio());
		log(sh.getCont());
		Book b = new Book();
		data(b.getFirst(), b.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 10, 1));
		data(b.getLast(), b.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 11, 1));
		data(b.getAddress(), b.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 12, 1));
		data(b.getCc(),b.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 13, 1));
		data(b.getType(), b.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 14, 1));
		data(b.getMonth(), b.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 15, 1));
		data(b.getYear(), b.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 16, 1));
		data(b.getCvv(), b.excelread("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "Sheet1", 17, 1));
		log(b.getNow());
		Id i = new Id();
		String d = data1(i.getOrder());
		i.excelwrite("C:\\Users\\dinesh.govindaraj\\eclipse-workspace\\SmallAdactin\\File\\Book.xlsx", "sheet2", 0,1,d);
		Cancel c = new Cancel();
		log(c.getItinerary());
		log(c.getCheck());
		log(c.getCancel());
		alert();
		close();
	
		
		
		
		
		
	}

	
}
