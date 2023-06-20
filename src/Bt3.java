import java.util.*;

/** Hiếu Cà Mau */
public class Bt3 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(16,1651,31,651,651,61,6,1,61,351,3,16,165);
        Collections.sort(numberList, Comparator.reverseOrder());
        System.out.println(numberList);
    }
}
