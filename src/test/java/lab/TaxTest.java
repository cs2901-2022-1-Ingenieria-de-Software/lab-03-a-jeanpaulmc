package lab;

import lab.demand.Order;
import lab.demand.Tax;
import org.testng.Assert;
import org.testng.annotations.Test;

import lab.demand.ManageDemand;

public class TaxTest {

    // Add Tests !
    @Test
    public void test01(){
        Order Pe1 = new Order("PE",10L);
        Assert.assertEquals(Pe1.getQuantity(),"PERU");
    }
    //setters y getters
    @Test
    public void test02(){
        Order Pe2 = new Order("Peru", 2L);
        Assert.assertEquals(Pe2.getCountry(),"Peru");
    }
    
}
