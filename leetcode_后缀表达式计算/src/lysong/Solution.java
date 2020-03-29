package lysong;

import java.util.Stack;

/**
 * 计算逆波兰式（后缀表达式）的值
 * 运算符仅包含"+","-","*"和"/"，被操作数可能是整数或其他表达式
 * 例如：
 *   ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9↵  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * @Author: LySong
 * @Date: 2020/3/26 20:39
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        String s;
        Stack<Integer> num = new Stack<>();
        Integer num1;
        Integer num2;
        Integer ans;
        for (int i = 0; i < tokens.length; i++) {
            s = tokens[i];
            if(s.equals("+")){
                num1 = num.pop();
                num2 = num.pop();
                ans = num2 + num1;
                num.push(ans);
            }else if(s.equals("-")){
                num1 = num.pop();
                num2 = num.pop();
                ans = num2 - num1;
                num.push(ans);
            }else if(s.equals("*")){
                num1 = num.pop();
                num2 = num.pop();
                ans = num2 * num1;
                num.push(ans);
            }else if(s.equals("/")){
                num1 = num.pop();
                num2 = num.pop();
                ans = num2 / num1;
                num.push(ans);
            } else {
                num.push(Integer.parseInt(s));
            }
        }
        return num.pop();
    }
}
