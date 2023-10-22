import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class t {


    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            StringBuilder tem = new StringBuilder();
            tem.append(s.charAt(0));
            for (int k = i + 1; k < s.length(); k++) {
                tem.append(s.charAt(k));
            }
            if (isPalindrome(tem.toString()) && tem.length() > sb.length())
                sb = tem;
        }
        return sb.toString();
    }

    public boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
    }


    public static void main(String[] args) {

    }
}

