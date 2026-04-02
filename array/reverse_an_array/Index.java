import java.util.Arrays;
class Index{
    public static void reverse_arr(int[] arr){
        int left =0,right = arr.length-1;
        while(left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            //Increment the left pointer
            left++;
            //Decrement the right pointer
            right--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        reverse_arr(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}