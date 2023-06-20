import java.util.*;

/** Bá Cường */
public class Bt9 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,2,1,2,3,4,5,3));
        Set<Integer> set = new HashSet<>(numbers);
        System.out.println(set);
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < numbers.size()-1; i++) {
//            for (int j = i+1; j < numbers.size(); j++) {
//                if(numbers.get(i) == numbers.get(j)){
//                    temp.add(numbers.get(i));
//                    break;
//                }
//            }
//        }
//        System.out.println(temp);
//        for (int i = 0; i < temp.size(); i++) {
//            numbers.remove(temp.get(i));
//        }
//        System.out.println(numbers);
    }
}
