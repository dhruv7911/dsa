class Index{
    public static void rotate(int[] arr,int times){
        int l = arr.length;
        for(int i = 0;i<times;i++){
            int first = arr[0];
            for(int j = 0;j<l-1;j++){
                arr[j]=arr[j+1];
            }
            arr[l-1]=first;
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7,8};
        int times = 2;
        rotate(arr,times);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}