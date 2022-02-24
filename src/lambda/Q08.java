package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {
    // 7 ile bolunebilen ilk 10 tamsayinin toplamini ekrana yazdiriniz.
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(Arrays.asList(14,24,28,35,56,49,100,115,121,777,328));
        list.stream().rangeClosed(1,10).filter(t->t %7==0).Map(match::sum);


    }
}
