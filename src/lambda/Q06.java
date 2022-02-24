package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q06 {
    //Fonksiyonel Programlama ile [12, 9, 13, 4, 6, 2, 4, 12, 15] listesindeki tüm tek sayıları yazdırın
    //6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
    //Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz

    public static void main(String[] args){

        List<Integer>list=new ArrayList<Integer>(Arrays.asList(12,9,13,4,6,2,4,12,15));
        System.out.println("1-)tüm tek sayıları yazdırın");
        list.stream().filter(t->(t % 2) == 1 ).forEach(t->System.out.print(t+" -"));

        System.out.println("\n\n2-) 6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz");
        list.stream().filter(t->(t > 6 )&&( t<14)).sorted().forEach(t->System.out.print(t+" -"));

        System.out.println("\n\n3-Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz");
        list.stream().filter((t->(t % 2) ==1)).map(Math::sqrt).forEach(t->System.out.print(t));
    }
}
