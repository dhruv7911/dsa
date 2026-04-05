class Index{
    public static void rotate(int[] arr,int d){
        int l = arr.length;
        d = d%l;// incase d is greater then n;
        int[] temp = new int[l];
        for(int i =0;i<l-d;i++){
            temp[i]=arr[d+i];
        }
        for(int i = 0;i<d;i++){
            temp[l-d+i]=arr[i];
        }
        for(int i = 0;i<l;i++){
            arr[i]=temp[i];
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