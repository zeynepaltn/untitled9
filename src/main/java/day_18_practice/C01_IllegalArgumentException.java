package day_18_practice;

import java.util.Scanner;

/* Kullanıcıdan yasını sisteme girmesini isteyiniz. Kullanıcı yas olarak 0'dan kucuk esit veya
  120'den buyuk esit bir sayı girerse IllegalArgumentException olusacak sekilde bir program yazınız
   */
public class C01_IllegalArgumentException {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();
        if(yas<=0 || yas>=120){
            try{
                throw new IllegalArgumentException();
            }catch(IllegalArgumentException e){
                System.out.println("exception firlatma, yoluna devam et");
            }

        }else{
            System.out.println("uygun bir yas girdiniz");
        }




    }

}
