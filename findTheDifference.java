package FindDifference;

import java.util.HashMap;


public class findTheDifference {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        char ch = new findTheDifference().findDifference(s, t);
        System.out.println(ch);
    }
    public char findDifference(String s, String t) {
        char ch = ' ';
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        char[] char_arr = s.toCharArray();
        for (int i = 0; i < char_arr.length; i++)
        {
            if (hmap.size() == 0)
            {
                hmap.put(char_arr[i], 1);
            }
            else
            {
                if (hmap.containsKey(char_arr[i]))
                {
                    int old_val = hmap.get(char_arr[i]);
                    hmap.replace(char_arr[i], old_val, old_val + 1);
                }
                else
                {
                    hmap.put(char_arr[i], 1);
                }
            }
        }
        char_arr = t.toCharArray();
        for (int i = 0; i < char_arr.length; i++)
        {
            ch = char_arr[i];
            if (hmap.size() > 0) 
            {
                if (hmap.containsKey(char_arr[i]))
                {
                    int old_val = hmap.get((char_arr[i]));
                    //remove the element from the map if the count reaches to 1
                    int new_val = old_val - 1;
                    if (new_val == 0)
                        hmap.remove(char_arr[i]);
                    else
                        hmap.replace(char_arr[i], old_val, new_val);
                }
                else
                {
                    break;
                }
                ch =' ';
            }
            else
            {
                break;
            }
        }
        return ch;
    }
}
