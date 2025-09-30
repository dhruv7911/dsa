import java.util.Stack;

public class Index{
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return true;
                }
                char top = st.peek();
                if((c==']'&&top!='[')||(c=='}'&&top!='{')||(c==')'&&top!='(')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        String str = "([])()";
        System.out.println(isValid(str)?true:false);
    }
}