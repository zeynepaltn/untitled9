package MentorPractices;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter an integer");
        int results=scan.nextInt();
        for (int i = 1; i <=results ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }

    }
}
