package day9practises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {
            /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */

        List <Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>10){
                list.set(i,list.get(i)*2);

            }

        }
        System.out.println(list);

//@. method bu sekilde de olur
//
//        for (int w:list){
//            if (w>10){
//                System.out.print(w*2 +" ");
//            }else{
//                System.out.print(w +" ");
//            }
//        }



    }//main
}//class
