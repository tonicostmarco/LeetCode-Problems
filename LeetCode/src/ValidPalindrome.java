import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        List<Character> inverted = new ArrayList<>();
        List<Character> correct = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {

            correct.add(s.charAt(i));
            inverted.add(s.charAt(s.length() - 1 - i));

        }

        return correct.equals(inverted);

    }


    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";


        System.out.println(isPalindrome(s));

    }
}