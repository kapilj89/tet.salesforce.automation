package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Vlocity_cmt__ Hybrid CPQ"                                
               , summary=""
               , page="HybridCPQ"
               , namespacePrefix="vlocity_cmt"
               , object=""
               , connection="Admin"
     )             
public class vlocity_cmt__HybridCPQ {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//strong[contains(text(),'Split Payment Terms')]/../following-sibling::button//*[name()='svg']")
	public WebElement PaymentTerms;
	
	// Select Split Payment Terms option
	@PageRow()
	public static class SplitPaymentTerms {

		@TextType()
		@FindBy(xpath = ".//a")
		public WebElement termValue;

	}

	@PageTable(row = SplitPaymentTerms.class, firstRowContainsHeaders = false)
	@FindBy(xpath = "//div//ul[@class='slds-dropdown__list slds-dropdown_length-5']//li")
	public List<SplitPaymentTerms> SplitPaymentTermsList;

	// Select Product
	@PageRow()
	public static class Products {

		@TextType()
		@FindBy(xpath = ".//div[@class='slds-tile__detail']//span[contains(text(),'LIST PRICE ')]")
		public WebElement listPriceText;

		@TextType()
		@FindBy(xpath = ".//div[@class='slds-tile__detail']//span[contains(text(),'LIST PRICE ')]/following-sibling::span")
		public WebElement listPriceValue;

		@ButtonType()
		@FindBy(xpath = ".//button[contains(text(),'Add to Cart')]")
		public WebElement addToCart;
		
		@TextType()
		@FindBy(xpath = ".//div[@class='slds-media__body']//span")
		public WebElement productName;

	}

	@PageTable(row = Products.class, firstRowContainsHeaders = false)
	@FindBy(xpath = "//div[@class='slds-media cpq-product-item-container']")
	public List<Products> ProductsList;

	// To get list of all List Price Values
	// **********************************************************************
	WebDriver driver;

	public vlocity_cmt__HybridCPQ(WebDriver driver) {
		this.driver = driver;
	}

	public int count() {
		List<WebElement> listPriceValue = driver.findElements(By.xpath(
				"//div[@class='slds-tile__detail']//span[contains(text(),'LIST PRICE ')]/following-sibling::span"));

		return listPriceValue.size();

	}

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='3']")
	public WebElement option;

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Checkout']")
	public WebElement checkout;

	@TextType()
	@FindBy(xpath = "//div/input")
	public WebElement search;

	@ButtonType()
	@FindBy(xpath = "//span[contains(text(),'Apdrošināšana Dzintars (3MT)')]/../../..//button[contains(text(),'Add to Cart')]")
	public WebElement Insurance;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(linkText = "Configure")
	public WebElement configure;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//ng-include/div/div/ng-include//button[normalize-space(.)='Show Actions']")
	public WebElement showActions;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Insurance Term']/following-sibling::div//select")
	public WebElement insuranceTerm;
	
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Insurance Term']/following-sibling::div//select")
	public WebElement warrantyTerm;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement close;

	@ButtonType()
	@FindBy(xpath = "//span[contains(text(),'Papildus garantija Sudrabs Plus')]/../../..//button[contains(text(),'Add to Cart')]")
	public WebElement Warranty;
	
	

	

}
