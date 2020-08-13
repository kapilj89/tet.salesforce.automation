package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="vlocity_cmt__vlocityLWCOmniWrapper"                                
               , summary=""
               , connection="Sandbox_tet"
               , auraComponent="vlocityLWCOmniWrapper"
               , namespacePrefix="vlocity_cmt"
     )             
public class vlocity_cmt__vlocityLWCOmniWrapper {

	@ButtonType()
	@FindBy(xpath = ".//button[normalize-space(.)='Payment Schedule']")
	public WebElement paymentSchedule;
	
}
