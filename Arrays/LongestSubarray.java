public class LongestSubarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,1,1,4,2,3};
        int t = 3;
        int longest =0;
        int n = arr.length;
        int sum =0;
        for(int i =0;i<n;i++){
            sum =0;
            for(int j =i;j<n;j++){
                sum = sum+arr[j];
                if( sum == t){
                    longest  = Math.max(longest, j-i+1);
                }
            }
        }
        System.out.println(longest);
    }
}
