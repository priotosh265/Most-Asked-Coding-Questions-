package accenturePractice;

import java.util.Scanner;

// search big number + index also

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,2,56,78,95,45,3};
        int a=0,b=0;
        int i;
        for( i=0; i<7;i++){
            if (arr[i]>a){
                a=arr[i];
                b=i;
            }
        }
        System.out.println(a+" "+b);
    

    }
}
