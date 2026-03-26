public class Main {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] alple = new int[26];

        for (int i = 0; i < s.length(); i++) {

            alple[s.charAt(i) - 'a']++;
            alple[t.charAt(i) - 'a']--;
        }

        for (int n : alple) {

            if (n != 0) {
                return false;
            }

        }

        return true;


    }


    public static void main(String[] args) {

        String s = "camarao";
        String t = "macarao";

        System.out.println(isAnagram(s, t));

    }
}