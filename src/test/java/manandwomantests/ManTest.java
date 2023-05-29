package manandwomantests;
import com.dz11.manandwoman.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest {
    @Test
    public void getIsRetired(){
        Man man = new Man("Alex", "Smith", 65, "Mary");
        Assert.assertEquals(man.isRetired(),66,"Can be retired");

    }
}
