import java.util.ArrayList;

public class Bt14 {
    public static void main(String[] args) {
        int size = (int) (Math.random()*10 +1);

        System.out.println(size);
        ArrayList<ArrayList<Integer >> mang2chieu = new ArrayList(size);
        for (int i=0; i < size;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add( (int) (Math.random() * 100));
            }
            mang2chieu.add(row);
        }
        for (int i = 0; i < mang2chieu.size(); i++) {
            System.out.println(mang2chieu.get(i));



        }
    }
}
