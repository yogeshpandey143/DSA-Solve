package StackQueue;
import java.util.*;
public class InBuildExample {



    public static void main(String[] args) {

      // stack inbuild functions
     Stack<Integer> st = new Stack<>();
        st.push(32);
        st.push(42);
        st.push(22);
        st.push(54);
        st.push(75);

        st.pop();


        //queue inbuiild functions

        // queue is an interface

        Queue<Integer> queue = new LinkedList<>();

        queue.add(323);
        queue.add(43);
        queue.add(54);

        System.out.println(queue.remove());


        // dequeue

        Deque<Integer> deq= new ArrayDeque<>();
        deq.add(43);
        deq.addFirst(443); // insert in fisrt
        deq.addLast(64);// insert in last
        deq.removeFirst();
        deq.removeLast();





    }

}
