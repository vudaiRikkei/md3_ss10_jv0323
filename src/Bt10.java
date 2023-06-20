import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bt10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,5,6,7);
        int sum = 0;
        for (Integer a:list) {
            sum += a;
        }
        System.out.println(sum);
    }
}
