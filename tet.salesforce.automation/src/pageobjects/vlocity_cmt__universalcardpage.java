package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Vlocity_cmt__universalcardpage"                                
               , summary=""
               , page="UniversalCardPage"
               , namespacePrefix="vlocity_cmt"
               , object=""
               , connection="Admin"
     )             
public class vlocity_cmt__universalcardpage {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(linkText = "Credit Limit")
	public WebElement creditLimit;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(linkText = "New Order")
	public WebElement newOrder;
	
}
