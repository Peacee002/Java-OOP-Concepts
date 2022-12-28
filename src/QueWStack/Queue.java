package QueWStack;

import java.util.Stack;

public class Queue {


    static class Queue1{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        static void enQueue(Integer x){
            while(!s1.empty()){
                s2.push(s1.pop());
            }

            s1.push(x);

            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }
        static int deQueue(){
            if(s1.empty()){
                System.out.println("queue is empty");
                System.exit(0);
            }
                int x = s1.peek();
                s1.pop();
                return x;
        }
    }

    public static void main(String[] args) {
        Queue1 que = new Queue1();
        que.enQueue(1);
        que.enQueue(2);
        que.enQueue(3);

        System.out.println(que.deQueue());
        System.out.println(que.deQueue());
        System.out.println(que.deQueue());
    }
}
