package randomPOmClass;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import objectRepo.HomePage;
import objectRepo.ProductsPage;

@Listeners(genericUtilities.ListnersImplementation.class)

public class CreateProducts extends BaseClass{
	
	@Test
	public void createProducts() throws InterruptedException, IOException
	{
	
		
		ExcelFileUtility eu= new ExcelFileUtility();
		String Name = eu.excelDheet("CAMPAIGN", 0, 1);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnProductBtn();
		
		ProductsPage pp= new ProductsPage(driver);
		pp.createProduct(Name);
		//validation
		if (pp.getNameTxtFld().contains(Name)) {
			
		}
		
	}

}
