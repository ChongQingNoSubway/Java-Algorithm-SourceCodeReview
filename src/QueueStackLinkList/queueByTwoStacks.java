package QueueStackLinkList;

// how could we implement a queue by using two stacks?
// solution :
// stack 1 :To buffer all new elements. - push(x) goes to stack 1
// stack 2 :To pop out the 1st elements
// case 2.1  if stack 2 is empty, then we move all the element from stack1 to stack2 one by one.
// then pop the top element from stack2.
// case 2.2  if stack2 is not empty, then we call stack2.pop()
// Time complexity : push() -> O(1)    so tc =  O(1)
//                   Pop() -> O(n)
//    Amortize time complexity = O(1)
// 1st time call pop() n(pop from Stack1) + n(push to Stack2) + 1(pop from stact 2) = 2n + 1
// 2st time call pop() 1

import java.util.Stack;

public class queueByTwoStacks{
    Stack<Integer> s1,s2;

    public queueByTwoStacks() {
        s1 = new Stack();
        s2 = new Stack();
    }

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {
        if(s2.isEmpty()){
            if(s1.isEmpty()) return -1;
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

}
