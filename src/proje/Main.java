package proje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
 public    static List<Ogrenci> ogListesi=new ArrayList<>();
    public static void main(String[] args) {
        ogrenciListesi();
        notaGoreSirala(80,90);
    }

    private static void notaGoreSirala(int alt,int ust) {
       // Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
        ogListesi.stream().sorted(Comparator.comparing(Ogrenci::getDiplomaNotu).reversed()).skip(alt-1).
                limit(ust-alt+1).forEach(System.out::println);

    }

    private static void ogrenciListesi() {
        ogListesi.add(new Ogrenci("ahmet","can",30,95.5,"Erkek"));
        ogListesi.add(new Ogrenci("ahmet","yarda",25,90,"Erkek"));
        ogListesi.add(new Ogrenci("Ayşe","can",21,82    ,"kadin"));
        ogListesi.add(new Ogrenci("Merve","Aslan",30,98.8,"Kadın"));
        ogListesi.add(new Ogrenci("Veli","Han",30,95.5,"Erkek"));
        ogListesi.add(new Ogrenci("Funda","funda",24,99.2,"Erkek"));
    }
}
