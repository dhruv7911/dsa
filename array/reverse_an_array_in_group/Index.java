class Index{
    public static void reverse_group(int[] arr,int k){
        int len = arr.length;
        for(int i = 0;i<len;i+=k){
            int left = i;
            int right = Math.min(i+k-1,len-1);
            while(left<right){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                right--;
                left++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7,8};
        int k = 2;
        reverse_group(arr,k);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}