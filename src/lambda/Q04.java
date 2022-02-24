package lambda;

import java.util.*;

public class Q04 {
    //        3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öğelerini içeren bir Dize listesi oluşturun



    public  static void main(String[] args) {
        List<String> list=new ArrayList<String>(Arrays.asList("Ali","john","Ali","Alexander", "Taylor", "Ali", "Jackson"));
        System.out.println(list.toString());

        System.out.println("*  4) \"J\" ile baslayin olan öğeleri almayın");

        System.out.println("/** 5) Farklı öğeleri seçin");
        list.stream().distinct().forEach(t->System.out.println(t));

        System.out.println("***  6)Karakter sayısına göre doğal sıraya koyun");
        list.stream().sorted(Comparator.comparing(t->t.length())).distinct().forEach(t->System.out.println(t));

        System.out.println("**** 7) Tüm öğeleri büyük harfe dönüştürün");
        list.stream().map(t->t.toUpperCase()).distinct().forEach(t->System.out.print(" -"+t));
        System.out.println("\n***** 8) Konsoldaki öğeleri yazdırın");

        System.out.println("****** 9)Fonksiyonel Programlama'yı kullanın");




    }

}
