public class Valid_Palindrome_2 {
    public static void main(String[] args) {
        String s = "abc";
         int n = s.length();
         int i =0;
         int j = n-1;
         while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(isValide(s, i+1, j)|| isValide(s, i, j-1)){
                    System.out.println("valid");
                    return;
                }
            }
             i++;
             j--;
         }
        
    }
    public static boolean isValide(String s,int l,int r){
        int n = s.length();
        int i = l;
        int j = r;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
              return false;
            }
            i++;
            j--;
        }
         return true;
    }
}
