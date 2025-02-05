
import java.util.Stack;

public class validparanthasis3 {
    public boolean isValid(String s){
        @SuppressWarnings("Convert2Diamond")
        Stack<Character> stack = new Stack<Character>();

        for(char c  : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if (c == '{') {
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else{
                if(stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Is the input string valid? " + (input));
    }
}
