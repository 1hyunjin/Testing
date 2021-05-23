import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;


public class MinTest {
    ArrayList<String> list = new ArrayList<String>();
    @Test
    void testNullList() {
        list = null;
        try {
            Min.min(list);
            System.out.println("null");
        }catch( NullPointerException e) {
            return;
        }
    }
    @Test
    void testNullElementwithMultipleElements() {
        list.add(null);
        list.add("aa");
//        try {
//            Min.min(list);
//        }catch( NullPointerException e) {
//            return;
//        }
        Min.min(list);

    }
    @Test
    void testNulllementwithMultipleElements2() {
        list.add("aa");
        list.add(null);
        list.add("bb");
    }

    @Test
    void testNullSingleElement() {
        list.add(null);
        try {
            Min.min(list);
        }catch( NullPointerException e) {
            return;
        }
    }

    @Test
    void testEmptyElement() {
        try {
            Min.min(list);
        }catch(IllegalArgumentException i) {
            return;
        }
    }

    @Test
    void testSingleElement() {

        list.add("aa");
        Object obj = Min.min(list);
        assertNotNull(Min.min(list));
        assertTrue(obj.equals("aa"), "false");
    }
    @Test
    public void testTwoElements() {
        list.add("bb");
        list.add("aa");
        Object obj = Min.min(list);
        assertEquals(true, obj.equals("aa"));
    }

    @Test
    public void testTwoElements2() {
        list.add("bb");
        list.add("aa");
        Object obj = Min.min(list);
        assertTrue(obj.equals("aa"), "false");
    }

}
