import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/** Tiệp */
public class Bt7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8));
        List<Integer> integerList = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 != 0) {
               integerList.add(num);
            }
        }
        System.out.println(integerList);
    }
}
