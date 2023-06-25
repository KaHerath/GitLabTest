import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {

    @Test
    public void test1() {
        getDriver().navigate().to("http://www.google.com");
        Assert.assertEquals(getDriver().getTitle(), "Google");
    }

    @Test
    public void test2() {
        getDriver().navigate().to("http://www.google.com");
        Assert.assertEquals(getDriver().getTitle(), "Google");
    }

    @Test
    public void test3() {
        getDriver().navigate().to("http://www.google.com");
        Assert.assertEquals(getDriver().getTitle(), "Google");
    }

}
