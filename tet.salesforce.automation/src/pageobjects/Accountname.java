package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Accountname"                                
               , summary=""
               , connection="Sandbox_tet"
               , object=""
     )             
public class Accountname {
	
@LinkType()

@FindBy(xpath = "//*[@data-aura-class='forceInlineEditGrid']/table/tbody/tr/th/span/a")

public WebElement lnkAccountname;
}
