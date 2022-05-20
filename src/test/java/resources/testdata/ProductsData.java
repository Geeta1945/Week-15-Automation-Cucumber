package resources.testdata;

import org.testng.annotations.DataProvider;

public class ProductsData {
    /*
    | product | qty | size | colour |
| Blouse | 2 | M | White |
| Printed Dress | 3 | L | Orange |
| Printed Chiffon Dress | 4 | S | Green |
| Printed Summer Dress with Price $28.98 | 2 | M | Blue |
     */

    @DataProvider(name="products")
    public Object[][]getProductsData(){
        Object[][] product=new Object[][]{
                {"Blouse","2","M","White"},
                 {"Printed Dress","3","L","Orange"},
               {"Printed Chiffon Dress","4","S","Green"},
                {"Printed Summer Dress with Price $28.98","2","M","Blue"}


        };
        return product;
    }

}
