import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest {

    @Test
    public void testA() {
        getDriver().navigate().to("http://www.google.com");
        Assert.assertEquals(getDriver().getTitle(), "Google");
    }

    @Test
    public void testB() {
        getDriver().navigate().to("http://www.yandex.com");
        Assert.assertEquals(getDriver().getTitle(), "Yandex");
    }

}
