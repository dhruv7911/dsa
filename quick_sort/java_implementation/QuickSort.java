public class QuickSort{
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<=high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static void main(String[] args){
        int[] arr ={1,3,4,2,0,-1};
        quicksort(arr,0,arr.length-1);
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println("");
    }
}