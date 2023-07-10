package ssgpractice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplications {
    public static void main(String[] args) {
        //ex 3: Create an integer list and remove the duplications
        List<Integer> number=new ArrayList<>();
        number.add(2);
        number.add(3);
        number.add(3);
        number.add(2);
        number.add(5);
        number.add(7);
        System.out.println(number);
        for (int i = 0; i < number.size(); i++) {
            Integer el=number.get(i);

            if(number.indexOf(el)!=number.lastIndexOf(el)){
                number.remove(el);

            }

        }
        System.out.println(number);
    }//main
}//class
