package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="HomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="Sandbox_tet"
     )             
public class HomePage {

	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement Accounts;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts Menu']/lightning-icon/lightning-primitive-icon")
	public WebElement AccountTablist;
	@LinkType()
	@FindBy(linkText = "All Accounts")
	public WebElement AllAccountslist;
			
}
