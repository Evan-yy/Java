package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_true_sum1(){
        BaseDemo baseDemo = new BaseDemo();
        int i=10,j=20;
        int expected = i+j;
        assertEquals(expected,baseDemo.sum(i,j));
    }

    @Test
    public void should_return_true_sum2(){
        BaseDemo baseDemo = new BaseDemo();
        int i=-10,j=-20;
        int expected = -30;
        assertEquals(expected,baseDemo.sum(i,j));
    }


}
