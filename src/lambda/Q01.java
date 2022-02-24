package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q01 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Angle");
        list.add("Andy");
        list.add("Ali");
        list.add("Emrah");
        list.add("Nilgun");
        System.out.println(list.stream()
                .filter(t -> t.startsWith("A"))
                .filter(t -> t.length() < 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
    }
//        2) "Q01" olarak adlandırılan bir class oluşturun
//        3) 5 String öğesi içeren bir String listoluşturun.
//        4) 3 tanesi "A" harfi ile başlayacak
//        5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunlukları
//        5'ten küçükse, konsolda list olarak buyuk harflerle yazdırın.
}
