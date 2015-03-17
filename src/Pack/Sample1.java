package Pack;
 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class Sample1
{
	String testName = "";
    @Test(groups = { "group-one","group-two" })
    public void testMethodOne() {
        System.out.println("Test method one belonging to group.");
    }
 
    @Test(groups = { "group-one" })
    public void testMethodTwo() {
        System.out.println("Test method two belonging to both group.");
    }
 
    @Test(groups = { "group-two" })
    public void testMethodThree() {
        System.out.println("Test method three belonging to group.");
        
    }
    @BeforeTest
    @Parameters({ "testname" })
    public void beforeTest(String testname) {
        this.testName = testName;
        long id = Thread.currentThread().getId();
        System.out.println("parameter test " + testname) ;
    }
}