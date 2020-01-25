package com.actiTime.Genirices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibToReadData 
{
	/**
	 * 
	 * @param path // we use path as varibel since we have only one path
	 * @param Key
	 * @return
	 * @throws IOException
	 */

	public String getPropertyData(String path, String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		String Data = p.getProperty(Key);
		return Data;
		
	}
	
	/**
	 * 
	 * @param path // we hard code the path since we have mutiple property files and each time we use diffrent
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	
	public String getPropertyValue(String path,String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./CommanData/commanproperty.properties");
		Properties p1 = new Properties();
		p1.load(fis);
		String value = p1.getProperty(Key);
		return value;
      
	}
	
	 /**
     * To read the data from excel sheet
     * @param path // we use path as varibel since we have only one path
     * @param sheetname
     * @param rownum
     * @param cellnum
     * @return
     * @throws IOException 
     * @throws EncryptedDocumentException 
     */
	public String getExcelData(String path, String sheetname,int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook WB = WorkbookFactory.create(fis);
		String getExcelValue = WB.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return getExcelValue;
		
	}
	
	/**
     * To read the data from excel sheet
     * @param path // we hard code the path since we have mutiple property files and each time we use diffrent
     * @param sheetname
     * @param rownum
     * @param cellnum
     * @return
     * @throws IOException 
     * @throws EncryptedDocumentException 
     */
	public String getExcelValue(String path, String sheetname,int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./CommanData/DatatDriven_Excel Worksheet.xlsx");
		Workbook WB = WorkbookFactory.create(fis);
		String getExcelValue = WB.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return getExcelValue;
		
	}
}
