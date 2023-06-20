import java.util.ArrayList;
import java.util.List;

/** Võ Văn Duy */
public class Bt2 {
    public static void main(String[] args) {
        List<Integer> numberRandom = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numbers = (int) (Math.random()* 10);
            numberRandom.add(numbers);
        }
        System.out.println(numberRandom);
        List<Integer> arrayListNumber = new ArrayList<>();

        for (int i=9;i>=0;i--){
            arrayListNumber.add(numberRandom.get(i));
        }
        System.out.println(arrayListNumber);
    }
}
