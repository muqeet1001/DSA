import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
         int[] digits = {9,8,7,6,5,4,3,2,1,0};
         int d = 0;
         for(int i =0;i<digits.length;i++)
             d = d*10 +digits[i];
            System.out.println(d);
            d= d+1;
            int tempd =d;
            int count = 0;
            while (tempd>0) {
                count++;
                tempd = tempd/10;
            }
            int [] newarr = new int[count];

            for(int i =newarr.length-1 ; i>=0;i--){
                int last = d%10;
                newarr[i] = last;
               d= d/10;
            }
        System.out.println(Arrays.toString(newarr));
      
    }
    
}
