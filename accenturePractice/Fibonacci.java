package accenturePractice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int term, a=0,b=1,c;
        System.out.println("Enter your Number: ");
        term = sc.nextInt();
        for (int i = 0; i < term; i++) {
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
