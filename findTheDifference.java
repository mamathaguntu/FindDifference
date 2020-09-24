package FindDifference;

public class findTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char ch = new findTheDifference().findDifference(s, t);
        System.out.println(ch);
    }
    public char findDifference(String s, String t) {
        char ch = ' ';
        char[] c = t.toCharArray();
        for (int i = 0; i < c.length; i++)
        {
            if (s.indexOf(c[i]) < 0)
            {
                ch = c[i];
                break;
            }
        }
        return ch;
    }
}
