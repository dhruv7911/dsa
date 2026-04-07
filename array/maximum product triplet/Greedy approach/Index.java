class Index{
    
        public static int Maxproduct(int[] arr){
            int n = arr.length;
            int MaxA=Integer.MIN_VALUE, MaxB=Integer.MIN_VALUE, MaxC=Integer.MIN_VALUE;
            int MinA=Integer.MIN_VALUE, MinB=Integer.MIN_VALUE;

            for(int i = 0;i<n;i++){

                //update Maximum MaxA, MaxB, MaxC
                if(arr[i]>MaxA){
                    MaxC = MaxB;
                    MaxB = MaxA;
                    MaxA = arr[i];
                }else if(arr[i]>MaxB){
                    MaxC = MaxB;
                    MaxB = arr[i];
                }else if(arr[i]>MaxC){
                    MaxC = arr[i];
                }

                //update MinA,MinB
                if(arr[i]<MinA){
                    MinB = MinA;
                    MinA = arr[i];
                }else if(MinB<arr[i]){
                    MinB = arr[i];
                }
            }
            return Math.max(MinA*MinB*MaxA,MaxC*MaxB*MaxA);

            
        }
    public static void main(String[] args){
        int[] arr = {1,112,3,4,5,6,7,-10,-10,111};
        int result = Maxproduct(arr);
        System.out.println("result: "+result);
    }
}