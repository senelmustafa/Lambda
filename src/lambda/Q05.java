package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05 {
    //         {"A", "B", "D", "C", "B", "A", "A", "B", "B"} gibi bir array oluşturun;
//         Tekrarlanan öğeleri konsolda yazdırın
    public static void main(String[] args) {
        List<String >list=new ArrayList<>(Arrays.asList("A", "B", "D", "C", "B", "A", "A", "B", "B"));
        list.stream().sorted().distinct().forEach(t->System.out.println(t));
    }
}