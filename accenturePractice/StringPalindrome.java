package accenturePractice;

public class StringPalindrome {
    public static void main(String args[]){
    String str="abac";
    stringpalin(str);
    }

    private static void stringpalin(String str) {
        String org = str;
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

        if (rev.equals(org)) {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
