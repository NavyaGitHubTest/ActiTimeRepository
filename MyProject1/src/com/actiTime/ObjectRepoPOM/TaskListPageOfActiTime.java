package com.actiTime.ObjectRepoPOM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPageOfActiTime 
{

	@FindBy(xpath=".//div[.='']")
	private WebElement AddNewBTN;
	
	@FindBy(xpath=".//div[.='']")
	private WebElement NewCUSTOMER;
	
	// xpath - text function , contains function and attribute function
	
	@FindBy(xpath=".//textarea[contains(@placeholder,'')]")
	private WebElement EnterCustNameTBX;
	
	@FindBy(xpath=".//textarea[contains(@placeholder,'')]")
	private WebElement DiscriptionTBX;
	
	@FindBy(xpath="//div[@class='']")
	private WebElement CustListBX;
	
	@FindBy(xpath=".//div[.='' and conatins(@class,'')]")
	private WebElement SelectCompany;
	
	@FindBy(xpath=".//div[conatins(@class,'') and contains(.,'')]")
	private WebElement createCUSTBTN;
	
	@FindBy(xpath=".//div[@class,'']/div[@class='']")
	private WebElement NewCUST;
	
	// getter and setter method
	
	public WebElement getAddNewBTN() {
		return AddNewBTN;
	}

	public void setAddNewBTN(WebElement addNewBTN) {
		AddNewBTN = addNewBTN;
	}

	public WebElement getNewCUSTOMER() {
		return NewCUSTOMER;
	}

	public void setNewCUSTOMER(WebElement newCUSTOMER) {
		NewCUSTOMER = newCUSTOMER;
	}

	public WebElement getEnterCustNameTBX() {
		return EnterCustNameTBX;
	}

	public void setEnterCustNameTBX(WebElement enterCustNameTBX) {
		EnterCustNameTBX = enterCustNameTBX;
	}

	public WebElement getDiscriptionTBX() {
		return DiscriptionTBX;
	}

	public void setDiscriptionTBX(WebElement discriptionTBX) {
		DiscriptionTBX = discriptionTBX;
	}

	public WebElement getCustListBX() {
		return CustListBX;
	}

	public void setCustListBX(WebElement custListBX) {
		CustListBX = custListBX;
	}

	public WebElement getSelectCompany() {
		return SelectCompany;
	}

	public void setSelectCompany(WebElement selectCompany) {
		SelectCompany = selectCompany;
	}

	public WebElement getCreateCUSTBTN() {
		return createCUSTBTN;
	}

	public void setCreateCUSTBTN(WebElement createCUSTBTN) {
		this.createCUSTBTN = createCUSTBTN;
	}

	public WebElement getNewCUST() {
		return NewCUST;
	}

	public void setNewCUST(WebElement newCUST) {
		NewCUST = newCUST;
	}

	public TaskListPageOfActiTime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
}
