package QueueStackLinkList;

//question2 how to implement the min() function when using stack with time complexityO(1);

// stack 1 ||
// stack 2 ||

//solution : keep the add() and remove() is sync between stack1 and stack2
// how to optimize the space usage of stack 2 assumptions there are a lot of duplicate elements in stack1
//Rule1: try to make the element in stack2 a descending order
// and store an Element in stack2 in the format of  Element in stack 2
// Stack2 = <value, size of the stack when element is added to stack2>

// How to sort numbers with three (or two) stacks(taught in class 1)
// S1 || 1 3 2 4
// S2 ||             global_min = every time push into stack2 then compare new and old
// Solution 2 : while (stack.top()>= global_min)

//follow up: what if there are duplicate element????
//

public class minUsingStack {
}
