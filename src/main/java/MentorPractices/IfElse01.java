package MentorPractices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender");
        String gender= input.next();
        System.out.println("Please enter your age");
        int age= input.nextInt();
        if(gender.equalsIgnoreCase("female")&& age>=60){
            System.out.println("you can retire");}

            if(gender.equalsIgnoreCase("male")&& age>=65){
                System.out.println("you can retire");

            }else{
                System.out.println("you cannot retire");
        }


    }//main
}//class
