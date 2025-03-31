import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void testTruth() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.truth(), "The truth could not be determined");
    }
}
