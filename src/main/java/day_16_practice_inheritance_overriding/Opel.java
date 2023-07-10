package day_16_practice_inheritance_overriding;

import java.util.PropertyResourceBundle;

public class Opel extends Araba {
    protected String hiz="Opel arabalar max 200m/h hiz yapar";
    protected String marka="Opel";
    protected String sirketMerkezi="Almanya";

    protected void motor(){
        System.out.println("OPEL ARABALAR, OPEL MARKA MOTOR KULLANIR");
    }

    protected void garanti(){
        System.out.println("OPEL ARABALAR IKI YIL GARANTILIDIR");
    }

}//class
