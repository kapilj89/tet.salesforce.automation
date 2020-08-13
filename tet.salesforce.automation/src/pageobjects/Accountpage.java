package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Accountpage"                                
     , summary=""
     , relativeUrl=""
     , connection="Sandbox_tet"
     )             
public class Accountpage {

	@TextType()
	@FindBy(xpath = "//span/span[normalize-space(.)='All Accounts']")
	public WebElement AllAccountlist;
			
}
