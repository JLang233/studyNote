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
        String temp = "";//当前字符串
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);//.char是字符串中的一个方法，获取位置i的字符
            if(c == ')'){
                while(op.peek() != '('){
                    temp = op.pop() + temp;
                }
                op.pop();
                char operation = op.pop();
                op.push(isBool(temp, operation));//判断
                temp = "";//置空
            } else if(c != ','){
                op.push(c);
            }
        }
        if(op.peek() == 't'){
            return true;
        }
        return false;
    }

    //传入op为判断符号，判断传入字符串s，返回字符结果
    public char isBool(String s, char op){
        if(op == '!'){
            if(s.equals("f")){
                //equals() 方法用于将字符串与指定的对象比较，相等返回ture。
                return 't';
                //"!"取反
            }else{
                return 'f';
            }
        }else if(op == '|'){
            if(s.indexOf('t') != -1){
                // indexOf(int ch)，返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
                //对于"|"或运算,只要有一个t，则返回t
                return 't';
            }else{
                return 'f';//没有t（全为f），返回f
            }
        }else if(op == '&'){
            if(s.indexOf('f') != -1){
                //对于"&"与运算，只要有一个f，则返回f
                return 'f';
            }else{
                return 't';//没有f（全为t），返回t
            }
        }
        return 'f';

    }
}
