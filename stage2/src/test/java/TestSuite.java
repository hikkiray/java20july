import com.sun.scenario.effect.Merge;
import org.junit.Assert;
import org.junit.Test;
public class TestSuite {
    @Test
    public void task4411test(){
        double actual;
        actual = Methods.task4411(11.13);
        Assert.assertEquals(18.13, actual, 0.0001);
        actual = Methods.task4411(-7919);
        Assert.assertEquals(-7912, actual, 0.0001);
    }
    @Test
    public void task2790test(){
        double actual;
        actual = Methods.task2790(6997);
        Assert.assertEquals(0.9205, actual, 0.0001);
    }
    @Test
    public void task3946test(){
        double actual;
        actual = Methods.task3946(new int[]{9,8,9,1,1,5,1,1});
        Assert.assertEquals(4.37500, actual, 0.0001);
    }
    @Test
    public void task9774test(){
        double m;
        double [] data;
        double[] expected;
        data = new double[]{9,8,7,6,5,4};
        expected = new double[]{279,248,217,186,155,124};
        m = 31;
        Methods.task9774(m, data);
        Assert.assertArrayEquals(expected,data,0.0001);

    }
    @Test
    public void task6291test(){
        boolean v;
         v = Methods.task6291(13,17,14);
        Assert.assertFalse(v);
         v = Methods.task6291(21,21,37);
        Assert.assertTrue(v);
         v = Methods.task6291(29,2,29);
        Assert.assertTrue(v);
         v = Methods.task6291(61,47,47);
        Assert.assertTrue(v);
        v = Methods.task6291(211,211,211);
        Assert.assertTrue(v);
    }
}
