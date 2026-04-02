import java.util.Arrays;

class Index{
    public static void main(String[] args){
        int[] array = {7,1,2,3,4,5,6,7,7};
        Arrays.sort(array);
        int len = array.length;
        for(int i = len-2;i>=0;i--){
            if(array[i]!=array[len-1]){
                System.out.println("Second largest: "+array[i]);
                return;
            }
        }
        
    }
}