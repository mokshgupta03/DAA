import org.junit.*;
public class test {
    @Test
    public void test()
    {
        rectangle rect= new rectangle(20,20);
        Assert.assertEquals("Square",rect.check());
    }
}
