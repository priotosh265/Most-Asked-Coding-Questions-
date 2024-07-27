package accenturePractice;

import java.util.Scanner;
import java.lang.*;

public class RevesrseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "sreesa is food";
        String strRev = "";
        for (int i = 0; i < str.length(); i++) {
            strRev = str.charAt(i) + strRev;
        }
        System.out.println(strRev);
    }
}
