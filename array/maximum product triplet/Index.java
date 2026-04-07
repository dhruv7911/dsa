import java.util.Arrays;
public class Index{
    public static int Maxproduct(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1],arr[n-3]*arr[n-2]*arr[n-1]);

    }
    public static void main(String[] args){
        int[] arr = {1,112,3,4,5,6,7,-10,-10,111};
        int result = Maxproduct(arr);
        System.out.println("result: "+result);
    }
}