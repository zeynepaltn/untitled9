package day7practices;
// Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
// ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

// Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

// Ortalamadan daha buyuk olan array elemanlarını yazdırınız

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[4];


        for (int i = 0; i < 4; i++) { //kullanicidan 4 tane rakam alacagimiz icin, 0'dan 4'e kadar for dongusune aldik
            System.out.println("Bir rakam giriniz");
            int rakam= scan.nextInt();
            arr[i]=rakam;//kullanicidan aldigimiz her rakami sirasiyla array'e assign ettik
        }
        System.out.println(Arrays.toString(arr));

        double toplam=0;
        for(int each: arr){
            toplam=toplam+each;
        }
        double ortalama=toplam/arr.length;

        System.out.println("ortalama="+ortalama);
        for (int each:arr) {
            if(each>ortalama){
                System.out.print("ortalamadan buyuk sayilar "+each+" ");
            }

        }


    }//main
}//class
