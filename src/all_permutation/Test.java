package all_permutation;
//
public class Test {
    String prefix = "";
    int count = 1;
    int len;

    @org.junit.Test
    public void run() {
        String s = "abc";
        len = s.length();
        permute(s);
    }

    void permute(final String s) {
        if (s.length() >= 1) {
            for (int i = 0; i < s.length(); i++) {
                prefix = prefix.substring(0, len - s.length());
                prefix += s.charAt(i);
                permute(s.substring(0, i).concat(s.substring(i + 1)));
            }
        } else {
            System.out.println(count + ":" + prefix);
            count++;
        }

    }

}
