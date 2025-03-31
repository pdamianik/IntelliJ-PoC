import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicArrayTest {
    @Test
    public void testAdd() {
        DynamicArray dynamicArray = new DynamicArray();
        assertEquals(3, dynamicArray.add(1, 2), "Add should result in 3 for 1 + 2");
    }
}
