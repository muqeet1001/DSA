import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotate_k {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        //step - 01
        int [] newarr = new int[k];
        int j = 0;
        for(int i = k+1;i<nums.length;i++ ){
            newarr[j] = nums[i];
            j++;
        }
       System.out.println(Arrays.toString(newarr));
        //step - 02
         

    }
}
