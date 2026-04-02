class Index{
    public static int thirdLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>first){
                first = arr[i];
            }
        }
        int second = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i]>second&&arr[i]<first){
                second = arr[i];
            }
        }
        int third = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>third&&arr[i]<second){
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args){
        int[] arr = {2,4,5,6,10,100,-1,-2};
        int third = thirdLargest(arr);
        System.out.println("third largest: "+third);
    }
}