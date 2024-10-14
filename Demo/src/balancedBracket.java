import java.util.*;
public class balancedBracket {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bracket for matching");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
    
}
