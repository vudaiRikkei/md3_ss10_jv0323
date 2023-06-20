import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Long_JAV */

public class bt4 {
    public static void main(String[] args) {
        String str = "Rikkei Academy để nông dân biết code";
        List<String> list = new ArrayList<>();

        String[] words = str.split(" ");
        for (String word:words
             ) {
            list.add(word);
        }
        for (String word: words
             ) {
            if(word.length()>4){
                System.out.println(word);
            }
        }

    }
}
