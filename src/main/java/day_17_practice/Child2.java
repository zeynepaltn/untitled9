package day_17_practice;

import java.sql.SQLOutput;

// Parent2 isminde bir class olusturunuz
// Child2 class'ı, Parent2 class'a extends ediniz
// Child2 class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
// super() constructor'u kullanarak Parent2' den ekran cıktısı alınız
public class Child2 extends Parent2 {
    public Child2(int i) {
        super();    //extends yapilan class'lardaki  tum constr'larin ilk satirinda biz gormesek de
                   //super() const call vardir. Dolayisi ile once parent class'daki const calisir.
        System.out.println("Child Class tek parametreli constructor");

    }

    public Child2() {
        super();
        System.out.println("Child class parametresiz constructor");
    }

    public Child2(int a, int b) {
        super(5,10,15);
        System.out.println("Child class iki parametreli constructor");
    }

    public static void main(String[] args) {

        Child2 obj1=new Child2();
        Child2 obj2=new Child2(1);
        Child2 obj3=new Child2(2,3);

    }


}
