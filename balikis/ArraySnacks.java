import java.util.Collections;
import java.util.List;
public class ArraySnacks {


    public static Integer largestElement(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Collections.max(list);
    }
}