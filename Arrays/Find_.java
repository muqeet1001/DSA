public class Find_ {
    public static int main(String[] args) {
       int [] arr ={1,7,3,6,5,6};
       for(int i =0;i<arr.length;i++){
        int ans = sum(arr, i);
         if(ans>0)
            return ans;
       }
       return -1;
       
    }

    public static int sum(int[] arr, int i) {
        int n = arr.length;
        int lsum = 0, rsum = 0;
        if (i == 0)
            lsum = 0;
        else {
            for (int j = i - 1; j >=0; j--)
                lsum += arr[j];
        }
        if (i == n - 1)
            rsum = 0;
        else {
            for (int j = i + 1; j <n; j++)
                rsum = rsum + arr[j];
        }
        if (rsum == lsum)
            return i;
        return -1;
    }
}