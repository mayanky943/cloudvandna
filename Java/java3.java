import java.util.*;
import java.io.*;
class java3{
   public static boolean isPangram(String str) {
        boolean[] mp = new boolean[26];
        
        str = str.toLowerCase();
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                mp[c - 'a'] = true;
            }
        }

        for (boolean k : mp) {
            if (!k) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str = "The five boxing wizards jump quickly";

        boolean panagram = isPangram(str);

        System.out.println(panagram? "true":"false");
    }
}