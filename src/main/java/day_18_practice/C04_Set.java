package day_18_practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {

    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};

    //Set'ler uniquedir

    public static void main(String[] args) {

        int arr[]={1,2,2,3,4,4,5};

        benzersizYap(arr);

    }

    private static int[] benzersizYap(int[] arr) {

        Set<Integer> tekrarsizSet = new TreeSet<>();//Setlerde index yapısı yoktur bu sebeple for each kullandık

        for (int each:arr){
            tekrarsizSet.add(each);//Set'ler unique olduğu için elemanları direkt ekledik
        }
        System.out.println(tekrarsizSet);//[1, 2, 3, 4, 5]

        int arr2[] = new int[tekrarsizSet.size()];//tekrarsizSet in uzunluğu

        int idx = 0;

        for (Integer each:tekrarsizSet) {

            arr2[idx]=each;

            idx++;
        }
        System.out.println(Arrays.toString(arr2));


        arr = arr2;

        return arr;
    }
}