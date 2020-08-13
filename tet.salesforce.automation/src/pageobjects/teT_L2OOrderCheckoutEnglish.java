package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="teT_L2OOrderCheckoutEnglish"                                
               , summary=""
               , connection="Admin"
               , auraComponent="teT_L2OOrderCheckoutEnglish"
               , namespacePrefix=""
     )             
public class teT_L2OOrderCheckoutEnglish {

	@TextType()
	@FindBy(xpath = "//td[contains(text(),'Credit Check Status')]/..//strong")
	public WebElement CreditCheckStatus;
	
}
