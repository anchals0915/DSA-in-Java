
public class PalindormeString {
    public static void main(String[] args) {
        System.out.println( ispalindrome(""));
    }
    static boolean ispalindrome(String str) {
        if(str==null || str.length()==0  ) {
            return true ; 
        }
        str = str.toLowerCase().strip() ;
        int start = 0 ;
        int end = str.length()-1 ;
        while( start <= end/2) {
            if(str.charAt(start) != str.charAt(end)) {
                return false ;
            }
            start++ ;
            end--;
        }

        return true ;
    }
}

