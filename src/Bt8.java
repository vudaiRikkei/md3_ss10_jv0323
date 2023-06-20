import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bt8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);
    }
}
