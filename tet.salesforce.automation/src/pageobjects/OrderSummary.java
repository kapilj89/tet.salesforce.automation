package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="OrderSummary"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class OrderSummary {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 90)
	@PageWait.BackgroundActivity(timeoutSeconds = 90)
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//input[@name='input1']")
	public WebElement downPayment;

	@PageRow()
	public static class SelectDeliveryOptions {

		@BooleanType()
		@FindBy(xpath = ".//input")
		public WebElement checkbox;

		@TextType()
		@FindBy(xpath = ".//label//span[2]")
		public WebElement name;

	}

	@PageTable(row = SelectDeliveryOptions.class, firstRowContainsHeaders = false)
	@FindBy(xpath = "//c-product-delivery-options/div")
	public List<SelectDeliveryOptions> SelectDeliveryOptionsList;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 90)
	@PageWait.BackgroundActivity(timeoutSeconds = 90)
	@ButtonType()
	@FindByLabel(label = "Submit Order")
	public WebElement submitOrder;

	@TextType()
	@FindBy(xpath = "(//input[@type='text'])[6]")
	public WebElement DeliveryAddress;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 90)
	@ButtonType()
	@FindByLabel(label = "Go to Account")
	public WebElement goToAccount;

}
