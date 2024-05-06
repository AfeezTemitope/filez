import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {
    @Test
    public void testThatArrayWillSort() {
        int[] sortedArray = Arrange.rearrange(new int[]{2, -9, 3, 1, 6});
        int[] expectedSort = { -9, 1, 2, 3, 6};
        assertArrayEquals(expectedSort, sortedArray);
    }
    @Test
    public void testThatHigestWillMutiplyLowest() {
        int Multiple = MaxProduct.findMaxProduct(new int []{2, 6, 3, 1, -9, -8});
        int expectedSort = 72;
        assertEquals(expectedSort, Multiple);
    }
}
