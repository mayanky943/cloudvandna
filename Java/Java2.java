import java.util.*;
import java.io.*;
import java.util.HashMap;

public class Java2 {
    public static int romanToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int res = 0;
        int prev = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            int curr = mp.get(str.charAt(i));
            if (curr < prev) {
                res -= curr;
            } else {
                res += curr;
            }
            prev = curr;
        }

        return res;
    }

    public static void main(String[] args) {
        String roman = "VIII"; 
        System.out.println(romanToInt(roman));
    }
}

