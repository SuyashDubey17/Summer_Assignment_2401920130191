import java.util.*;

class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String curr = "";
        
        int num = 0;

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }
            else if(ch == '['){
                countStack.push(num);
                stringStack.push(curr);
                num = 0;
                curr = "";
            }
            else if(ch == ']'){
                int times = countStack.pop();
                String prev = stringStack.pop();

                StringBuilder temp = new StringBuilder(prev);

                for(int j = 0; j < times; j++){
                    temp.append(curr);
                }

                curr = temp.toString();
            }
            else{
                curr += ch;
            }
        }

        return curr;
    }
}
