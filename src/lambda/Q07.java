package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q07 {
    //String isimlerden olusan bir list olusturnuz
    //List'deki isimlerden kelimenin içinde hem"a" hem "n" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
    //List'deki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdirin
public static void main(String[] args){

    List<String> list = new ArrayList<String>(Arrays.asList("an","na","ayn","canan","murat","kempl"));

   // System.out.println(list.stream().map(t->t.toLowerCase()).filter(t -> t.contains("a") && t.contains("n")).mapToInt(t -> t.length()).sum());
   // list.stream().map(t->t.toLowerCase()).filter(t-> t.charAt(0)>t.charAt(t.length()-1)).forEach(t->System.out.println(t));

    System.out.println(list.stream().filter(t->t.contains("a")).mapToInt(t -> t.length()).sum());
   // list.stream().sorted(Comparator.comparing(t-> t)).forEach(t->System.out.println(t)); // bütün kelimeleri a-z sıralıyor
   list.stream().map(t->t.toLowerCase()).filter(t->t.charAt(0)<t.charAt(t.length()-1)).forEach(t->System.out.println(t));

   //System.out.println("  1-List'deki isimlerden \"a\" ve \"n\" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz");
   //list.stream().filter(t -> t.contains("a") && t.contains("n")).mapToInt(t -> t.length()).sum();
   /* list.stream()
            .filter(t->t.toLowerCase()
                    .charAt(0)<t.charAt(t.length()-1))
            .map(t->t)
            .forEach(System.out::println);
*/

}
}
/*



 */