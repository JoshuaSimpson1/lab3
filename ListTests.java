import java.security.spec.ECGenParameterSpec;
import java.util.List;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class ListTests {
    @Test
    public void testListSomething(){
        List<String> stringArray = new ArrayList<>();
        stringArray.add("hello");
        stringArray.add("world");
        stringArray.add("!");

        StringChecker sc = new StringCheckerTests();
        List<String> newStringArray = ListExamples.filter(stringArray, sc);

        List<String> expected = new ArrayList<>();
        expected.add("world");
        expected.add("!");
        assertEquals(expected, newStringArray);
    }
}

