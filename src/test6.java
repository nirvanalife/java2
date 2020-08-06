import java.util.Stack;

public class test6 {
//    用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
//    思路：push一个新元素：先把stack2的依次弹出压入stack1，然后把新元素压入，最后再把stack1弹出压入stack2
//           pop直接弹出stack2
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }

    }

    public static int pop() {
        return stack2.pop();

    }

    public static void main(String []arg){
        push(3);
        push(5);

        System.out.println(stack2);


    }

}
