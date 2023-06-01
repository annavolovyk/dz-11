package manandwomantests;

import com.dz11.manandwoman.Man;
import com.dz11.manandwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

    @Test
    public void testIsRetired(){
        Woman woman = new Woman("Mary", "Smith", 65, "Alex");
        Assert.assertTrue(woman.isRetired(),"Can be retired");

    }

    @Test
    public void testRegisterPartnership(){
            Woman woman = new Woman("Mary", "Smith", 62, "Alex");
            ssert.assertEquals(woman.getPartner(), "Register Partnership");
    }
    @Test
    public void testDeregisterPartnership(){
        Woman woman = new Woman("Mary", "Smith", 62, "Alex");
        ssert.assertNull(woman.deregisterPartnership());
    }
}
