/* To find out whether the given String is Palindrome or not. */

public class Palindrome {
    public static void main(String[] args) {

        String str1 = "Anchal"   ; 
        System.out.println(palindrome1(str1) + "\t" + palindrome2(str1));

        String str2 = ""  ; 
        System.out.println(palindrome1(str2) + "\t" + palindrome2(str2));

        String str3 = "aabbaa"  ; 
        System.out.println(palindrome1(str3)+ "\t" + palindrome2(str3));

        String str4 = "madam"  ; 
        System.out.println(palindrome1(str4)+ "\t"+ palindrome2(str4));
     }

    //  Using While loop
    public static boolean palindrome1(String str) {
        if(str.length()<=0) {
            return false ;
        }
        int i = 0 ; 
        while (i<= (str.length()/2)) {
            if( str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false ;
            }
            i++ ; 
        }
        return true ; 
    }

    // Using StringBuilder 
    public static boolean palindrome2(String str) {
        if(str.length()<=0) {
            return false ;
        }
        StringBuilder buil = new StringBuilder(str) ;
        buil.reverse() ;
        String reverse = String.valueOf(buil).trim() ;
        return reverse.equals(str) ; 
    }
}