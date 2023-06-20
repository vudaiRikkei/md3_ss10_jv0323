import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** Nguyễn Tấn Phát */
public class Bt1 {
    public static void main(String[] args) {
        List<Integer> numberRandom = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numbers = (int) (Math.random()* 10);
            numberRandom.add(numbers);
        }
        System.out.println("Số lớn nhất là: "+ Collections.max(numberRandom) );
        System.out.println("Danh sách các số nguyên ngẫu nhiên là: " + numberRandom);

    }
}
