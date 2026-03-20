public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man , a plan , a canal Panama: ";
        s= s.toLowerCase();
          StringBuilder sb = new StringBuilder();


    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (Character.isLetterOrDigit(c)) {
            sb.append(c);
        }
    }
     int i = 0, j = sb.length() - 1;

    while (i < j) {
        if (sb.charAt(i) != sb.charAt(j)) {
             System.out.println("not valid palindorme");
             return;
        }
        i++;
        j--;
    }
         System.out.println("Valid ");
    }
}
