//package HeapGraphSearchAlgorithm;
//
//public class guide {
//}



// heap is also call priority queue
// Heap is an unsorted array but have special rules to follow

// 任意节点小于它的所有后裔，最小元素在堆的根上
// 堆总是一个complete tree
// 将跟节点最大的堆叫做max heap. 根节点最小的堆叫做 min heap
// index of Left child = index of parent X2+1
// index of Right child = index of parent x2+2
// unsorted but  follow rules above

// insert O(logn)
// update O(logn)
// get/top O(1)
// pop O(log n)
// heapify O(n)


//Graph
//1.Breadth-First search(BFS-1)
//
//Class GraphNode{
//    int value;
//    string name;
//    ...
//    vector<GraphNode> successors;
//}


