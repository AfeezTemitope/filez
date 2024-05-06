import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    @Test
    public void testThatArrayWillSort() {
        int[] sortedArray = Arrange.rearrange(new int[]{2, 9, 3, 1, 6});
        int[] expectedSort = { 1, 2, 3, 6, 9};
        assertArrayEquals(expectedSort, sortedArray);
    }
}
