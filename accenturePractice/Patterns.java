package accenturePractice;
import java.util.Scanner;

public class Patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k=1;
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}