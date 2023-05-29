package manandwomantests;

import com.dz11.manandwoman.Man;
import com.dz11.manandwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

    @Test
    public void testIsRetired(){
        Woman woman = new Woman("Mary", "Smith", 62, "Alex");
        Assert.assertEquals(woman.isRetired(),55,"Cannot be retired");

    }

    @Test
    public void testRegisterPartnership(){
            Woman woman = new Woman("Mary", "Smith", 62, "Alex");
            Assert.assertEquals(woman.registerPartnership(), "Alex", "Registered");
    }
    @Test
    public void testDeregisterPartnership(){
        Woman woman = new Woman("Mary", "Smith", 62, "Alex");
        Assert.assertEquals(woman.deregisterPartnership(), "Mike", "Deregister");
    }
}
