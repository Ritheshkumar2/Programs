package programs;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        System.out.println(test());
    }

    private static boolean test() {
        String s1 = "listen";
        String s2 = "silent";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length != c2.length) {
            return false;
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
