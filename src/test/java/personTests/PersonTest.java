package personTests;
import com.dz11.manandwoman.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {
    @Test
    public void testGetFirstName(){
        Person person = new Person();
        Assert.assertEquals(person.getFirstName(),"Anna", "This is a wrong name");
    }

    @Test
    public void testGetLastName(){
        Person person = new Person();
        Assert.assertEquals(person.getLastName(),"Smith", "This is a correct lastName");
    }
    @Test
    public void testGetAge(){
        Person person = new Person(); 
        Assert.assertEquals(person.getAge(),65, "This is man's age");
    }
    @Test
    public void testGetPartner(){
        Person person = new Person(); 
        Assert.assertEquals(person.getPartner(),"Mary", "This is a partner");
    }
}

