package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static junit.framework.TestCase.assertNull;

@RunWith(Suite.class)
public class DemoTest {

    @Test
    public void demoTest() {
        assertNull("d",null);
    }

}
