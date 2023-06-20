import java.util.Arrays;
import java.util.List;

/** Nguyễn Phi Hùng */

public class bt6 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,5,6,76,45,343,56);
        InsertionSort(number);
        System.out.println("========> " + number);
    }
    public static void InsertionSort (List<Integer> num){
        int n = num.size();
        for (int i = 0; i < n; i++) {
            int key = num.get(i);
            int j = i - 1;
            while (j >=0 && num.get(j) > key){
                num.set(j+1,num.get(j));
                j = j - 1;
            }
            num.set(j+1,key);
        }
    }
}
