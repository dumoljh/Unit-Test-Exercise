package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseDemoTest {


    @Test
    public void should_return_hello_world() {

        BaseDemo baseDemo = new BaseDemo();
        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());

    }

    @Test
    public void should_return_sum() {

        BaseDemo baseDemo = new BaseDemo();

        assertEquals(10, baseDemo.sum(5, 5));
        assertFalse(baseDemo.sum(1, 10) == 2);

    }

    @Test
    public void should_return_true_when_sum_is_incorrect() {

        BaseDemo baseDemo = new BaseDemo();

        assertFalse(baseDemo.sum(1, 10) == 2);

    }
}

