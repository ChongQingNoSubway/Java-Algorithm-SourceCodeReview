package HeapGraphSearchAlgorithm;

public class BestFirstSearch {
    // dijkstra's Algorithm
    // usages: find the shortest path const from a single node (such  node) to any other nodes in
    // that graph
    // data structure : priority_queue(MIN_HEAP)

    //properties
    // one node can be expanded once and only once.
    // one node can be generated more than once.
    // all the cost of the node that are expanded are monotonically non-decreasing .
    //time complexity, for a graph with n node and the connectivity of the node is
    // when a node popped out for expansion, its value is fixed which is equal to the shortest distance
    // from the start node.





    //question: given a martix N*N, and for each row the elements are stored in an ascending order,
    //and for each column the element are also sorted in an ascending order.
    // how find k-th smallest element in it?

    // Solution:
    // 1. initial state
    // 2. node expansion / generation rule
    // 3. termination condition. when the k-th element is poped out of the p_queue

    // there are k iterations
    // for each iteration, we need to pop an element out of the p-queue for expansion
    // generate at most two neighbors.
    // heap.insert(neighbor)  time = O(3klogk) = O(klogk)
    // space = O(k)


}
