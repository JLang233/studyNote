package club.banyuan;

import java.util.Stack;//java中的栈
/*
Stack是一种后进先出（LIFO）的结构，其继承了Vector的基础上拓展5个方法push()、pop()、peek()、empty()、search()而来

 1、push(E):将item推入到栈中

 2、pop() :将栈中的最顶一个item推出，并返回被推出的item

 3、peek():返回栈中最顶的一个item，但不对其做任何操作

 4、empty():判断该栈是否为空

 5、search(Object):搜索某一个item在该栈中的位置【位置为离栈顶最近的item与栈顶间距离】

 */



public class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> op = new Stack<>();//新建一个栈
        String temp = "";
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c == ')'){
                while(op.peek() != '('){
                    temp = op.pop() + temp;
                }
                op.pop();
                char operation = op.pop();
                op.push(isBool(temp, operation));
                temp = "";
            } else if(c != ','){
                op.push(c);
            }
        }
        if(op.peek() == 't'){
            return true;
        }
        return false;
    }
    public char isBool(String s, char op){
        if(op == '!'){
            if(s.equals("f")){
                return 't';
            }else{
                return 'f';
            }
        }else if(op == '|'){
            if(s.indexOf('t') != -1){
                return 't';
            }else{
                return 'f';
            }
        }else if(op == '&'){
            if(s.indexOf('f') != -1){
                return 'f';
            }else{
                return 't';
            }
        }
        return 'f';

    }
}
