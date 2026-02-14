public class Palindrome{
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Is string aba is palindrome: "+isPalindrome("aba"));
        System.out.println("Is string abcd is palindrome: "+isPalindrome("abcd"));
    }
}