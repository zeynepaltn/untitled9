package ssgpractice;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArraylist {
    public static void main(String[] args) {
    //Ex 1:Create a String at 6 elements into it, remove the elemnt whose length is less than 5
        List<String > myList=new ArrayList<>();
        myList.add("Saliha");
        myList.add("Can");
        myList.add("Sema");
        myList.add("Zeynep");
        myList.add("Asli");
        myList.add("Ramazan");
        System.out.println(myList);
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i).length()<5){
               myList.remove(myList.get(i));
               i--;
            }

        }
        System.out.println(myList);

    }//main
}//class
