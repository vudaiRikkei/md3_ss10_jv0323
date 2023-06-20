import java.util.ArrayList;
import java.util.List;

/** Đặng Trường Giang */
public class Bt5 {
    public static void main(String[] args) {
        String str = "Bài tập: tìm chuỗi ngắn nhất trong đoạn văn bản.\n" +
                "Mục tiêu: luyện tập thao tác với list, và làm quen với 1 số hàm thao tác với string.\n" +
                "Đề bài: \n" +
                "Viết chương trình cho sẵn một đoạn văn hoặc một câu, và tìm ra chữ ngắn nhất (ít ký tự nhất) trong câu\n" +
                "Hướng dẫn: \n" +
                "-\tB1: tạo sẵn 1 string = 1 câu hoặc một đoạn văn\n" +
                "-\tB2: convert string đó thành list các string\n" +
                "-\tB3: tạo thêm một List có kdl là String để lưu trữ những phần tử đc tìm thấy\n" +
                "-\tB3: duyệt list trên bằng vòng lặp để tìm ra các phần tử có length nhỏ nhất.\n" +
                "-\tB4: in ra kết quả.\n";
        List<String> list = new ArrayList<>();

        String[] words = str.split(" ");
        for (String word:words
        ) {
            list.add(word);
        }
        int min =list.get(0).length();
        for(int i= 0; i< list.size();i++){
            if(list.get(i).length()<min){
                min= list.get(i).length();
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min){
                result.add(list.get(i));
            }
        }
        System.out.println("các từ có độ dài ngắn nhất là: "+ result);
    }
}
